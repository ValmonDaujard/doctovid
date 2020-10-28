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

import sopra.doctovid.model.LieuConsult;
import sopra.doctovid.model.Views;
import sopra.doctovid.persistence.ILieuConsultRepository;

@RestController
@RequestMapping("/lieuConsult")
@CrossOrigin("*")
public class LieuConsultRestController {

	@Autowired
	private ILieuConsultRepository lieuConsultRepo;
	
	@GetMapping("")
	@JsonView(Views.ViewLieuConsult.class)
	public List<LieuConsult> findAll() {
		return lieuConsultRepo.findAll();
	}
	
	@GetMapping("/{id}")
	@JsonView(Views.ViewLieuConsult.class)
	public LieuConsult find(@PathVariable Long id) {

		Optional<LieuConsult> optLieuConsult =lieuConsultRepo.findById(id);

		if (optLieuConsult.isPresent()) {
			return optLieuConsult.get();
		} else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Unable to find resource");
		}
	}
	
	
	
	@PostMapping("")
	public LieuConsult create(@RequestBody LieuConsult lieuConsult) {
		lieuConsult = lieuConsultRepo.save(lieuConsult);

		return lieuConsult;
	}
	

	@PutMapping("/{id}")
	@JsonView(Views.ViewLieuConsult.class)
	public LieuConsult update(@RequestBody LieuConsult lieuConsult, @PathVariable Long id) {
		if (!lieuConsultRepo.existsById(id)) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Unable to find resource");
		}

		lieuConsult = lieuConsultRepo.save(lieuConsult);

		return lieuConsult;
	}
	
	@DeleteMapping("/{id}")
	public void delete (@PathVariable Long id) {
		lieuConsultRepo.deleteById(id);
	}
	
}
