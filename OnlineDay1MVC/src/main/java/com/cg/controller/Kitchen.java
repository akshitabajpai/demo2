package com.cg.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cg.exception.ForbiddenException;

@Controller
public class Kitchen {

	
	@RequestMapping("/")
	public String chef1()
	{
		return "home.jsp";
	}
	
	@RequestMapping("userlogin")
	public String chef2()
	{
		return "login2.jsp";
	}
	
	@RequestMapping("validateuser")
	public String chef3(@RequestParam String user,int age)
	{
		if(age>18)
		{
			return "welcome.jsp";

		}
		else
		{
			return "login2.jsp";
		}
	}
	
	@RequestMapping(value = "/exception", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity sendViaException() {
	    throw new ForbiddenException();
	}
}
