package sopra.doctovid.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import sopra.doctovid.model.LieuConsult;

public interface ILieuConsultRepository extends JpaRepository<LieuConsult, Long>{

}
