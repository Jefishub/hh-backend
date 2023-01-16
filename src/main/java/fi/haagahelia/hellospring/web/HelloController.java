package fi.haagahelia.hellospring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {

	@RequestMapping("/index")
	public String index() {
		return "This is the main page";
	}
	
	@RequestMapping("/contact")
	public String contact() {
		return "This is the contact page";
	}
	
	@RequestMapping("/hello")
	@ResponseBody
	public String welcome(@RequestParam(name="name", required=false, defaultValue="John Doe") String name,
			@RequestParam(name="location", required=false, defaultValue="Special Place") String location) {
		return "Welcome to the " + location + " " + name + " !";
	}
	
	/*		
	@RequestMapping("/about")
	public String about() {
		return "This is the about page";
	}
	
	@RequestMapping("/moikkaa")
	@ResponseBody
	public String sayHelloToSomeone(@RequestParam(name="nimesi", required=false, defaultValue="Muumi") String nimi,
			@RequestParam(name="ika", required=false, defaultValue="1") int age) {
		return "Hei " + nimi + " " + age + " vuotta.";
	}
	 */
}
