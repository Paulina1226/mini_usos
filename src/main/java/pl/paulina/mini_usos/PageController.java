package pl.paulina.mini_usos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/home", produces="mini_usos/json")
public class PageController {
    @RequestMapping("/")
    @ResponseBody
    public String mainPage() {
        return "Hello world!";
    }
 
    @RequestMapping("/hello")
    @ResponseBody
    public String pageTwo() {
        return "Hi!";
    }
}