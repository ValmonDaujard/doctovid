package sopra.doctovid.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sopra.doctovid.model.Creneau;

public interface ICreneauRepository extends JpaRepository<Creneau, Long>{

	//Liste des creneaux par Rdv
	@Query("select c from Creneau c where c.rdv.id = :id")
	List<Creneau> findCreneauxByRdv(@Param("id") Long id);
	
	
}
