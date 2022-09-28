/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Constructor;

/**
 *
 * @author naufa
 */
public class Akun {
    
    //username, password
    private String username, password;
    
    //constructor non parameter (admin)
    public Akun(){
        //user admin sudah ditentukan username dan password
        username = "admin";
        password = "admin";
    }
    
    //constructor parameter (akun baru)
    public Akun(String u, String p){
        username = u;
        password = p;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    
}
