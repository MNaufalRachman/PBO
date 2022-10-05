/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Latihan;

import Inheritance.*;
import java.io.*;

public class MainClass {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //object: Employee
        Employee emp[] = new Employee[2];
        
        //deklarasi variable
        String id, nama, address, department, title;
        
        try{ 
            //input data
            for (int i = 0; i < emp.length; i++){
            System.out.println("Entry ID : ");
            id = br.readLine();
            System.out.println("Entry Nama : ");
            nama = br.readLine();
            System.out.println("Entry Address : ");
            address = br.readLine();
            System.out.println("Entry Title : ");
            title = br.readLine();
            
            System.out.println(" ");
            //masukkan ke object
            emp[i] = new Employee(id, nama, address, null, title);
        }
            
        //output
        for (int i = 0; i < emp.length; i++){
            //cetak method getData dan class Employee
            emp[i].data();
        }
            
        }catch (Exception e){
            System.out.println(e);
        }
        
    }
    
}
