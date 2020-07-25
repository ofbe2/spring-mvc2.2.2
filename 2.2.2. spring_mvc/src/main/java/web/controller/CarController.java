package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {


    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam String locale) {
        String tit = null;
        if (locale.contains("en")) {
            tit = "CARS";
        }else if (locale.contains("ru")){
            tit = "МАШИНЫ";
        }
        List<String> messages = new ArrayList<>();
        messages.add("Lexus");
        messages.add("Mazda");
        messages.add("Honda");
        model.addAttribute("messages", messages);
        model.addAttribute("tit", tit);
        return "cars";
    }
}
