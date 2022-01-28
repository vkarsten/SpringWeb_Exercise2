package com.example.springwebex2;

import javax.validation.constraints.*;

public final class Employee {

    @NotNull
    @NotEmpty
    private String id;
    @NotNull
    private String firstName;
    @NotBlank
    private String lastName;
    @Min(20)
    @Max(80)
    private Integer age;
    @NotEmpty
    private String position;
    @Email
    private String email;


    public Employee(String id, String firstName, String lastName, Integer age, String position, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.position = position;
        this.email = email;
    }

    public Employee() {
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() { return email; }

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
