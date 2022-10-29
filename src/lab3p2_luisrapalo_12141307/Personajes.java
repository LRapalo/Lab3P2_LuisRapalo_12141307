package lab3p2_luisrapalo_12141307;

import java.util.ArrayList;

public class Personajes {
    protected String nombre;
    protected String raza;
    protected double estatura;
    protected double peso;
    protected int años;
    protected String descripcion;
    protected String nacion;
    protected String tipop;
    protected int HP;
    protected int CS;
    protected int AC;
    private ArrayList<Clérigo> clérigo = new ArrayList();
    private ArrayList<Bárbaro> bárbaro = new ArrayList();
    private ArrayList<Mago> mago = new ArrayList();
    private ArrayList<Pícaro> pícaro = new ArrayList();
    
    public Personajes() {
    }

    public Personajes(String nombre, String raza, double estatura, double peso, int años, String descripcion, String nacion, String tipop, int HP, int CS, int AC) {
        this.nombre = nombre;
        this.raza = raza;
        this.estatura = estatura;
        this.peso = peso;
        this.años = años;
        this.descripcion = descripcion;
        this.nacion = nacion;
        this.tipop = tipop;
        this.HP = HP;
        this.CS = CS;
        this.AC = AC;
    }
    
    
    
    
    
}
