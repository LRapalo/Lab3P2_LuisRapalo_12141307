package lab3p2_luisrapalo_12141307;
public class Bárbaro extends Personajes{
    private String arma;
    private int xp;

    public Bárbaro() {
    }

    public Bárbaro(String arma, int xp) {
        this.arma = arma;
        this.xp = xp;
    }

    public Bárbaro(String arma, int xp, String nombre, String raza, double estatura, double peso, int años, String descripcion, String nacion, String tipop, int HP, int CS, int AC) {
        super(nombre, raza, estatura, peso, años, descripcion, nacion, tipop, HP, CS, AC);
        this.arma = arma;
        this.xp = xp;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    @Override
    public String toString() {
        return super.toString() + "B\u00e1rbaro{" + "arma=" + arma + ", xp=" + xp + '}';
    }

    
}
