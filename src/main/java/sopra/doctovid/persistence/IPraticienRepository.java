package sopra.doctovid.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import sopra.doctovid.model.Praticien;

public interface IPraticienRepository  extends JpaRepository<Praticien, Long>{

	
}
