package APIRest.controladors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import APIRest.entitats.Alumne;
import APIRest.repositoris.AlumneRepositori;

@RestController
@RequestMapping("api")
public class AlumneController {

		@Autowired
		AlumneRepositori alumneRep;
		
		@GetMapping("alumnes")
		public Iterable<Alumne> getAlumnes() {
			return alumneRep.findAll();
		}
		
		@GetMapping("alumnes/{id}")
		public Alumne getAlumne(@PathVariable long id) {
			Alumne alumne = alumneRep.findById(id).get();
			return alumne;
		}
	
}
