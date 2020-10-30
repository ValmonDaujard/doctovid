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

import sopra.doctovid.model.Creneau;
import sopra.doctovid.model.Views;
import sopra.doctovid.model.Views.ViewCommon;
import sopra.doctovid.model.Views.ViewCreneau;
import sopra.doctovid.persistence.ICreneauRepository;


@RestController
@RequestMapping("/creneau")
@CrossOrigin("*")
public class CreneauRestController {
	
	@Autowired
	private ICreneauRepository creneauRepo;
	
	@GetMapping("")
	@JsonView(Views.ViewCreneau.class)
	public List<Creneau> findAll() {
		return creneauRepo.findAll();
	}
	
	@GetMapping("/{id}")
	@JsonView(Views.ViewCreneau.class)
	public Creneau find(@PathVariable Long id) {

		Optional<Creneau> optCreneau =creneauRepo.findById(id);

		if (optCreneau.isPresent()) {
			return optCreneau.get();
		} else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Unable to find resource");
		}
	}
	
	@GetMapping("/by-rdv/{id}")
	@JsonView(ViewCommon.class)
	public List<Creneau> findCreneauByRdv(@PathVariable Long id){
		return creneauRepo.findCreneauxByRdv(id);
	}
	
	
	@PostMapping("")
	public Creneau create(@RequestBody Creneau creneau) {
		creneau = creneauRepo.save(creneau);

		return creneau;
	}
	

	@PutMapping("/{id}")
	@JsonView(Views.ViewCreneau.class)
	public Creneau update(@RequestBody Creneau creneau, @PathVariable Long id) {
		if (!creneauRepo.existsById(id)) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Unable to find resource");
		}

		creneau = creneauRepo.save(creneau);

		return creneau;
	}
	
	@DeleteMapping("/{id}")
	public void delete (@PathVariable Long id) {
		creneauRepo.deleteById(id);
	}
	
	
}
