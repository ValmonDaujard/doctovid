package sopra.doctovid.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sopra.doctovid.model.Rdv;

public interface IRdvRepository extends JpaRepository<Rdv, Long>{

	//Histo des rdvs par patient
	@Query("select r from Rdv r join r.creneaux cr where cr.date > current_date and r.patient.id = :id")
	List<Rdv> findAllByPatientAndPasses(@Param("id") Long id);
	
	//Histo des rdvs par patient
	@Query("select r from Rdv r join r.creneaux cr where cr.date < current_date and r.patient.id = :id")
	List<Rdv> findAllByPatientPlanifies(@Param("id") Long id);
}

