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
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Undika udk = new Undika();
        Karyawan kry = new Karyawan();
        Mahasiswa mhs = new Mahasiswa();

        try {
            do {
                System.out.println("======== MENU =======");
                System.out.println("1. Cek SPP Mahasiswa");
                System.out.println("2. Cek Gaji Karyawan");
                System.out.println("3. Keluar Aplikasi");
                System.out.print("Pilih menu: ");
                int menu = Integer.parseInt(br.readLine());
                System.out.println("====================");
                switch (menu) {
                    case 1:
                        System.out.println("======== INPUT DATA ========");
                        System.out.print("Nama: ");
                        udk.setNama(br.readLine());
                        System.out.print("Alamat: ");
                        udk.setAlamat(br.readLine());
                        System.out.print("NIM: ");
                        mhs.setNim(br.readLine());
                        System.out.print("Prodi: ");
                        mhs.setProdi(br.readLine());
                        System.out.print("Angkatan: ");
                        mhs.setAngkatan(Integer.parseInt(br.readLine()));
                        mhs.setSPP();
                        System.out.print("Semester: ");
                        mhs.setSemester(Integer.parseInt(br.readLine()));

                        System.out.println("======== SPP Mahasiswa ========");
                        System.out.println("Nama: " + udk.getNama());
                        System.out.println("Alamat: " + udk.getAlamat());
                        System.out.println("NIM: " + mhs.getNim());
                        System.out.println("Prodi: " + mhs.getProdi());
                        System.out.println("Angkatan: " + mhs.getAngkatan());
                        System.out.println("Semester: " + mhs.getSemester());
                        System.out.println("SPP: Rp " + mhs.getSPP());
                        System.out.println("===============================");
                        break;

                    case 2:
                        System.out.println("===== INPUT DATA =====");
                        System.out.print("Nama: ");
                        udk.setNama(br.readLine());
                        System.out.print("Alamat: ");
                        udk.setAlamat(br.readLine());
                        System.out.print("NIK: ");
                        kry.setNIK(br.readLine());
                        System.out.print("Bagian: ");
                        kry.setBagian(br.readLine());
                        System.out.print("Kehadiran: ");
                        kry.setKehadiran(Integer.parseInt(br.readLine()));
                        System.out.print("Gaji per hari: ");
                        kry.setGaji(Integer.parseInt(br.readLine()));

                        System.out.println("===== Gaji Karyawan =====");
                        System.out.println("Nama: " + udk.getNama());
                        System.out.println("Alamat: " + udk.getAlamat());
                        System.out.println("NIK: " + kry.getNIK());
                        System.out.println("Bagian: " + kry.getBagian());
                        System.out.println("Kehadiran: " + kry.getKehadiran());
                        System.out.println("Gaji per hari: " + kry.getGajiPerHari());
                        System.out.println("Total gaji: " + kry.getGaji());
                        System.out.println("==========================");
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