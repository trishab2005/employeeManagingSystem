// src/main/java/com/example/controller/EmployeeFrontController.java
package com.example.controller;

import com.example.entity.Employee;
import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Controller to handle web requests for the employee front-end.
 * It uses the existing EmployeeService to retrieve paginated and sorted data.
 */
@Controller
@RequestMapping("/employees")
public class EmployeeFrontController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * Handles the GET request to display a list of employees with pagination and sorting.
     * @param page The page number (default: 0).
     * @param size The number of items per page (default: 5).
     * @param sortBy The property to sort by (default: "empid").
     * @param direction The sort direction ("asc" or "desc").
     * @param model The Thymeleaf model to pass data to the view.
     * @return The name of the HTML template to render.
     */
    @GetMapping
    public String showEmployees(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size,
            @RequestParam(defaultValue = "empid") String sortBy,
            @RequestParam(defaultValue = "asc") String direction,
            Model model) {

        // Use the existing service method to get paginated and sorted data
        Page<Employee> employeePage = employeeService.getEmployee(page, size, sortBy, direction);

        // Add attributes to the model for the Thymeleaf template
        model.addAttribute("employeePage", employeePage);
        model.addAttribute("sortBy", sortBy);
        model.addAttribute("direction", direction);
        model.addAttribute("employee", new Employee()); // New empty employee object for the form

        // Calculate the opposite direction for sorting links
        String reverseDirection = direction.equals("asc") ? "desc" : "asc";
        model.addAttribute("reverseDirection", reverseDirection);

        // Return the name of the Thymeleaf template file
        return "employees";
    }

    /**
     * Handles POST request to add a new employee.
     * @param employee The employee object from the form.
     * @return A redirect to the main employee list.
     */
    @PostMapping("/add")
    public String addEmployee(@ModelAttribute Employee employee, RedirectAttributes redirectAttributes) {
        employeeService.saveEmployee(employee);
        redirectAttributes.addFlashAttribute("message", "Employee added successfully!");
        return "redirect:/employees";
    }

    /**
     * Handles POST request to delete an employee.
     * @param id The ID of the employee to delete.
     * @return A redirect to the main employee list.
     */
    @PostMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        employeeService.deleteEmployee(id);
        redirectAttributes.addFlashAttribute("message", "Employee deleted successfully!");
        return "redirect:/employees";
    }
}
