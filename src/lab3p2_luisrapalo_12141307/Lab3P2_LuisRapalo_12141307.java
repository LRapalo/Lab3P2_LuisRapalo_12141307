package lab3p2_luisrapalo_12141307;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Lab3P2_LuisRapalo_12141307 {
    static Scanner lea = new Scanner (System.in);
    static Random r = new Random ();
    
    public static void main(String[] args) {
        // TODO code application logic here
        boolean Centinela = true;
        ArrayList<Personajes> p = new ArrayList();
        p.add(new Clérigo("Dios", "Bueno", "Mati", "Elfo", 2.20, 48.4, 23, "Heroe", "Norfair", "Lead", 70, 97, 40));
        p.add(new Bárbaro("Ligera", 30, "Carlos", "Mediano", 1.50, 30.2, 19, "Loco", "Brinstar", "Offensive", 60, 93, 65));
        p.add(new Mago("Magia Blanca", "Hector", "Humano", 1.78, 38.5, 19, "Killer", "Crateria", "Support", 70, 101, 20));
        p.add(new Pícaro("Piedra Antigua", 8, "Nuila", "Enano", 1.90, 41.8, 23, "Master", "Zebes", "Tank", 65, 80, 50));
        
        
        while (Centinela == true){
            System.out.println("----MENU----\n"
                    + "1) Creacion de personajes \n"
                    + "2) Modificar personajes\n"
                    + "3) Ver atributos de un personaje\n"
                    + "4) Eliminar Personajes\n"
                    + "5) Combate\n"
                    + "------------\n"
                    + " Que opcion desea ingresar: ");
            int opcion = lea.nextInt();
            
            switch (opcion){
                case 1: {
                    System.out.println("CREACION DE PERSONAJE");
                    System.out.println("Ingrese que clase de personaje quiere a su personaje: \n"
                            + "1) Clérogo\n"
                            + "2) Bárbaro\n"
                            + "3) Mago\n"
                            + "4) Pícaro");
                    int opcionp = lea.nextInt();
                    
                    System.out.println("Ingrese un nombre al personaje:");
                    String nombre = lea.next();
                    
                    System.out.println("Ingrese la raza del personaje:\n"
                            + "1) Mediano\n"
                            + "2) Enano\n"
                            + "3) Elfo\n"
                            + "4) Humano");
                    int opcionr = lea.nextInt();
                    String raza = "";
                    int HP = 0;
                    switch (opcionr){
                        case 1:{
                            raza = "Mediano";
                            HP = 50 + r.nextInt(10);
                        }
                        break;
                        case 2:{
                            raza = "Enano";
                            HP = 80 + r.nextInt(20);
                        }
                        break;
                        case 3:{
                            raza = "Elfo";
                            HP = 50 + r.nextInt(20);
                        }
                        break;
                        case 4:{
                            raza = "Humano";
                            HP = 40 + r.nextInt(35);
                        }
                        break;
                        default:
                            System.out.println("Opcion inxistente");
                    }
                    System.out.println("Ingrese la estatura de su personaje:");
                    double estatura = lea.nextDouble();
                    System.out.println("Ingrese el peso de su personaje:");
                    double peso = lea.nextDouble();
                    System.out.println("Ingrese los años de su personaje:");
                    int años = lea.nextInt();
                    System.out.println("Ingrese las descripcion de su personaje: ");
                    String descripcion = lea.next();
                    System.out.println("Ingrese la nacionalidad de su personaje: \n"
                            + "1) Norfair\n"
                            + "2) Brinstar\n"
                            + "3) Maridia\n"
                            + "4) Zebes\n"
                            + "5) Crateria");
                    int opcionn = lea.nextInt();
                    String nacion = "";
                    
                    switch (opcionn){
                        case 1:{
                            nacion = "Norfair";
                        }
                        break;
                        case 2:{
                            nacion = "Brinstar";
                        }
                        break;
                        case 3:{
                            nacion = "Maridia";
                        }
                        break;
                        case 4:{
                            nacion = "Zebes";
                        }
                        break;
                        case 5:{
                            nacion = "Crateria";
                        }
                        break;
                        default:
                            System.out.println("Opcion inexistente");
                    }
                    System.out.println("Ingrese que tipo de personaje es:\n"
                            + "1) Lead\n"
                            + "2) Support\n"
                            + "3) Offensive\n"
                            + "4) Spammer\n"
                            + "5) Tank");
                    int opciont = lea.nextInt();
                    String tipop = "";
                    
                    
                    switch (opciont){
                        case 1: {
                            if (opcionp == 1 && opcionp == 2){
                                tipop = "Lead";
                            }
                            else {
                                System.out.println("Tu personaje no puede tener este tipo");
                            }
                        }
                        break;
                        case 2: {
                            if (opcionp == 2 && opcionp == 3){
                                tipop = "Support";
                            }
                            else {
                                System.out.println("Tu personaje no puede tener este tipo");
                            }
                        }
                        break;
                        case 3: {
                            if (opcionp == 2){
                                tipop = "Offensive";
                            }
                            else {
                                System.out.println("Tu personaje no puede tener este tipo");
                            }
                        }
                        break;
                        case 4: {
                            if (opcionp == 4){
                                tipop = "Spammer";
                            }
                            else {
                                System.out.println("Tu personaje no puede tener este tipo");
                            }
                        }
                        break;
                        case 5: {
                            if (opcionp == 3 && opcionp == 4){
                                tipop = "Tank";
                            }
                            else {
                                System.out.println("Tu personaje no puede tener este tipo");
                            }
                        }
                        break;
                        
                    }
                    
                    int CS=0,AC=0;
                    String creencia = "";
                    String arma = "";
                    int xp = 20;
                    String magia = "";
                    String instrumento = "";
                    int robos = lea.nextInt();
                    String tipoinvo = lea.next();
                    
                    switch (opcionp){
                        case 1: {
                            //Clérigo
                            CS = 97;
                            AC = 40;
                            System.out.println("Ingrese la creencia del Clérigo:\n"
                                    + "1) Dios\n"
                                    + "2) Demonio");
                            int opcionc = lea.nextInt();
                            
                            switch (opcionc){
                                case 1:{
                                    creencia = "Dios";
                                }
                                break;
                                case 2:{
                                    creencia = "Demonio";
                                }
                                break;
                                default:
                                    System.out.println("Opcion Inexistente");
                            }
                            
                            System.out.println("Ingrese que tipo de invocacion tiene el clérigo:");
                        }
                        break;
                        case 2: {
                            //Bárbaro
                            CS = 93;
                            AC = 65;
                            System.out.println("Ingrese que tipo de arma usa el barbaro:\n"
                                    + "1) Pesada\n"
                                    + "2) Ligera\n"
                                    + "3) Escudo");
                            int opciona = lea.nextInt();
                            
                            switch (opciona){
                                case 1: {
                                    arma = "Pesada";
                                }
                                break;
                                case 2: {
                                    arma = "Ligera";
                                }
                                break;
                                case 3: {
                                    arma = "Escudo";
                                }
                                break;
                                default:
                                    System.out.println("Opcion Inexistente");
                            }
                        }
                        break;
                        case 3: {
                            //Mago
                            CS = 101;
                            AC = 20;
                            System.out.println("Ingrese el tipo de magia que tiene le mago\n"
                                    + "1) Mago Blanco\n"
                                    + "2) Mago Negro\n"
                                    + "3) Sanador");
                            int opcionm = lea.nextInt();
                            
                            switch (opcionm){
                                case 1: {
                                    magia = "Mago Blanco";
                                }
                                break;
                                case 2: {
                                    magia = "Mago Negro";
                                }
                                break;
                                case 3: {
                                    magia = "Sanador";
                                }
                                break;
                                default: 
                                    System.out.println("Opcion Inexistente");
                            }
                        }
                        break;
                        case 4: {
                            //Pícaro
                            CS = 80;
                            AC = 50;
                            System.out.println("Ingrese el instrumento del picaro:\n"
                                    + "1) Amuleto\n"
                                    + "2) Arma\n"
                                    + "3) Piedra Antigua");
                            int opcioni = lea.nextInt();
                            System.out.println("Ingrese la cantidad de robos existosos del pícaro");
                            
                            switch (opcioni){
                                case 1:{
                                    instrumento = "Amuleto";
                                }
                                break;
                                case 2:{
                                    instrumento = "Arma";
                                }
                                break;
                                case 3:{
                                    instrumento = "Piedra Antigua";
                                }
                                break;
                            }
                        }
                        break;
                        default:
                            System.out.println("Opcion inxistente");
                    }
                    p.add(new Clérigo(creencia, tipoinvo, nombre, raza, estatura, peso, años, descripcion, nacion, tipop, HP, CS, AC));
                    p.add(new Bárbaro(arma, xp, nombre, raza, estatura, peso, años, descripcion, nacion, tipop, HP, CS, AC));
                    p.add(new Mago(magia, nombre, raza, estatura, peso, años, descripcion, nacion, tipop, HP, CS, AC));
                    p.add(new Pícaro(instrumento, robos, nombre, raza, estatura, peso, años, descripcion, nacion, tipop, HP, CS, AC));
                }
                break;
                case 2: {
                    
                }
                break;
                case 3: {
                    
                }
                break;
                case 4: {
                    System.out.println("Ingrese la posicion del personaje que desea eliminar");
                    int pos = lea.nextInt();
                    
                    if (pos < p.size() -1){
                        p.remove(pos);
                    }
                }
                break;
                case 5: {
                    
                }
                break;
                default :
                    System.out.println("Opcion inexistente!");
            }
        }
    }
    
}
