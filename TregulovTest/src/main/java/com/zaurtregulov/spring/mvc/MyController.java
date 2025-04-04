package com.zaurtregulov.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/") //адрес, при котором сработем метод и вернется "first-view"
    public String showFirstView(){
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(){
        return "ask-emp-details-view";
    }



    @RequestMapping("/showDetails")
    public String showEmpDetails(@RequestParam ("employeeName") String empName, Model model){
                                //извлекает из поля текст и помещает в переменную empName
        empName = "Mr. " + empName;
        model.addAttribute("nameAttribute", empName);
        return "show-emp-details-view";
    }

}
