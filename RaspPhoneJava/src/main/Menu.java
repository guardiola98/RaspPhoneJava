package main;

import java.util.ArrayList;
import java.util.Scanner;
import Contacto.Contacto;
import Agenda.Agenda;


public class Menu {
    Agenda agenda;
    ArrayList<Contacto> contactos ;

    public Menu(){
        this.agenda=new Agenda();
        this.contactos=agenda.getContactos();
    }

    public void showMenu(){
        while(true) {
            int opcion = menuPrincipal();
            switch (opcion) {
                case 1:

                        opcion = menuAgenda();
                        switch (opcion) {
                            case 1://VER CONTACTOS
                                opcion = menuContacto();
                                if (opcion != agenda.getNumContactos()) {
                                    int numContacto = opcion - 1;
                                    opcion = menuEditarContacto();
                                    switch (opcion) {
                                        case 1:
                                            contactos.get(numContacto).cambiarNombre();

                                            break;
                                        case 2:
                                            contactos.get(numContacto).cambiarTelefono();
                                            break;
                                        case 3:
                                            contactos.get(numContacto).cambiarEmail();
                                            break;
                                        case 4:
                                            break;
                                    }
                                } else {
                                    break;
                                }
                                break;
                            case 2:  //ANADIR CONTACTO NUEVO
                                anyadeContacto();
                                break;
                            case 3:
                                break;


                    }
                    break;
                case 2:
                    break;
                case 3://TELEGRAM
                    abrirTelegram();
                    break;

            }
        }

    }




    public void anyadeContacto(){
        System.out.println("Introduce  el nuevo contacto con el formato:");
        System.out.println("Introduce  el nuevo contacto con el formato:");
        System.out.println("nombre#telefono#email");

        Scanner sc =new Scanner(System.in);
        String n =sc.next();
        String v[]=n.split("#");
        System.out.println(v.toString());
        this.agenda.anyadeContacto(v[0], v[1], v[2]);



    }
    public int menuAgenda(){
        System.out.println("#############################");
        System.out.println("#      Menu agenda          #");
        System.out.println("#############################");
        System.out.println("#1-Ver contactos            #");
        System.out.println("#2-Añadir contacto nuevo    #");
        System.out.println("#3-Atras                    #");
        System.out.println("#############################");
        System.out.println("Seleccione una opcion: ");

        Scanner sc =new Scanner(System.in);
        int opcion=sc.nextInt();
        return opcion;

    }
    public int menuContacto(){
        System.out.println("#############################");
        System.out.println("#           Agenda          #");
        System.out.println("#############################");
        this.agenda.listarAgenda();
        System.out.println((this.agenda.getNumContactos()+1) +"-Atras");

        System.out.println("Selecciona un contacto a editar: ");

        Scanner sc =new Scanner(System.in);
        int opcion=sc.nextInt();
        return opcion;

    }

    public int menuEditarContacto(){
        System.out.println("#############################");
        System.out.println("#    Edicion de contacto    #");
        System.out.println("#############################");
        System.out.println("#1-Cambiar nombre           #");
        System.out.println("#2-Cambiar telefono         #");
        System.out.println("#3-Cambiar email            #");
        System.out.println("#4-Atras                    #");
        System.out.println("#############################");
        System.out.println("Selecciona una opcion: ");

        Scanner sc =new Scanner(System.in);
        int opcion=sc.nextInt();
        return opcion;
    }



    public int menuPrincipal(){

        System.out.println("#############################");
        System.out.println("#      Menu principal       #");
        System.out.println("#############################");
        System.out.println("#1-Agenda                   #");
        System.out.println("#2-Fecha                    #");
        System.out.println("#3-Telegram                 #");
        System.out.println("#############################");
        System.out.println("Seleccione una opcion: ");
        Scanner sc =new Scanner(System.in);
        int opcion=sc.nextInt();
        return opcion;



    }
    public void abrirTelegram(){
        try{
            String[] cmd = {"sh","-c","/home/josep/Telegram/Telegram"};
            Process pb = Runtime.getRuntime().exec(cmd);
        }catch(Exception e){
            e.printStackTrace();
        }


    }

}
