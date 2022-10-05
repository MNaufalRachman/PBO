/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

import Inheritance.*;

/**
 *
 * @author naufal
 */
public class Employee extends Person{
    //atribut sub class
    private String department, title;
    
    //constructor berparameter dari super class dan sub class
    public Employee(String id, String nama, String address, String department, String title){
        super(id, nama, address);
        this.department = "Department IT";
        this.title = title;
    }
    
    //getter

    public String getDepartment() {
        return department;
    }

    public String getTitle() {
        return title;
    }
    
    
    //custom method
    public void data(){
        System.out.println(super.getId() +" " + super.getNama() + " " + super.getAddress() + " " + getDepartment() + " " + getTitle());
    }

    @Override
    public void person() {
        super.person();
    }

}
