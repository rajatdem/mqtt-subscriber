package com.rajat.controller.topic;

import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ShowMap{

	@RequestMapping(method=RequestMethod.GET, value="/maps")
	public String index()
	{
		return "map.html";
	}
}
