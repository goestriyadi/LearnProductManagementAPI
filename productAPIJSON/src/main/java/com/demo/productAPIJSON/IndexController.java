package com.demo.productAPIJSON;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@RequestMapping("/")
	public ModelAndView home()
	{
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("index");
	    return modelAndView;
	}
	
	@RequestMapping("/NewProduct")
	public ModelAndView newproduct()
	{
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("newproduct");
	    return modelAndView;
	}
	
	@RequestMapping("/UpdateProduct")
	public ModelAndView updateproduct()
	{
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("updateproduct");
	    return modelAndView;
	}
	
	@RequestMapping("/Guideline")
	public ModelAndView guideline()
	{
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("guideline");
	    return modelAndView;
	}
	
	
}