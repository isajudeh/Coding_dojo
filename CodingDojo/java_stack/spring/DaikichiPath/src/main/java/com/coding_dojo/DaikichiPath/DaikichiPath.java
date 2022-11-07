package com.coding_dojo.DaikichiPath;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/daikich")
public class DaikichiPath {
	
	@RequestMapping("/{travel}/{Honolulu}")
    public String meth1(@PathVariable("travel") String travel, @PathVariable("Honolulu") String Honolulu){
    	return "Congratulation! You will soon "+ travel + " to " + Honolulu;
    }
	
}
