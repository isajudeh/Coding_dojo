package com.coding_dojo.NinjaGold;

import java.util.Random;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class GameMethod {
	
	@RequestMapping("/Gold")
	public String ind(HttpSession session) {
		if (session.getAttribute("gold") == null) {
				session.setAttribute("gold", 0);
			}
			else {
				session.setAttribute("gold", session.getAttribute("gold"));
			}
		return "index.jsp";
	}
	
	@PostMapping("/Gold/one")
	public String ind1(
		    @RequestParam(value="location") String lock,
		    HttpSession session) {
		if (lock.equals("farm")) {
			int min=10;
			int max=20;
			Random random = new Random();
			int randomRange = random.nextInt(max - min) + min;
			int x = (int)session.getAttribute("gold") + randomRange;
			session.setAttribute("gold", x);
			

			System.out.println(session.getAttribute("gold")+" "+randomRange);
		}
		else if (lock == "cave") {
			int min=5;
			int max=10;
			Random random = new Random();
			int randomRange = random.nextInt(max - min) + min;
			int x = (int)session.getAttribute("gold") + randomRange;
			session.setAttribute("gold", x);
			System.out.println(session.getAttribute("gold")+" "+randomRange);

		}
		else if (lock == "house") {
			int min=2;
			int max=5;
			Random random = new Random();
			int randomRange = random.nextInt(max - min) + min;
			int x = (int)session.getAttribute("gold") + randomRange;
			session.setAttribute("gold", x);
			System.out.println(session.getAttribute("gold")+" "+randomRange);

		}
		else 
		{
			int min=-50;
			int max=50;
			Random random = new Random();
			int randomRange = random.nextInt(max - min) + min;
			int x = (int)session.getAttribute("gold") + randomRange;
			session.setAttribute("gold", x);
			System.out.println(session.getAttribute("gold")+" "+randomRange);

		}
		return "redirect:/Gold";
	}
}
