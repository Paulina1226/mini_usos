package pl.paulina.mini_usos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import pl.paulina.mini_usos.Przedmioty;
import pl.paulina.mini_usos.PrzedmiotyRepository;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/przedmioty") // This means URL's start with /demo (after Application path)
public class MainController {
	@Autowired // This means to get the bean called userRepository
	           // Which is auto-generated by Spring, we will use it to handle the data
	private PrzedmiotyRepository userRepository;

	@GetMapping(path="/add") // Map ONLY GET Requests
	public @ResponseBody String addNewUser (@RequestParam String name) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		Przedmioty n = new Przedmioty();
		n.setName(name);
		userRepository.save(n);
		return "Saved";
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<Przedmioty> getAllUsers() {
		// This returns a JSON or XML with the users
		return userRepository.findAll();
	}
}