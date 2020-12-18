package pojos;

public class Expocicon {
    protected String  numeroRegistro;
    protected String artista;

    public Expocicon(String numeroRegistro, String artista) {
        this.setNumeroRegistro(numeroRegistro);
        this.setArtista(artista);
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Expocicon{" +
                "numeroRegistro='" + numeroRegistro + '\'' +
                ", artista='" + artista + '\'' +
                '}';
    }
}
