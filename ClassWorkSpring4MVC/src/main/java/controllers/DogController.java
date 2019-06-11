package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Dog;

@Controller
@RequestMapping("/hello")
public class DogController {



	//http://localhost:8080/ClassWorkSpring4/hello/hello.htm
	@RequestMapping(value = "hello", method = RequestMethod.GET)
	public String name(ModelMap modelMap) {

		Dog dog = new Dog("Pol", 3);
		modelMap.addAttribute("dog", dog);
		
		return "hello";
	}



	//http://localhost:8080/ClassWorkSpring4/hello/test.htm
	@RequestMapping(value = "test", method = RequestMethod.GET)
	public String test() {

		return "test";

	}

}
