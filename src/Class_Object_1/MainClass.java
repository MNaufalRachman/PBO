/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Class_Object_1;

/**
 *
 * @author naufal
 */
public class MainClass {
    
    public static void main(String[] args) {
    
        /*untuk bisa mengakses class hewan, burung, ikan
          perlu membuat object (instance od class)
        */
        
        //akses suara, tipe, dan usia dari class hewan
        Hewan burung = new Hewan();
        Hewan ikan = new Hewan();
        
        //akses method dari class Burung, dan Ikan
        Burung b = new Burung();
        Ikan i = new Ikan();
        
        // cara isi dari suara, tipe, dan usia
        burung.setTipe("Kakatua");
        burung.setSuara("kuk...kuk...kuk...");
        burung.setUsia(1);
        
        ikan.setTipe("Lumba Lumba");
        ikan.setSuara("blurp..blurp..blurp..");
        ikan.setUsia(0);
        
        
        //cara ambil dari setter (Hewan, Burung, Ikan)
        System.out.println("Aku " + burung.getTipe() +
                ", Suaraku " + burung.getSuara() + ", Usiaku " + 
                burung.getUsia() + ". ");
        b.terbang();
        
        System.out.println("Aku " + ikan.getTipe() +
                ", Suaraku " + ikan.getSuara() + ", Usiaku " + 
                ikan.getUsia() + ". ");
        i.berenang();
    }
    
}
