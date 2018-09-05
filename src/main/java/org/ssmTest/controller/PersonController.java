package org.ssmTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.ssmTest.entity.Person;
import org.ssmTest.service.PersonService;

import java.util.List;

/**
 * @author stary
 * @date 2018/9/3 下午8:12
 */
@Controller
@RequestMapping("/ssmTest")//url:/模块/资源/{id}/细分；例如：/ssmTest/index
public class PersonController {

    @Autowired
    PersonService personService;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(Model model){

        List<Person> list = personService.queryAll();
        model.addAttribute("list",list);

        return "test";
    }

}
