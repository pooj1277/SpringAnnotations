package com.bridgelabz.MessagingApp;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/hello")
public class HelloRestController {
	@RequestMapping(value = {"", "/", "/home"})
	public String sayHello() { 
		return "Hello From BridgeLabz!!!";
	}

	@RequestMapping(value = ("/query"), method = RequestMethod.GET) 
	public String sayHello(@RequestParam(value="name") String name) {
		return " Hello " +name + "!";
	}

//	@GetMapping("/param/{name}")
//	public String sayHelloParam(@PathVariable String name) {
//		return " Hello " + name + "!";
//	}

	@GetMapping("/param/{name}")
	public String sayHelloParam1(@PathVariable String name) {
		return " Hello " + name + " from Bridgelabz!";
	}
	@PostMapping("/post") 
	public String sayHello(@RequestBody User user) {
		return " Hello" +user.getFirstName() + "" + user.getLastName()+ "!";
	}
	
	@PutMapping("/put/{firstName}")
	public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
		return " Hello" + firstName + "" + lastName + "!";
	}

}
