package Controller;


import model.Pudge;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/pudgeservice")
public class PudgeController {

    @RequestMapping(method = RequestMethod.GET, value = "/{name}")
    @ResponseBody
    public Pudge getPudge(@PathVariable String name) {
        Pudge pudge = new Pudge(name, 12);
        return pudge;
    }


    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public void addPudge(@RequestBody Pudge pudge) {
        System.out.println(pudge);
    }


     @RequestMapping(method = RequestMethod.DELETE, value = "/remove")
    public void removePudge(@RequestBody Pudge pudge) {

        System.out.println(pudge + " DELETED");
    }




}
