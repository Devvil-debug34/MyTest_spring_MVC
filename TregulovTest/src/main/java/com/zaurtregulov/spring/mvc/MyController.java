package com.zaurtregulov.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/") //адрес, при котором сработем метод и вернется "first-view"
    public String showFirstView(){
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model){

        model.addAttribute("employee", new Employee());
        return "ask-emp-details-view";
    }



    @RequestMapping("/showDetails")
    public String showEmpDetails(@Valid @ModelAttribute("employee") Employee emp, BindingResult bindingResult){
                                //извлекает из поля текст и помещает в переменную empName
        //@Valid - говорит о том, что ннотация МОДЕЛАТРИБУТ будет поддвергаться првоерке

        if(bindingResult.hasErrors()){ //проверяем, успешла ли валлидация
            return "ask-emp-details-view";
        }else{
            return "show-emp-details-view";
        }



    }

}
