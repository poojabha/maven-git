package com.example.csv.springbatchcsv.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class UserModel {
    @Id
    private int is;
    private String name;
    private String dept;
    private int salary;
    private Date time;

    public UserModel(int is, String name, String dept, int salary,Date time) {
        this.is = is;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.time=time;
    }

    public UserModel() {
    }

    public int getIs() {
        return is;
    }

    public void setIs(int is) {
        this.is = is;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "is=" + is +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
