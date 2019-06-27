package controllers;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@Controller
public class ProductController {


    private DbWorker dbWorker;

    @RequestMapping(method = RequestMethod.GET, value = "/product")
    public String getProduct(ModelMap modelMap) {
        Product product = new Product(1, "Whiskey", new BigDecimal("12345.99"));
        modelMap.addAttribute("code", product);


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("WEB-INF/sprincfg.xml");
        DbWorker dbWorker = (DbWorker) context.getBean("dbWorker");


        System.out.println(dbWorker);

        return "product";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/product", params = {"id"})
    public String getOtherProduct(ModelMap modelMap, @RequestParam String id) {
        Product product = new Product(1, "Whiskey", new BigDecimal("12345.99"));
        modelMap.addAttribute("code", product);
        modelMap.addAttribute("id", id);

        return "product";
    }




}
