package Class_Object_1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author naufa
 */
public class Hewan {
    //atribut /data
    private String tipe, suara;
    private int usia;
    
    //setter dari semua variable/atribut/data
    //setter memiliki parameter
    public void setTipe(String t){
        tipe = t;
    }
    
    public void setSuara(String suara){
        this.suara = suara;
    }
    public void setUsia(int usia){
        this.usia = usia;
    }
    
    // getter dari semua variable/atribut/data
    /*getter bisanya tidak memiliki parameter karena
      langsung mengambil dari setter*/
    public String getTipe(){
        return this.tipe;
    }
    
    public String getSuara(){
        return this.suara;
    }
    
    public int getUsia(){
        return this.usia;
    }
    
}
