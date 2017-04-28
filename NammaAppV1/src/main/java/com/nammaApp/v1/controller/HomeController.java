package com.nammaApp.v1.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
		@RequestMapping(value="/home.go", method = RequestMethod.GET ,produces = "text/html;charset=UTF-8")
		public String testHome(){
			System.out.println("Entered testHome");
			return "index";
		}
}
