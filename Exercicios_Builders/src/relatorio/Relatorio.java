package relatorio;

public class Relatorio {

    private String titulo = "";
    private String corpo = "";
    private String rodape = "";

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public void setRodape(String rodape) {
        this.rodape = rodape;
    }

    public String toString(){
        return "\nTitulo: " + this.titulo + "\nCorpo: " + this.corpo + "\nRodape: " + this.rodape;
    }



}
