package com.assignment4.crudapp.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Chris
 */
@Controller
@RequestMapping("/data")
public class DataController {

    @Autowired
    private DataService dataService;

    @GetMapping("/upload")
    public String getUpload() {
        return "/upload-page";
    }

    @GetMapping("/delete/id={dataId}")
    public String delete(@PathVariable long dataId, Model model){
        dataService.deleteData(dataId);
        return "redirect:/";
    }
    
    @GetMapping("/update/id={dataId}")
    public String updateName(@PathVariable long dataId, Model model){
        model.addAttribute("data", dataService.getData(dataId));
        return "/update-page";
    }
    
    @PostMapping("/submit-update/id={dataId}")
    public String submitNameUpdate(@PathVariable long dataId,Data data){
        dataService.updateData(dataId, data);
        return "redirect:/";
    }

    @PostMapping("/submit-upload")
    public String uploadNewName( Data data){
        dataService.saveData(data);
        return "redirect:/";
    }
}
