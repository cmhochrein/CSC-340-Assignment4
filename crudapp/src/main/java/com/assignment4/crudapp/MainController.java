package com.assignment4.crudapp;

import com.assignment4.crudapp.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Chris
 */
@Controller
public class MainController {

    @Autowired
    private DataService dataService;

    @GetMapping(value = {"", "/", "/home"})
    public String getMain(Model model) {
        model.addAttribute("dataList", dataService.getDataList());
        return "/mainpage";
    }
}
