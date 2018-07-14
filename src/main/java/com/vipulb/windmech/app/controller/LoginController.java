package com.vipulb.windmech.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vipulb.windmech.app.beans.TraceUser;
import com.vipulb.windmech.app.service.TraceUserService;

@RestController
@RequestMapping("/api")
public class LoginController {

	private TraceUser currentUser;
	
	@Autowired
	private TraceUserService traceUserService;
	
	@RequestMapping("/login/{username}/{password}")
	public TraceUser login(@PathVariable String username, @PathVariable String password){
		currentUser = traceUserService.getLoginDetails(username, password);
		return currentUser;
	}
}
