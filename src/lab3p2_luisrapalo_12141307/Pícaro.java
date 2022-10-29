package lab3p2_luisrapalo_12141307;
public class Pícaro extends Personajes{
    private String instrumento;
    private int robos;

    public Pícaro() {
    }

    public Pícaro(String instrumento, int robos) {
        this.instrumento = instrumento;
        this.robos = robos;
    }

    public Pícaro(String instrumento, int robos, String nombre, String raza, double estatura, double peso, int años, String descripcion, String nacion, String tipop, int HP, int CS, int AC) {
        super(nombre, raza, estatura, peso, años, descripcion, nacion, tipop, HP, CS, AC);
        this.instrumento = instrumento;
        this.robos = robos;
    }

    
}
