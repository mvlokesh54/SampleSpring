package com.javatpoint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpController {
	@RequestMapping("/empform")
	public ModelAndView showform()
	{
		//here new Emp() redirect to defoult constrator in emp.java
		return new ModelAndView("empform","command",new Emp());
		
	}
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("emp") Emp emp)
	{
		
		System.out.println(emp.getName()+" "+emp.getSalary()+" "+emp.getDesignation());
		
		return new ModelAndView("redirect:/viewemp");
		
	}
	
	@RequestMapping("/viewemp")  
    public ModelAndView viewemp(){  
        //write the code to get all employees from DAO  
        //here, we are writing manual code of list for easy understanding  
		//new Emp( , , )is redircted to parameterised constractor in Emp.java  
        /*List<Emp> list=new ArrayList<Emp>();  
        list.add(new Emp(1,"rahul",35000f,"S.Engineer"));  
        list.add(new Emp(2,"aditya",25000f,"IT Manager"));  
        list.add(new Emp(3,"sachin",55000f,"Care Taker"));  
          */
		HashMap map= new HashMap();
		map.put(27, "lokesh");
		map.put(54, "vital");
		map.put(5, "purnima");
		
		System.out.println("54 valure=="+map.get(54));
		
		
		
		
        return new ModelAndView("viewemp","map",map);  
    }  
//Start code of Spring MVC CRUD Example
	
	
	
	
}
