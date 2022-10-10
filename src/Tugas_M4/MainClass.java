/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas_M4;
import java.io.*;

public class MainClass {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        
        String ulang, tglKembali = "";
        int u = 0;
        
        try {
            do {
            System.out.println("-- Pemesanan Tiket --");
            System.out.print("Masukkan Jumlah Penumpang: ");
            int jmlPenumpang = Integer.parseInt(br.readLine());
            System.out.print("\nKota Asal : ");
            String kotaAsal = br.readLine();
            System.out.print("\n Pilih Rute Tujuan : ");
            if (kotaAsal.equalsIgnoreCase("Surabaya")) {
                System.out.println("\n Bali, Lombok, Yogyakarta, Balikpapan, Makassar, Jakarta");
                System.out.print("Tujuan : ");
                String kotaTujuan = br.readLine();
                System.out.print("Tanggal Berangkat : ");
                String tglBerangkat = br.readLine();
                System.out.print("Pesan Pulang Pergi? (Y/N): ");
                String p = br.readLine();
                if (p.equalsIgnoreCase("Y")) {
                    System.out.print("Tanggal Kembali: ");
                    tglKembali = br.readLine();
                }

                System.out.println("\n-- Pilih Maskapai --");
                System.out.println("1. Lion Air \n2. Citilink");
                System.out.print("Pilih Maskapai: ");
                int pilih = Integer.parseInt(br.readLine());
                switch (pilih) {
                    case 1:
                        Lion_Air la[] = new Lion_Air[jmlPenumpang];
                        System.out.println("\n-- Selamat Datang di Lion Air --");
                        System.out.println("Silahkan isi data penumpang");
                        for (int i = 0; i < jmlPenumpang; i++) {
                            System.out.print("Booking ID : ");
                            String bookingID = br.readLine();
                            System.out.print("NIK : ");
                            String nik = br.readLine();
                            System.out.print("Nama : ");
                            String nama = br.readLine();
                            System.out.print("Jenis Kelamin (P/L) : ");
                            String kelamin = br.readLine();
                            System.out.print("No Pesawat : ");
                            String noPesawat = br.readLine();
                            System.out.print("No Kursi : ");
                            String noKursi = br.readLine();
                            la[i] = new Lion_Air(bookingID, nik, nama, kelamin, tglBerangkat, tglKembali, kotaAsal, kotaTujuan, noPesawat, noKursi, jmlPenumpang);
                        }

                        for (int i = 0; i < jmlPenumpang; i++) {
                            System.out.print("\nPreview Tiket Lion Air");
                            System.out.println("\n======================");
                            System.out.println("Booking ID: " + la[i].getBookingID());
                            System.out.println("NIK: " + la[i].getNik());
                            System.out.println("Nama: " + la[i].getNama());
                            System.out.println("Kota Asal: " + la[i].getKotaAsal());
                            System.out.println("Kota Tujuan: " + la[i].getKotaTujuan());
                            System.out.println("Tanggal Berangkat: " + la[i].getTglBerangkat());
                            System.out.println("Tanggal Kembali: " + la[i].getTglKembali());
                            System.out.println("Nomor Pesawat: " + la[i].getNoPesawat());
                            System.out.println("Nomor Kursi: " + la[i].getNoKursi());
                            System.out.println("Harga Tiket: " + la[i].getHarga());
                        }
                        u = jmlPenumpang - 1;
                        System.out.println("\nTotal: " + la[u].getTotal());
                        break;

                    case 2:
                        Citilink citi[] = new Citilink[jmlPenumpang];
                        System.out.println("-- Selamat Datang di Citilink --");
                        System.out.println("Silahkan isi data penumpang");
                        for (int i = 0; i < jmlPenumpang; i++) {
                            System.out.print("Booking ID : ");
                            String bookingID = br.readLine();
                            System.out.print("NIK : ");
                            String nik = br.readLine();
                            System.out.print("Nama : ");
                            String nama = br.readLine();
                            System.out.print("Jenis Kelamin (P/L) : ");
                            String kelamin = br.readLine();
                            System.out.print("No Pesawat : ");
                            String noPesawat = br.readLine();
                            System.out.print("No Kursi : ");
                            String noKursi = br.readLine();
                            citi[i] = new Citilink(bookingID, nik, nama, kelamin, tglBerangkat, tglKembali, kotaAsal, kotaTujuan, noPesawat, noKursi, jmlPenumpang);
                        }
                        
                        for (int i = 0; i < jmlPenumpang; i++) {
                            System.out.print("\nPreview Tiket Citilink");
                            System.out.println("\n=======================");
                            System.out.println("Booking ID: " + citi[i].getBookingID());
                            System.out.println("NIK: " + citi[i].getNik());
                            System.out.println("Nama: " + citi[i].getNama());
                            System.out.println("Kota Asal: " + citi[i].getKotaAsal());
                            System.out.println("Kota Tujuan: " + citi[i].getKotaTujuan());
                            System.out.println("Tanggal Berangkat: " + citi[i].getTglBerangkat());
                            System.out.println("Tanggal Kembali: " + citi[i].getTglKembali());
                            System.out.println("Nomor Pesawat: " + citi[i].getNoPesawat());
                            System.out.println("Nomor Kursi: " + citi[i].getNoKursi());
                            System.out.println("Harga Tiket: " + citi[i].getHarga());
                        }
                        u = jmlPenumpang - 1;
                        System.out.println("\nTotal: " + citi[u].getTotal());
                        break;

                    default:
                        break;
                }
            } else if (kotaAsal.equalsIgnoreCase("jakarta")) {
                System.out.println("\n Bali, Lombok, Yogyakarta, Balikpapan, Makassar, Jakarta");
                System.out.print("Tujuan : ");
                String kotaTujuan = br.readLine();
                System.out.print("Tanggal Berangkat : ");
                String tglBerangkat = br.readLine();
                System.out.print("Pesan Pulang Pergi? (Y/N): ");
                String pp = br.readLine();
                if (pp.equalsIgnoreCase("Y")) {
                    System.out.print("Tanggal Kembali: ");
                    tglKembali = br.readLine();
                }

                System.out.println("\n-- Pilih Maskapai --");
                System.out.println("1. Lion Air \n2. Citilink");
                System.out.print("Pilih Maskapai: ");
                int pilih = Integer.parseInt(br.readLine());
                switch (pilih) {
                    case 1:
                        Lion_Air la[] = new Lion_Air[jmlPenumpang];
                        System.out.println("\n-- Selamat Datang di Lion Air --");
                        System.out.println("Silahkan isi data penumpang");
                        for (int i = 0; i < jmlPenumpang; i++) {
                            System.out.print("Booking ID : ");
                            String bookingID = br.readLine();
                            System.out.print("NIK : ");
                            String nik = br.readLine();
                            System.out.print("Nama : ");
                            String nama = br.readLine();
                            System.out.print("Jenis Kelamin (P/L) : ");
                            String kelamin = br.readLine();
                            System.out.print("No Pesawat : ");
                            String noPesawat = br.readLine();
                            System.out.print("No Kursi : ");
                            String noKursi = br.readLine();
                            la[i] = new Lion_Air(bookingID, nik, nama, kelamin, tglBerangkat, tglKembali, kotaAsal, kotaTujuan, noPesawat, noKursi, jmlPenumpang);
                        }

                        for (int i = 0; i < jmlPenumpang; i++) {
                            System.out.print("\nPreview Tiket Lion Air");
                            System.out.println("\n======================");
                            System.out.println("Booking ID: " + la[i].getBookingID());
                            System.out.println("NIK: " + la[i].getNik());
                            System.out.println("Nama: " + la[i].getNama());
                            System.out.println("Kota Asal: " + la[i].getKotaAsal());
                            System.out.println("Kota Tujuan: " + la[i].getKotaTujuan());
                            System.out.println("Tanggal Berangkat: " + la[i].getTglBerangkat());
                            System.out.println("Tanggal Kembali: " + la[i].getTglKembali());
                            System.out.println("Nomor Pesawat: " + la[i].getNoPesawat());
                            System.out.println("Nomor Kursi: " + la[i].getNoKursi());
                            System.out.println("Harga Tiket: " + la[i].getHarga());
                        }
                        u = jmlPenumpang - 1;
                        System.out.println("\nTotal: " + la[u].getTotal());
                        break;

                    case 2:
                        Citilink citi[] = new Citilink[jmlPenumpang];
                        System.out.println("-- Selamat Datang di Citilink --");
                        System.out.println("Silahkan isi data penumpang");
                        for (int i = 0; i < jmlPenumpang; i++) {
                            System.out.print("Booking ID : ");
                            String bookingID = br.readLine();
                            System.out.print("NIK : ");
                            String nik = br.readLine();
                            System.out.print("Nama : ");
                            String nama = br.readLine();
                            System.out.print("Jenis Kelamin (P/L) : ");
                            String kelamin = br.readLine();
                            System.out.print("No Pesawat : ");
                            String noPesawat = br.readLine();
                            System.out.print("No Kursi : ");
                            String noKursi = br.readLine();
                            citi[i] = new Citilink(bookingID, nik, nama, kelamin, tglBerangkat, tglKembali, kotaAsal, kotaTujuan, noPesawat, noKursi, jmlPenumpang);
                        }
                        
                        for (int i = 0; i < jmlPenumpang; i++) {
                            System.out.print("\nPreview Tiket Citilink");
                            System.out.println("\n=======================");
                            System.out.println("Booking ID: " + citi[i].getBookingID());
                            System.out.println("NIK: " + citi[i].getNik());
                            System.out.println("Nama: " + citi[i].getNama());
                            System.out.println("Kota Asal: " + citi[i].getKotaAsal());
                            System.out.println("Kota Tujuan: " + citi[i].getKotaTujuan());
                            System.out.println("Tanggal Berangkat: " + citi[i].getTglBerangkat());
                            System.out.println("Tanggal Kembali: " + citi[i].getTglKembali());
                            System.out.println("Nomor Pesawat: " + citi[i].getNoPesawat());
                            System.out.println("Nomor Kursi: " + citi[i].getNoKursi());
                            System.out.println("Harga Tiket: " + citi[i].getHarga());
                        }
                        
                        u = jmlPenumpang - 1;
                        System.out.println("\nTotal: " + citi[u].getTotal());
                        break;

                    default:
                        break;
                }
            }

                System.out.print("\nPesan Lagi (Y/N): ");
                ulang = br.readLine();
            } while (ulang.equalsIgnoreCase("y"));
        } catch (Exception e) {
        }
    }
}