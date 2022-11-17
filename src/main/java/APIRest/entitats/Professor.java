package APIRest.entitats;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Professor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nomP;
	private String cognomP;
	private String emailP;
	private boolean teDoctorat;
}
