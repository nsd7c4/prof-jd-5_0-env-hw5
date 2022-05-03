package com.rginc.profjd5_0envhw5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping (path = "/employee/add")
    public String addEmployee(@RequestParam("first") String firstName,@RequestParam("last") String lastName) throws EmployeeBookIsFull, ExistedEmployee {
            return employeeService.addEmployee(firstName, lastName);
    }

    @GetMapping (path = "/employee/remove")
    public String removeEmployee(@RequestParam("first") String firstName,@RequestParam("last") String lastName) throws EmployeeNotFound {
        return employeeService.removeEmployee(firstName, lastName);
    }

    @GetMapping (path = "/employee/find")
    public String findEmployee(@RequestParam("first") String firstName,@RequestParam("last") String lastName) throws EmployeeNotFound {
        return employeeService.findEmployee(firstName, lastName);
    }

    @GetMapping (path = "/employee/all")
    public String allEmployee(){
        return employeeService.allEmployee();
    }
}
