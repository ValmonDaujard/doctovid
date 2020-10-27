package sopra.doctovid.persitence;

import org.springframework.data.jpa.repository.JpaRepository;

import sopra.doctovid.model.Patient;

public interface IPatientRepository extends JpaRepository<Patient, Long> {

}
