package com.innzoinfotech.firstspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmpController
{
	@RequestMapping(value="/index", method = RequestMethod.GET )
		public String getIndex()
		{
			return "index";
		}
}