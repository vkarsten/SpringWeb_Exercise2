package com.example.springwebex2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    private final Set<Employee> employees = new HashSet<>();

    @GetMapping
    public String listEmployees(Model model) {
        model.addAttribute("employees", employees);
        return "index";
    }

    @PostMapping("/add")
    public String addNewEmployee(@ModelAttribute @Valid Employee employee, BindingResult result) {
        if (result.hasErrors()) {
            return "add-employee";
        }
        employees.add(employee);
        return "redirect:";
    }

    @GetMapping("/addEmployeeForm")
    public String addEmployeeForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "add-employee";
    }
}
