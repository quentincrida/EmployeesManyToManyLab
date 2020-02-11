package com.example.codeclan.onetomanyservice.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;

@Entity
@Table(name = "departments")

public class Department {

    @Column(name = "name")
    private String name;

    private ArrayList<Employee> employees;
    private Long id;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public Department() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
