package sopra.doctovid.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import sopra.doctovid.model.Motif;

public interface IMotifRepository extends JpaRepository<Motif, Long> {

}
