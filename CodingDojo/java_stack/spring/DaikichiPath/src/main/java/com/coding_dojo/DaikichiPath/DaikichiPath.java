package com.coding_dojo.DaikichiPath;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikich")
public class DaikichiPath {
		
	@RequestMapping("/travel/{Honolulu}")
    public String meth1(@PathVariable("Honolulu") String Honolulu){
    	return "Congratulation! You will soon travel to " + Honolulu ;
    }
	
	@RequestMapping("/lotto/{num}")
	public String meth2(@PathVariable("num") Integer num ){
		if (num %2 ==0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers.";
		}
		else if (num %2 ==1) {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
			}
		else
			return "" ;
    }
	
}
