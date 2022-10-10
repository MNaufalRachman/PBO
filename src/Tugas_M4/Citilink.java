/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_M4;

public class Citilink extends Tiket {
    String kotaTujuan, noPesawat, noKursi;
    int jumlahPenumpang, harga, total;

    //Constructor
    public Citilink(String bookingID, String nik, String nama, String jenis_kelamin, String tglBerangkat, String tglKembali, String kotaAsal, String kotaTujuan, String noPesawat, String noKursi, int jumlahPenumpang) {
        super(bookingID, nik, nama, jenis_kelamin, tglBerangkat, tglKembali, kotaAsal);
        this.kotaTujuan = kotaTujuan;
        this.noPesawat = noPesawat;
        this.noKursi = noKursi;
        this.jumlahPenumpang = jumlahPenumpang;
    }   

    //Getter
    public String getKotaTujuan() {
        return kotaTujuan;
    }

    public String getNoPesawat() {
        return noPesawat;
    }

    public String getNoKursi() {
        return noKursi;
    }

    public int getJumlahPenumpang() {
        return jumlahPenumpang;
    }

    public int getHarga() {
        if (getKotaAsal().equalsIgnoreCase("Surabaya")) {
            if (getKotaTujuan().equalsIgnoreCase("Bali") || getKotaTujuan().equalsIgnoreCase("Lombok")) {
                harga = 700000;
            } else if (getKotaTujuan().equalsIgnoreCase("Jakarta") || getKotaTujuan().equalsIgnoreCase("Yogyakarta")) {
                harga = 800000;
            } else if (getKotaTujuan().equalsIgnoreCase("Balikpapan") || getKotaTujuan().equalsIgnoreCase("Makassar")) {
                harga = 850000;
            }
        } else if (getKotaAsal().equalsIgnoreCase("Jakarta")) {
            if (getKotaTujuan().equalsIgnoreCase("Bali") || getKotaTujuan().equalsIgnoreCase("Lombok")) {
                harga = 1000000;
            } else if (getKotaTujuan().equalsIgnoreCase("Surabaya") || getKotaTujuan().equalsIgnoreCase("Yogyakarta")) {
                harga = 750000;
            } else if (getKotaTujuan().equalsIgnoreCase("Balikpapan") || getKotaTujuan().equalsIgnoreCase("Makassar")) {
                harga = 900000;
            }
        }
        return harga;
    }

    public int getTotal() {
        total = getHarga() * getJumlahPenumpang();
        return total;
    }
}