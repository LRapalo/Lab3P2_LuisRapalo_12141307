package lab3p2_luisrapalo_12141307;
public class Mago extends Personajes{
    private String magia;

    public Mago() {
    }

    public Mago(String magia) {
        this.magia = magia;
    }

    public Mago(String magia, String nombre, String raza, double estatura, double peso, int años, String descripcion, String nacion, String tipop, int HP, int CS, int AC) {
        super(nombre, raza, estatura, peso, años, descripcion, nacion, tipop, HP, CS, AC);
        this.magia = magia;
    }

    public String getMagia() {
        return magia;
    }

    public void setMagia(String magia) {
        this.magia = magia;
    }

    @Override
    public String toString() {
        return super.toString() + "Mago{" + "magia=" + magia + '}';
    }

    
}
