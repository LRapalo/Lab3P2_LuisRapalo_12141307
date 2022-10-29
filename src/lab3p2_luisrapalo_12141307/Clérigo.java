package lab3p2_luisrapalo_12141307;
public class Clérigo extends Personajes{
    private String creencia,tipoinvo;

    public Clérigo() {
    }

    public Clérigo(String creencia, String tipoinvo) {
        this.creencia = creencia;
        this.tipoinvo = tipoinvo;
    }

    public Clérigo(String creencia, String tipoinvo, String nombre, String raza, double estatura, double peso, int años, String descripcion, String nacion, String tipop, int HP, int CS, int AC) {
        super(nombre, raza, estatura, peso, años, descripcion, nacion, tipop, HP, CS, AC);
        this.creencia = creencia;
        this.tipoinvo = tipoinvo;
    }

    public String getCreencia() {
        return creencia;
    }

    public void setCreencia(String creencia) {
        this.creencia = creencia;
    }

    public String getTipoinvo() {
        return tipoinvo;
    }

    public void setTipoinvo(String tipoinvo) {
        this.tipoinvo = tipoinvo;
    }

    @Override
    public String toString() {
        return super.toString() + "Cl\u00e9rigo{" + "creencia=" + creencia + ", tipoinvo=" + tipoinvo + '}';
    }

    
}
