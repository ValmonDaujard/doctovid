package sopra.doctovid.persitence;

import org.springframework.data.jpa.repository.JpaRepository;

import sopra.doctovid.model.Admin;

public interface IAdminRepository extends JpaRepository<Admin, Long> {

}
