package sopra.doctovid.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.fasterxml.jackson.annotation.JsonView;

import sopra.doctovid.model.Patient;
import sopra.doctovid.model.Views;
import sopra.doctovid.persistence.IPatientRepository;

@RestController
@RequestMapping("/patient")
@CrossOrigin("*")
public class PatientRestController {
	
	@Autowired
	private IPatientRepository patientRepo;
	
	@GetMapping
	@JsonView(Views.ViewPatient.class)
	public List<Patient> findAll(){
		return patientRepo.findAll();
	}
	
	@GetMapping("/{id}")
	@JsonView(Views.ViewPatient.class)
	public Patient find(@PathVariable Long id) {

		Optional<Patient> optPatient = patientRepo.findById(id);

		if (optPatient.isPresent()) {
			return optPatient.get();
		} else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Unable to find resource");
		}
	}
	
	@PostMapping("")
	public Patient create(@RequestBody Patient patient) {
		patient = patientRepo.save(patient);

		return patient;
	}
	
	@PutMapping("/{id}")
	@JsonView(Views.ViewPatient.class)
	public Patient update(@RequestBody Patient patient, @PathVariable Long id) {
		if (!patientRepo.existsById(id)) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Unable to find resource");
		}

		patient = patientRepo.save(patient);

		return patient;
	}
	
	@DeleteMapping("/{id}")
	public void delete (@PathVariable Long id) {
		patientRepo.deleteById(id);
	}

}
