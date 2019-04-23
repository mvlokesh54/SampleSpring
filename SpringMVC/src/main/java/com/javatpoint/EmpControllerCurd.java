package com.javatpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.javatpoint.dao.EmpDao;

@Controller
public class EmpControllerCurd {
	@Autowired
	EmpDao dao;
	
	@RequestMapping("/empformcurd")
	public ModelAndView showform()
	{
		//here new Emp() redirect to defoult constrator in emp.java
		return new ModelAndView("empformcurd","command",new Emp());
	}
	@RequestMapping(value="/savecurd", method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("emp") Emp emp)
	{
		
		
		dao.save(emp);
		return new ModelAndView("redirect:/viewempcurd");
		
	}
	
	/*@RequestMapping("/viewempcurd")  
    public ModelAndView viewemp(){  
		 // It provides list of employees in model object   
		
		
          
        return new ModelAndView("viewemp","list",list);  
    }  */
//Start code of Spring MVC CRUD Example
	
	
	
	
}
