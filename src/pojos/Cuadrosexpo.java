package pojos;

public class Cuadrosexpo {
    private Artista artista;
    private Expocicon expocicon;
    private String titulo;
    private int presioSalida;

    public Cuadrosexpo(Artista artista, Expocicon expocicon, String titulo, int presioSalida) {
        this.setArtista(artista);
        this.setExpocicon(expocicon);
        this.setTitulo(titulo);
        this.setPresioSalida(presioSalida);
    }


    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public Expocicon getExpocicon() {
        return expocicon;
    }

    public void setExpocicon(Expocicon expocicon) {
        this.expocicon = expocicon;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPresioSalida() {
        return presioSalida;
    }

    public void setPresioSalida(int presioSalida) {
        this.presioSalida = presioSalida;
    }
}
