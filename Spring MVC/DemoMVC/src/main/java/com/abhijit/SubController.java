package com.abhijit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.abhijit.service.SubService;

@Controller
public class SubController {
	
	@RequestMapping("/sub")
	public ModelAndView sub(@RequestParam("t1") int i,@RequestParam("t2") int j ,HttpServletRequest request, HttpServletResponse response) {
		ModelAndView  mv1 =new ModelAndView();
		
		SubService s = new SubService(); 
		int k = s.sub(i, j);
		mv1.setViewName("display");
		mv1.addObject("a",i);
		mv1.addObject("sym","-");
		mv1.addObject("b",j);
		mv1.addObject("subResult",k);
		return mv1;
		
	}

}
