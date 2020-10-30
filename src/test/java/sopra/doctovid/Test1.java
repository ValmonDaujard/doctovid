package sopra.doctovid;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import sopra.doctovid.model.Admin;
import sopra.doctovid.model.Adresse;
import sopra.doctovid.model.Civilite;
import sopra.doctovid.model.Creneau;
import sopra.doctovid.model.LieuConsult;
import sopra.doctovid.model.Motif;
import sopra.doctovid.model.Patient;
import sopra.doctovid.model.Praticien;
import sopra.doctovid.model.Rdv;
import sopra.doctovid.model.Specialite;
import sopra.doctovid.model.Type;
import sopra.doctovid.persistence.IPatientRepository;
import sopra.doctovid.persistence.IPraticienRepository;
import sopra.doctovid.persistence.IRdvRepository;
import sopra.doctovid.persistence.IAdminRepository;
import sopra.doctovid.persistence.ICreneauRepository;
import sopra.doctovid.persistence.ILieuConsultRepository;
import sopra.doctovid.persistence.IMotifRepository;

@SpringBootTest
public class Test1 {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	@Autowired
	private IAdminRepository adminRepo;
	@Autowired
	private ICreneauRepository creneauRepo;
	@Autowired
	private ILieuConsultRepository lieuConsultRepo;
	@Autowired
	private IMotifRepository motifRepo;
	@Autowired
	private IPatientRepository patientRepo;
	@Autowired
	private IPraticienRepository praticienRepo;
	@Autowired
	private IRdvRepository rdvRepo;

	
	@Test
	public void test() throws ParseException {

		Admin admin1 = new Admin();
		admin1.setMail("admin@mail.fr");
		admin1.setMdp("oui");
		
		LieuConsult lieu1 = new LieuConsult("cabinet");
		Adresse adr1 = new Adresse("8 rue du cabinet", null, "33700", "Merignac");
		lieu1.setAdresse(adr1);
		lieu1 = lieuConsultRepo.save(lieu1);
		
		LieuConsult lieu2 = new LieuConsult("Hopital");
		Adresse adr2 = new Adresse("8 rue de l'Hopital", null, "33700", "Merignac");
		lieu2.setAdresse(adr2);
		
		lieu2 =  lieuConsultRepo.save(lieu2);
		
		Creneau creneau1 = new Creneau(new Date(), true);
		creneau1.setLieuConsult(lieu1);
		
		Motif motif1 = new Motif(Type.PremierRendezVous, 2);
		
		motif1.setLieuConsult(lieu1);
		
		admin1 = adminRepo.save(admin1);
		motif1 = motifRepo.save(motif1);
		
		Patient patient1 = new Patient("Doe", "John", Civilite.M, sdf.parse("15/05/2020"));
		patient1 = patientRepo.save(patient1);
		Praticien praticien1 = new Praticien("DUPONT", "Michel", Specialite.Generaliste);
		praticien1 = praticienRepo.save(praticien1);
		Rdv rdv1 = new Rdv(praticien1, patient1);
		rdv1.addCreneau(creneau1);
		rdv1.setPraticien(praticien1);
		rdv1.setPatient(patient1);
		rdv1.setMotif(motif1);
		rdv1 = rdvRepo.save(rdv1);

		
		
		creneau1 = creneauRepo.save(creneau1);
		lieu1 = lieuConsultRepo.save(lieu1);
		
		praticien1.addLieu(lieu1);
		praticien1.addLieu(lieu2);
		praticien1.addRdv(rdv1);
		praticien1 = praticienRepo.save(praticien1);
		patient1.addRdv(rdv1);
		patient1 = patientRepo.save(patient1);
		
		creneau1.setLieuConsult(lieu1);
		creneau1.setRdv(rdv1);
		creneau1 = creneauRepo.save(creneau1);
		
		lieu1.addCreneau(creneau1);
		lieu1.addPraticien(praticien1);
		lieu1 = lieuConsultRepo.save(lieu1);
		
		rdv1.addCreneau(creneau1);
		rdv1.setMotif(motif1);
		rdv1 = rdvRepo.save(rdv1);
		
	}

}