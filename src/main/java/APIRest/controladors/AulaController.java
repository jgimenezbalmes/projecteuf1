package APIRest.controladors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import APIRest.entitats.Aula;
import APIRest.repositoris.AulaRepositori;


@RestController
@RequestMapping("api")
public class AulaController {

		@Autowired
		AulaRepositori aulaRep;
		
		@GetMapping("aules")
		public Iterable<Aula> getAules() {
			return aulaRep.findAll();
		}
		
		@GetMapping("aules/{id}")
		public Aula getAula(@PathVariable long id) {
			Aula aula = aulaRep.findById(id).get();
			return aula;
		}
	
}
