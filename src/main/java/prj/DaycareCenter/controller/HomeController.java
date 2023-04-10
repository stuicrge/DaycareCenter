package prj.DaycareCenter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


    /*
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(@RequestParam("name") String name, Model model){
        model.addAttribute("name", name);
        return "home";
    }
    */
    @RequestMapping ("/")
    public String home(){
        return "home";
}
    @RequestMapping("/login.html")
    public String login(){
        return "login";
    }

    @RequestMapping("/search.html")
    public String search(){
        return "search";
    }




}