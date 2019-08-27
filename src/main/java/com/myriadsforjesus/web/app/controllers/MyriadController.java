package com.myriadsforjesus.web.app.controllers;

import com.myriadsforjesus.web.app.models.Myriad;
import com.myriadsforjesus.web.app.service.MyriadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class MyriadController {
    @Autowired
    private MyriadService myriadService;

    @RequestMapping("/user/create-new-account")//sign up page
    public String signUpPage(@ModelAttribute Myriad myriad, Model model){
        model.addAttribute("myriad",myriad);
        return "home/signuppage";
    }

    @RequestMapping("/myriad/save")
    public String saveCustomer(@Valid @ModelAttribute Myriad myriad, BindingResult result){
        if (result.hasErrors()) {
            return "home/signuppage";
        }else {
            myriad = myriadService.saveMyriad(myriad);

            return "redirect:/newsfeed/newsfeed";
        }

    }

}
