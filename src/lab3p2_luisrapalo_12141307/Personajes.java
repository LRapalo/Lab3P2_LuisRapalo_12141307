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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNacion() {
        return nacion;
    }

    public void setNacion(String nacion) {
        this.nacion = nacion;
    }

    public String getTipop() {
        return tipop;
    }

    public void setTipop(String tipop) {
        this.tipop = tipop;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getCS() {
        return CS;
    }

    public void setCS(int CS) {
        this.CS = CS;
    }

    public int getAC() {
        return AC;
    }

    public void setAC(int AC) {
        this.AC = AC;
    }

    public ArrayList<Clérigo> getClérigo() {
        return clérigo;
    }

    public void setClérigo(ArrayList<Clérigo> clérigo) {
        this.clérigo = clérigo;
    }

    public ArrayList<Bárbaro> getBárbaro() {
        return bárbaro;
    }

    public void setBárbaro(ArrayList<Bárbaro> bárbaro) {
        this.bárbaro = bárbaro;
    }

    public ArrayList<Mago> getMago() {
        return mago;
    }

    public void setMago(ArrayList<Mago> mago) {
        this.mago = mago;
    }

    public ArrayList<Pícaro> getPícaro() {
        return pícaro;
    }

    public void setPícaro(ArrayList<Pícaro> pícaro) {
        this.pícaro = pícaro;
    }

    @Override
    public String toString() {
        return "Personajes{" + "nombre=" + nombre + ", raza=" + raza + ", estatura=" + estatura + ", peso=" + peso + ", a\u00f1os=" + años + ", descripcion=" + descripcion + ", nacion=" + nacion + ", tipop=" + tipop + ", HP=" + HP + ", CS=" + CS + ", AC=" + AC + ", cl\u00e9rigo=" + clérigo + ", b\u00e1rbaro=" + bárbaro + ", mago=" + mago + ", p\u00edcaro=" + pícaro + '}';
    }
    
}
