package pojos;

public class Compra extends Expocicon{
    protected double precioCuadro;

    public Compra(String numeroRegistro, String artista, double precioCuadro) {
        super(numeroRegistro, artista);
        this.setPrecioCuadro(precioCuadro);
    }

    public double getPrecioCuadro() {
        return precioCuadro;
    }

    public void setPrecioCuadro(double precioCuadro) {
        this.precioCuadro = precioCuadro;
    }
}
