package com.coding_dojo.Hopper.example;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
@Controller
public class Hopper {

	// class definition and imports here...
    @RequestMapping("/")
    public String index(Model model) {
        
        String name = "Grace Hopper";
        String itemName = "Copper wire";
        double price = 5.25;
        String description = "Metal strips, also an illustration of nanoseconds.";
        String vendor = "Little Things Corner Store";
    
    	// Your code here! Add values to the view model to be rendered
        model.addAttribute("first",name);
        model.addAttribute("item",itemName);
        model.addAttribute("num",price);
        model.addAttribute("desc",description);
        model.addAttribute("ven",vendor);
        
        return "index.jsp";
    }
    //...
    

}