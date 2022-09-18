/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas_M2;
import java.io.*;
/**
 *
 * @author naufal
 */
public class MainClass {
    public static void main(String[] args) {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        Undika univ = new Undika();
        Karyawan kry = new Karyawan();
        Mahasiswa mhs = new Mahasiswa();

        try {
            do {
                System.out.println("========== MENU ==========");
                System.out.println("1. Cek SPP Mahasiswa");
                System.out.println("2. Cek Gaji Karyawan");
                System.out.println("3. Keluar Aplikasi");
                System.out.print("Pilih menu: ");
                int menu = Integer.parseInt(rd.readLine());
                System.out.println("====================");
                switch (menu) {
                    case 1:
                        System.out.println("========== INPUT DATA ==========");
                        System.out.print("Nama: ");
                        univ.setNama(rd.readLine());
                        System.out.print("Alamat: ");
                        univ.setAlamat(rd.readLine());
                        System.out.print("NIM: ");
                        mhs.setNim(rd.readLine());
                        System.out.print("Prodi: ");
                        mhs.setProdi(rd.readLine());
                        System.out.print("Angkatan: ");
                        mhs.setAngkatan(Integer.parseInt(rd.readLine()));
                        mhs.setSPP();
                        System.out.print("Semester: ");
                        mhs.setSemester(Integer.parseInt(rd.readLine()));

                        System.out.println("========== SPP Mahasiswa ==========");
                        System.out.println("Nama: " + univ.getNama());
                        System.out.println("Alamat: " + univ.getAlamat());
                        System.out.println("NIM: " + mhs.getNim());
                        System.out.println("Prodi: " + mhs.getProdi());
                        System.out.println("Angkatan: " + mhs.getAngkatan());
                        System.out.println("Semester: " + mhs.getSemester());
                        System.out.println("SPP: Rp " + mhs.getSPP());
                        System.out.println("===================================");
                        break;

                    case 2:
                        System.out.println("========== INPUT DATA ==========");
                        System.out.print("Nama: ");
                        univ.setNama(rd.readLine());
                        System.out.print("Alamat: ");
                        univ.setAlamat(rd.readLine());
                        System.out.print("NIK: ");
                        kry.setNIK(rd.readLine());
                        System.out.print("Bagian: ");
                        kry.setBagian(rd.readLine());
                        System.out.print("Kehadiran: ");
                        kry.setKehadiran(Integer.parseInt(rd.readLine()));
                        System.out.print("Gaji per hari: ");
                        kry.setGaji(Integer.parseInt(rd.readLine()));

                        System.out.println("========== Gaji Karyawan ==========");
                        System.out.println("Nama: " + univ.getNama());
                        System.out.println("Alamat: " + univ.getAlamat());
                        System.out.println("NIK: " + kry.getNIK());
                        System.out.println("Bagian: " + kry.getBagian());
                        System.out.println("Kehadiran: " + kry.getKehadiran());
                        System.out.println("Gaji per hari: " + kry.getGajiPerHari());
                        System.out.println("Total gaji: " + kry.getGaji());
                        System.out.println("===================================");
                        break;

                    case 3:
                        System.exit(0);
                        break;

                    default:
                        break;
                }
            } while (true);
        } catch (Exception e) {
        }
    }
}