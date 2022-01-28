# Java-Spring-web-2

In this exercise you will need to create and handle form for adding a new employee.


## Task 1: Clone this repository and import the application into your IDE

Take a look at all the given code. The `Application` class is our an entry point to the application.

Run the application and make sure it works.

Take a look at `pom.xml` file. You need to have the following dependencies to create Spring MVC forms and enable
validation:

```xml

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-thymeleaf</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-validation</artifactId>
</dependency>
```

Also, take a look at `EmployeeController`.
```java

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private final Set<Employee> employees = new HashSet<>();

    @GetMapping
    public String listEmployees(@RequestParam(required = false) Integer limit, Model model) {
        model.addAttribute("employees", employees);
        return "index";
    }
}
```
So as you can notice there is already a method provided to show all employees that should appear in the content of `index.html` file.
This file is also provided, so once you request `localhost:8080/employees` endpoint you should see a list of employees, which obviously at the begining will be empty. 
And your task will be to enable adding a new employee.

## Task 2: Modify Employee class

Add proper annotations to ensure that:

* **id** won't be null or empty
* **first name** won't be null
* **last name** won't be blank
* **age** won't be less than 20 and greater than 80
* **position** won't be empty
* **email** will be valid


## Task 3: Add a html form for adding a new employee

In this task you  need to fill the content of the file `add-employeee.hmtl`.
This is the form for adding a new employee, so prepare given fields:
* id
* first name
* last name
* age
* position
* email

## Task 4: Add a method in controller that will redirect to form

Go to the `index.html` file. You will find there a line:

```html
<p><a href="/employees/addEmployeeForm">Add a new employee</a></p>
```

So in this task you need to implement a method in controller that will open `add-employee.html` when hitting `/addEmployeeForm` endpoint.

 
## Task 5: Add a method in controller that will submit adding a new employee

Now you need to handle the action implemented in `add-employee.html` file.
You probably have something like this: `th:action="@{/employees/add}"`.
So in this task implement adding a new employee to the set of employees when hitting `/employees/add` endpoint.

## Task 6: Test the Application!

Run your application and enter `localhost:8080/employees`. Test the flow: what will happen when you put invalid data in the form?
