/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

import Inheritance.*;

public class Person {
    
    //atribut super class
    private String id, nama, address;
    
    //constructor --> shortcut Alt+insert

    public Person(String id, String nama, String address) {
        this.id = id;
        this.nama = nama;
        this.address = address;
    }
    
    //getter

    public String getId() {
        return id;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void person(){
        System.out.println(getId() + " " + getNama() + " " + getAddress());
    }
    
}
