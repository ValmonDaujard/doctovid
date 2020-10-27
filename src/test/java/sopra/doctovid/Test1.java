package sopra.doctovid;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import sopra.doctovid.model.Admin;
import sopra.doctovid.model.Creneau;
import sopra.doctovid.model.LieuConsult;
import sopra.doctovid.model.Motif;
import sopra.doctovid.persistence.IAdminRepository;
import sopra.doctovid.persistence.ICreneauRepository;
import sopra.doctovid.persistence.ILieuConsultRepository;
import sopra.doctovid.persistence.IMotifRepository;
import sopra.doctovid.persistence.IPatientRepository;
import sopra.doctovid.persistence.IPraticienRepository;
import sopra.doctovid.persistence.IRdvRepository;

@SpringBootTest
public class Test1 {

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
	public void test(){
		
		Admin admin1 = new Admin();
		admin1.setMail("admin@mail.fr");
		admin1.setMdp("oui");
		
		admin1 = adminRepo.save(admin1);
		
		Creneau creneau1 = new Creneau(new Date(), true);
		
		creneau1 = creneauRepo.save(creneau1);
		
		LieuConsult lieu1 = new LieuConsult("cabinet");
		
		lieu1 = lieuConsultRepo.save(lieu1);
		
		Motif motif1 = new Motif(null, 2);
		
		motif1 = motifRepo.save(motif1);
		
	}

}
