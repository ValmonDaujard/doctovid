package sopra.doctovid.web;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sopra.doctovid.model.Civilite;
import sopra.doctovid.model.Specialite;
import sopra.doctovid.model.Type;



@RestController
@RequestMapping ("/api")
@CrossOrigin("*")
public class CommonRestController {
	
	@GetMapping("/civilites")
	public Civilite[] getCiviltes() {
		return Civilite.values();
	}
	
	@GetMapping("/specialite")
	public Specialite[] getSpecialites() {
		return Specialite.values();
	}
	
	@GetMapping("/types")
	public Type[] getTypes() {
		return Type.values();
	}

}
