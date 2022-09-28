/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Constructor;
import java.io.*;
/**
 *
 * @author naufal
 */
public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        
        /*Object (instance of class)
        Karena ada 2 constructor, maka dibuat 2 object
        1. admin
        2. akun baru
        */
        Akun admin = new Akun();
        Akun akunbaru = new Akun("","");
        String username;
        String password;
        //menu
        do{
            System.out.println("-----Login-----");
            System.out.println("1. Login Akun  ");
            System.out.println("2. Buat Akun Baru");
            System.out.println("3. Lihat Akun  ");
            System.out.println("4. Ubah Password");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu: ");
            int menu = Integer.parseInt(br.readLine());
            switch(menu){
                case 1:
                    System.out.println("-----Login-----");
                    System.out.println("Masukan Username: ");
                    username = br.readLine();
                    System.out.println("Masukan Password: ");
                    password = br.readLine();
                    
                    //
                    if (username.equalsIgnoreCase(admin.getUsername())
                        && password.equals(admin.getPassword())){
                        System.out.println("Sukses");
                    }else{
                        System.out.println("Gagal");
                    }
                    break;
                case 2:
                    System.out.println("Buat Akun");
                    System.out.print("Masukan Username: ");
                    username = br.readLine();
                    System.out.print("Masukan Password: ");
                    password = br.readLine();
                    
                    //memasukkan variable kedalam constructor
                    akunbaru = new Akun(username, password);
                    break;
                case 3:
                    System.out.println("Lihat akun");
                    System.out.println("1. Admin");
                    System.out.println("Username: " + admin.getUsername());
                    System.out.println("Password: " + admin.getPassword());
                    System.out.println("");
                    System.out.println("2. Akun Baru");
                    System.out.println("Username: " + akunbaru.getUsername());
                    System.out.println("Password: " + akunbaru.getPassword());
                    
                    break;
                case 4:
                    System.out.println("Ubah Password");
                    System.out.print("Masukkan password lama: ");
                    String pass_lama = br.readLine();
                   
                    if(pass_lama.equals(akunbaru.getPassword())){
                       System.out.print("Masukkan password baru: ");
                   //String pass_baru = br.readLine();
                       akunbaru.setPassword (br.readLine());  
                       System.out.println(akunbaru.getPassword());
                       System.out.println("Password berhasil diubah");
                   }else{
                        System.out.println("Password lama tidak ditemukan");
                   }
                    break;
                case 5:
                    System.out.println("Keluar");
                        System.exit(0);
                    break;
            }
            
        }while (true);
        
    }
    
}
