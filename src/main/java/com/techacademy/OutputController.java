package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class OutputController {


    @PostMapping("/output")
    public String postOutput(@RequestParam("val") String val, Model model) {
        model.addAttribute("val", val);
        return "output";
    }

   // @GetMapping("/input")
   // public String getInput(String val, Model model) {
       // model.addAttribute("val", val);
       // return "input";
   // }

}
