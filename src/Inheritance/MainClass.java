/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Inheritance;

import java.io.*;

public class MainClass {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //object: sub class
        sub_class sub = new sub_class("", "", 0);
        
        try{ 
            //input data
            System.out.println("Isi nama : ");
            String n = br.readLine();
            System.out.println("Isis Keterangan : ");
            String k = br.readLine();
            System.out.println("Isi tinggi : ");
            int t = Integer.parseInt(br.readLine());
            
            //masukkan variable ke dalam parameter object
            sub = new sub_class (n, k, t);
            
            //cetak data lengkap
            sub.dataLengkap();
            
            //panggil method cetak dan halo
            sub.cetak();
            sub.halo();
            
        }catch (Exception e){
            System.out.println(e);
        }
        
    }
    
}
