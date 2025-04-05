package com.zaurtregulov.spring.mvc;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {

    @Size(min = 2, message = "name must be min 2 symbols")
    private String name;
    //@NotEmpty(message = "surname is required field")
    @NotBlank(message = "surname is required field")
    private String surname;
    @Min(value = 500, message = "minimalka")
    @Max(value = 5000, message = "maximalka")
    private int salary;
    private String carBrand;
    private String department;
    private Map<String,String> departments;
    private String[] languages;
    private Map<String,String> languageList;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "please use pattern xxx-xx-xx")
    private String phoneNumber;


    public Employee(){
        departments=new HashMap<>();
        departments.put("Manager","Manager");
        departments.put("TTT","TTT");
        departments.put("AAA","AAA");

        languageList=new HashMap<>();
        languageList.put("English","EN");
        languageList.put("Deutch","DE");
        languageList.put("Franch","FN");
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Map<String, String> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(Map<String, String> languageList) {
        this.languageList = languageList;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
