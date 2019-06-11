package ua.itea;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user") //JSP - NAME
public class UserController {

   @RequestMapping(method = RequestMethod.GET)
   public String printHello() {
     //ModelMap model
      //model.addAttribute("msg", "Spring MVC");//Var name in JSP
      return "user";//JSP NAME
   }
}
