package sopra.doctovid.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Administrateur")
public class Admin extends Utilisateur{

}
