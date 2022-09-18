/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_M2;
/**
 *
 * @author naufal
 */
public class Karyawan {
    private String nik, bagian;
    private int kehadiran, gaji_per_hari, totalGaji;

    // setter
    public void setNIK(String nik) {
        this.nik = nik;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }

    public void setGaji(int gajiperhari) {
        gaji_per_hari = gajiperhari;
    }

    // getter
    public String getNIK() {
        return this.nik;
    }

    public String getBagian() {
        return this.bagian;
    }

    public int getKehadiran() {
        return this.kehadiran;
    }

    public int getGajiPerHari() {
        return this.gaji_per_hari;
    }

    public int getGaji() {
        totalGaji = getGajiPerHari() * getKehadiran();
        return this.totalGaji;
    }
}