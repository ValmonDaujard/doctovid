package sopra.doctovid;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import sopra.doctovid.model.Civilite;
import sopra.doctovid.model.Patient;
import sopra.doctovid.model.Praticien;
import sopra.doctovid.model.Rdv;
import sopra.doctovid.model.Specialite;
import sopra.doctovid.persitence.IPatientRepository;
import sopra.doctovid.persitence.IPraticienRepository;
import sopra.doctovid.persitence.IRdvRepository;

@SpringBootTest
public class Test1 {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	@Autowired
	private IRdvRepository rdvRepo;
	@Autowired
	private IPraticienRepository praticienRepo;
	@Autowired
	private IPatientRepository patientRepo;
//	@Autowired
//	private IMotifRepository motifRepo;

	@Test
	public void test() throws ParseException {

		Patient patient1 = new Patient("Doe", "John", Civilite.M, sdf.parse("15/05/2020"));
		patient1 = patientRepo.save(patient1);
		Praticien praticien1 = new Praticien("DUPONT", "Michel", Specialite.Généraliste);
		praticien1 = praticienRepo.save(praticien1);
		Rdv rdv1 = new Rdv(praticien1, patient1);
		rdv1 = rdvRepo.save(rdv1);

	}

}
