package com.coding_dojo.Daikichi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class welcome {
	@RequestMapping("")
    public String wel(){
      return "Welcome!";
    }
	
	@RequestMapping("/today")
    public String tod(){
      return "Today you will find luck in all your endeavors!";
    }
	
	@RequestMapping("/tomorrow")
    public String tom(){
      return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
    }
}
