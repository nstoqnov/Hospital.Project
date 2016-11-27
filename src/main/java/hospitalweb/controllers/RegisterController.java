package hospitalweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;

@Controller
public class RegisterController {
    @RequestMapping("/register")
    public String register(Model model){
        return "register";
    }
    @RequestMapping("/docreg")
    public String docreg(Model model){
        return "docreg";
    }
    @RequestMapping("/pacreg")
    public String pacreg(Model model){
        return "pacreg";
    }
}
