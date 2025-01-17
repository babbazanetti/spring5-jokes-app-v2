package guru.springframework.spring5jokesappv2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5jokesappv2.services.JokeService;

/**
 * @author strivel ► 27.07.2021.
 *
 */
@Controller
public class JokeController {

	private final JokeService jokeService;

	@Autowired
	public JokeController(JokeService jokeService) {
		this.jokeService = jokeService;
	}
	
	@RequestMapping({"/", ""})
	public String showJoke(Model model) {
		
		model.addAttribute("joke", jokeService.getjoke());
		
		return "index";
	}
}

