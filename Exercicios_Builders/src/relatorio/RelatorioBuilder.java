package relatorio;

public class RelatorioBuilder {

    Relatorio relatorio = new Relatorio();

    public RelatorioBuilder setTitulo(String titulo){
        relatorio.setTitulo(titulo);
        return this;
    }

    public RelatorioBuilder setCorpo(String corpo){
        relatorio.setCorpo(corpo);
        return this;
    }

    public RelatorioBuilder setRodape(String rodape){
        relatorio.setRodape(rodape);
        return this;
    }

    public Relatorio build(){
        return this.relatorio;
    }

}
