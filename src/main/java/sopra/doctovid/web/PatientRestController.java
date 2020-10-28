package sopra.doctovid.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sopra.doctovid.persistence.IPatientRepository;

@RestController
@RequestMapping("/patient")
public class PatientRestController {
	
	@Autowired
	private IPatientRepository patientRepo;
	
	@GetMapping

}
