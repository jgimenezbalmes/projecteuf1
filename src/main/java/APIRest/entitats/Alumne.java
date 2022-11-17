package APIRest.entitats;

import java.time.LocalDate;

import javax.persistence.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Alumne {
	private String nom;
	private String cognom1;
	private String cognom2;
	private String dni;
	private String email;
	private LocalDate naixement;
	private boolean familiaNombrosa;
}
