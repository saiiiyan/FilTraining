package com.fil;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {

	
	@RequestMapping(value="/log",method=RequestMethod.GET)
	@ResponseBody
	public String showHello(){
		return "hello controller";
	}
	
	
}
