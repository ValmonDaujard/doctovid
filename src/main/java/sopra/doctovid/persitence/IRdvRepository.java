package sopra.doctovid.persitence;

import org.springframework.data.jpa.repository.JpaRepository;

import sopra.doctovid.model.Rdv;

public interface IRdvRepository extends JpaRepository<Rdv, Long>{

}