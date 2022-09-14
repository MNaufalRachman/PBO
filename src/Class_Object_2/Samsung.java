/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class_Object_2;

/**
 *
 * @author naufa
 */
public class Samsung {
    
    private int harga, jumlah, total;
    
    //setter
    public void setHarga(int h) {
        harga = h;
    }

    public void setJumlah(int j) {
        jumlah = j;
    }
    
    //getter
    public int getHarga() {
        return this.harga;
    }

    public int getJumlah() {
        return this.jumlah;
    }
    
    //custom
    public int getBeli() {
        total = getHarga() * getJumlah();
        return total;
    }
}
