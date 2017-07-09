package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/*
public class StudentController  extends AbstractController{

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("message","Hello from index.jsp");
        return modelAndView;
    }
}*/

/*public class StudentController  extends MultiActionController{

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("message","Hello from index.jsp");
        return modelAndView;
    }

    public void dummy2(HttpServletRequest httpServletRequest,
                       HttpServletResponse httpServletResponse) throws Exception {
        httpServletResponse.setContentType("text/html");
        httpServletResponse.getWriter().println("<b>HELLO World</b>");
    }
}*/

@Controller
public class StudentController{
    /*@RequestMapping(method = RequestMethod.GET)
    public ModelAndView callIndexJsp(){

        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("message","Hello from index.jsp");
        return modelAndView;
    }

    @RequestMapping("/index")
    @ResponseBody
    String hello(){
        return "Hello World";
    }*/


    /*@RequestMapping("/index")
    public ModelAndView callIndexJsp(){

        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("message","Hello World");
        return modelAndView;
    }*/


   /* @RequestMapping(value = "/{fname}/{lname}" )
    public ModelAndView submit(@PathVariable("fname")String fname,@PathVariable("lname") String lname){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("message","First Name: "+fname+"\n Last Name: "+lname);
        return  modelAndView;

    }*/


   /* @RequestMapping("/form")
    public ModelAndView callIndexJsp(){

        ModelAndView modelAndView = new ModelAndView("form");
        return modelAndView;
    }
    @RequestMapping(value = "/submitForm" ,method = RequestMethod.POST)
    public ModelAndView submit(@RequestParam("firstName")String fname, @RequestParam("lastName") String lname){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("message","First Name: "+fname+"\nLast Name: "+lname);
        return  modelAndView;

    }*/

   /* @RequestMapping(value = "/index/{firstname}/{lastname}" )
    public ModelAndView submit(@PathVariable Map<String,String> name){
        String fname = name.get("firstname");
        String lname = name.get("lastname");
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("message","First Name: "+fname+" Last Name: "+lname);
        return  modelAndView;

    }*/

   /* @RequestMapping("/form")
    public ModelAndView callIndexJsp(){

        ModelAndView modelAndView = new ModelAndView("form");
        return modelAndView;
    }
    @RequestMapping(value = "/submitForm" ,method = RequestMethod.POST)
    public ModelAndView submit(StudentCO studentCO){
        String fname = studentCO.getFirstName();
        String lname = studentCO.getLastName();
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("message","First Name: "+fname+"\nLast Name: "+lname);
        return  modelAndView;

    }
*/


    @ModelAttribute
    public void defaultAction(Model model){

        model.addAttribute("message","Spring MVC Demo");

    }
    @RequestMapping("/index")
    public ModelAndView callIndexJsp(){

        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

}



