package sopra.doctovid.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sopra.doctovid.model.Praticien;
//import sopra.doctovid.model.Specialite;

public interface IPraticienRepository  extends JpaRepository<Praticien, Long>{
	
//	@Query("select p from Praticien p where p.specialite = :specialite")
//	List<Praticien> findAllBySpecialite(@Param("specialite") Specialite specialite);
	
	@Query("select p from Praticien p join p.mesLieux lieu join lieu.adresse adr where adr.ville = :ville")
	List<Praticien> findAllByLieu(@Param("ville") String ville);

}
