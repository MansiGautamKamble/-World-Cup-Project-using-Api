package com.worldcup.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorldcupCricketController {
	
	@GetMapping("/worldcup")	
	public String TestApi() {
		
		
		return "Test Api";
		
	}

}
