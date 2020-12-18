package pojos;

public class Obras extends Compra {
    private String estilo;

    public Obras(String numeroRegistro, String artista, double precioCuadro, String estilo) {
        super(numeroRegistro, artista, precioCuadro);
        this.estilo = estilo;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
}
