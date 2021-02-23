package com.Naveen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Naveen.Service.AddServiceWeb;

@Controller
public class mainController {
	

	
@RequestMapping("/add")	
public ModelAndView add(@RequestParam("t1") int i,@RequestParam("t2") int j){
	AddServiceWeb qq = new AddServiceWeb();
	int k = qq.add(i,j);
	
	ModelAndView mv = new ModelAndView();
	mv.setViewName("display");
	mv.addObject("result",k);
	
	return mv;
}
}
	