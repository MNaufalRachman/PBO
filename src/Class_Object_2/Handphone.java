/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class_Object_2;

/**
 *
 * @author naufa
 */
public class Handphone {
    private String tipe,warna, kapasitas;
    
    //setter

    public void setTipe(String t) {
        tipe = t;
    }

    public void setWarna(String w) {
        warna = w;
    }

    public void setKapasitas(String k) {
        kapasitas = k;
    }
    
    //getter

    public String getTipe() {
        return this.tipe;
    }

    public String getWarna() {
        return this.warna;
    }

    public String getKapasitas() {
        return this.kapasitas;
    }
    
}
