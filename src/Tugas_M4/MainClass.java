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
        int p = 0;
        
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
                        Lion_Air lion[] = new Lion_Air[jmlPenumpang];
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
                            lion[i] = new Lion_Air(bookingID, nik, nama, kelamin, tglBerangkat, tglKembali, kotaAsal, kotaTujuan, noPesawat, noKursi, jmlPenumpang);
                        }

                        // Print
                        for (int i = 0; i < jmlPenumpang; i++) {
                            System.out.print("\nPreview Tiket Lion Air");
                            System.out.println("\n=========================");
                            System.out.println("Booking ID: " + lion[i].getBookingID());
                            System.out.println("NIK: " + lion[i].getNik());
                            System.out.println("Nama: " + lion[i].getNama());
                            System.out.println("Kota Asal: " + lion[i].getKotaAsal());
                            System.out.println("Kota Tujuan: " + lion[i].getKotaTujuan());
                            System.out.println("Tanggal Berangkat: " + lion[i].getTglBerangkat());
                            System.out.println("Tanggal Kembali: " + lion[i].getTglKembali());
                            System.out.println("No. Pesawat: " + lion[i].getNoPesawat());
                            System.out.println("No. Kursi: " + lion[i].getNoKursi());
                            System.out.println("Harga Tiket: " + lion[i].getHarga() + "\n\n");
                        }

                        p = jmlPenumpang - 1;
                        System.out.println("Total: " + lion[p].getTotal());
                        break;

                    case 2:
                        Citilink citilink[] = new Citilink[jmlPenumpang];
                        System.out.println("======== Selamat Datang di Citilink ========");
                        System.out.println("Silahkan isi data penumpang");
                        for (int i = 0; i < jmlPenumpang; i++) {
                            System.out.print("Booking ID: ");
                            String bookingID = br.readLine();
                            System.out.print("NIK: ");
                            String nik = br.readLine();
                            System.out.print("Nama: ");
                            String nama = br.readLine();
                            System.out.print("Jenis Kelamin (L/P): ");
                            String kelamin = br.readLine();
                            System.out.print("No. Pesawat: ");
                            String noPesawat = br.readLine();
                            System.out.print("No. Kursi: ");
                            String noKursi = br.readLine();
                            System.out.println();
                            citilink[i] = new Citilink(bookingID, nik, nama, kelamin, tglBerangkat, tglKembali, kotaAsal, kotaTujuan, noPesawat, noKursi, jmlPenumpang);
                        }
                            
                        // Print
                        for (int i = 0; i < jmlPenumpang; i++) {
                            System.out.print("\n\nPreview Tiket Citilink");
                            System.out.println("\n====================================================");
                            System.out.println("Booking ID: " + citilink[i].getBookingID());
                            System.out.println("NIK: " + citilink[i].getNik());
                            System.out.println("Nama: " + citilink[i].getNama());
                            System.out.println("Kota Asal: " + citilink[i].getKotaAsal());
                            System.out.println("Kota Tujuan: " + citilink[i].getKotaTujuan());
                            System.out.println("Tanggal Berangkat: " + citilink[i].getTglBerangkat());
                            System.out.println("Tanggal Kembali: " + citilink[i].getTglKembali());
                            System.out.println("No. Pesawat: " + citilink[i].getNoPesawat());
                            System.out.println("No. Kursi: " + citilink[i].getNoKursi());
                            System.out.println("Harga Tiket: " + citilink[i].getHarga());
                        }
                        
                        p = jmlPenumpang - 1;
                        System.out.println("\nTotal: " + citilink[p].getTotal());
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

                System.out.println("======== PILIH MASKAPAI ========");
                System.out.println("1. Lion Air\n2. Citilink");
                System.out.print("\nPilih Maskapai: ");
                int pilih = Integer.parseInt(br.readLine());
                switch (pilih) {
                    case 1:
                        Lion_Air lion[] = new Lion_Air[jmlPenumpang];

                        System.out.println("======== Selamat Datang di Lion Air ========");
                        System.out.println("Silahkan isi data penumpang");
                        for (int i = 0; i < jmlPenumpang; i++) {
                            System.out.print("Booking ID: ");
                            String bookingID = br.readLine();
                            System.out.print("NIK: ");
                            String nik = br.readLine();
                            System.out.print("Nama: ");
                            String nama = br.readLine();
                            System.out.print("Jenis Kelamin (L/P): ");
                            String kelamin = br.readLine();
                            System.out.print("No. Pesawat: ");
                            String noPesawat = br.readLine();
                            System.out.print("No. Kursi: ");
                            String noKursi = br.readLine();
                            System.out.println("");
                            lion[i] = new Lion_Air(bookingID, nik, nama, kelamin, tglBerangkat, tglKembali, kotaAsal, kotaTujuan, noPesawat, noKursi, jmlPenumpang);
                        }

                        // Print
                        for (int i = 0; i < jmlPenumpang; i++) {
                            System.out.print("\nPreview Tiket Lion Air");
                            System.out.println("\n====================================================");
                            System.out.println("Booking ID: " + lion[i].getBookingID());
                            System.out.println("NIK: " + lion[i].getNik());
                            System.out.println("Nama: " + lion[i].getNama());
                            System.out.println("Kota Asal: " + lion[i].getKotaAsal());
                            System.out.println("Kota Tujuan: " + lion[i].getKotaTujuan());
                            System.out.println("Tanggal Berangkat: " + lion[i].getTglBerangkat());
                            System.out.println("Tanggal Kembali: " + lion[i].getTglKembali());
                            System.out.println("No. Pesawat: " + lion[i].getNoPesawat());
                            System.out.println("No. Kursi: " + lion[i].getNoKursi());
                            System.out.println("Harga Tiket: " + lion[i].getHarga());
                        }

                        p = jmlPenumpang - 1;
                        System.out.println("\nTotal: " + lion[p].getTotal());
                        break;

                    case 2:
                        Citilink citilink[] = new Citilink[jmlPenumpang];

                        System.out.println("======== Selamat Datang di Citilink ========");
                        System.out.println("Silahkan isi data penumpang");
                        for (int i = 0; i < jmlPenumpang; i++) {
                            System.out.print("Booking ID: ");
                            String bookingID = br.readLine();
                            System.out.print("NIK: ");
                            String nik = br.readLine();
                            System.out.print("Nama: ");
                            String nama = br.readLine();
                            System.out.print("Jenis Kelamin (L/P): ");
                            String kelamin = br.readLine();
                            System.out.print("No. Pesawat: ");
                            String noPesawat = br.readLine();
                            System.out.print("No. Kursi: ");
                            String noKursi = br.readLine();
                            System.out.println();
                            citilink[i] = new Citilink(bookingID, nik, nama, kelamin, tglBerangkat, tglKembali, kotaAsal, kotaTujuan, noPesawat, noKursi, jmlPenumpang);
                        }

                        // Print
                        for (int i = 0; i < jmlPenumpang; i++) {
                            System.out.print("\nPreview Tiket Citilink");
                            System.out.println("\n====================================================");
                            System.out.println("Booking ID: " + citilink[i].getBookingID());
                            System.out.println("NIK: " + citilink[i].getNik());
                            System.out.println("Nama: " + citilink[i].getNama());
                            System.out.println("Kota Asal: " + citilink[i].getKotaAsal());
                            System.out.println("Kota Tujuan: " + citilink[i].getKotaTujuan());
                            System.out.println("Tanggal Berangkat: " + citilink[i].getTglBerangkat());
                            System.out.println("Tanggal Kembali: " + citilink[i].getTglKembali());
                            System.out.println("No. Pesawat: " + citilink[i].getNoPesawat());
                            System.out.println("No. Kursi: " + citilink[i].getNoKursi());
                            System.out.println("Harga Tiket: " + citilink[i].getHarga() );
                        }

                        p = jmlPenumpang - 1;
                        System.out.println("\nTotal: " + citilink[p].getTotal());
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