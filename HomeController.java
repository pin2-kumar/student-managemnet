package com.publicmanegementsystem;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // Correct import

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    private StudentService service; // Class name starts with capital

    @GetMapping("/home")
    public String home() {
        return "home"; // loads home.html from templates folder
    }




    @GetMapping("/Student")
    public String getAllStudent(Model model) {
        model.addAttribute("students", service.getAllStudent());
        model.addAttribute("msg", "Record is saved Successfully");
        return "Student"; //
    }



    @GetMapping("/students/new")
    public String createStudentForm(Model model) {
        model.addAttribute("student", new Student());
        model.addAttribute("msg", "Record is saved Successfully");
        return "create_Students";
    }



    @PostMapping("/students")
    public String save(@ModelAttribute("student") Student student, Model model) {
        service.saveStudent(student);
        model.addAttribute("msg", "Record is saved Successfully");
        return "redirect:Student";


    }



    @GetMapping("/students/edit/{id}")
    public String showEditForm(@PathVariable("id") Long id, Model model) {
        System.out.println("Editing student with ID: " + id);
        Student student = service.getById(id);
        model.addAttribute("student", student);
        model.addAttribute("msg", "Record is saved Successfully");
        return "edit_Student";
    }



    @PostMapping("/students/update")
    public String updateStudent(@ModelAttribute("student") Student student , Model model) {
        service.saveStudent(student);
        model.addAttribute("msg", "Record is saved Successfully");
        return "redirect:/Student";
    }

    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id, Model model) {
        service.deleteStudentById(id); // implement this method in StudentService
        model.addAttribute("msg", "Record is saved Successfully");
        return "redirect:/Student";
    }



}











