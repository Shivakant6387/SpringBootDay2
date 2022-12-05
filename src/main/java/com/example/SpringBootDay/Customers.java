package com.example.SpringBootDay;

import org.springframework.stereotype.Component;

@Component
public class Customers {
    private int CustId;
    private String name;
    private String CourseName;

    public int getCustId() {
        return CustId;
    }

    public void setCustId(int custId) {
        CustId = custId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }
    public void display(){
        System.out.println("Customers Object Returned Successfully");
    }
}
