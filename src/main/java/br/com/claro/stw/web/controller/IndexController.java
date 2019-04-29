package br.com.claro.stw.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	public IndexController() throws Exception {
		super();
	}

	@GetMapping("/index")
	public String main(Model model) {
		model.addAttribute("latitude", "51.508742");
		model.addAttribute("longitude", "-0.120850");
		

		return "index"; // view
	}
	
	@GetMapping("/posicao")
	public String posicao(Model model) {
		return "posicao"; // view
	}
	
	
	@GetMapping("/index/posicao")
	public String posicao(final String latitude, final String longitude , Model model) {
		
		model.addAttribute("latitude", latitude);
		model.addAttribute("longitude", longitude);
		
		return "index"; // view
	}
	
	
}
