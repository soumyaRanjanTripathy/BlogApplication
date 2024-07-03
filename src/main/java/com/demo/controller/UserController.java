package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
 @GetMapping("/")
 public String shows() {
	return "login";
	 
 }
 @GetMapping("/r")
 public String show() {
	return "register";
	 
 }
}
