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
	
	@Query("select p from Praticien p where p.nom = :nom")
	List<Praticien> findAllByNom(@Param("nom") String nom);
	
	@Query("select p from Praticien p join p.mesLieux lieu join lieu.adresse adr where adr.ville = :ville")
	List<Praticien> findAllByLieu(@Param("ville") String ville);
	
	@Query("select p from Praticien p join p.mesLieux lieu join lieu.adresse adr where p.nom = :nom and adr.ville = :ville")
	List<Praticien> findAllByNomAndLieu(@Param("nom") String nom, @Param("ville") String ville);
	
//	@Query("select p from Praticien p where p.nom = :nom and p.specialite = :specialite")
//	List<Praticien> findAllByNomAndLieu(@Param("nom") String nom, @Param("specialite") Specialite specialite);
	
//	@Query("select p from Praticien p join p.mesLieux lieu join lieu.adresse adr where p.nom = :nom and p.specialite = :specialite and adr.ville = :ville")
//	List<Praticien> findAllByNomAndSpecialiteAndLieu(@Param("nom") String nom, @Param("specialite") Specialite specialite, @Param("ville") String ville);

}
