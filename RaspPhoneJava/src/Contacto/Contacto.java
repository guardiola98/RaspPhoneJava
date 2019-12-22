package Contacto;

import java.util.Scanner;

public class Contacto {

    private String nombre;
    private String telefono;
    private String email;

    public Contacto(String nombre, String telefono, String email){

        this.nombre=nombre;
        this.telefono=telefono;
        this.email=email;

    }

    public void cambiarNombre(){
        System.out.println("Nuevo nombre: ");
        Scanner sc =new Scanner(System.in);
        String n =sc.next();
        this.nombre=n;
    }

    public void cambiarTelefono(){
        System.out.println("Nuevo telefono: ");
        Scanner sc =new Scanner(System.in);
        String n =sc.next();
        this.telefono=n;
    }

    public void cambiarEmail(){
        System.out.println("Nuevo email: ");
        Scanner sc =new Scanner(System.in);
        String n =sc.next();
        this.email=n;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
