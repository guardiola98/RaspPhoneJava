package Agenda;

import java.util.stream.*;
import java.util.ArrayList;
import Contacto.Contacto;
public class Agenda {


    private ArrayList<Contacto> contactos ;

    public Agenda(){
        this.contactos = new ArrayList<Contacto>();
    }

    public void listarAgenda(){

        for(int i =1; i<=contactos.size();i++ ){

            System.out.println("#"+i+"-"+contactos.get(i-1).getNombre());

        }

    }

    public int getNumContactos(){
        return contactos.size();
    }

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }

    public void anyadeContacto(String nombre, String telefono, String correo){
        contactos.add(new Contacto(nombre, telefono, correo));
    }



}
