package APIRest.entitats;

import javax.persistence.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Aula {

	private int numero;
	private int capacitat;
}
