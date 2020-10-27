package sopra.doctovid.persitence;

import org.springframework.data.jpa.repository.JpaRepository;

import sopra.doctovid.model.Motif;

public interface IMotifRepository extends JpaRepository<Motif, Long> {

}
