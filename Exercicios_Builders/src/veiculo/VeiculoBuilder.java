package veiculo;

public class VeiculoBuilder {

    Veiculo veiculo = new Veiculo();

    public VeiculoBuilder setTipo(String tipo){
        veiculo.setTipo(tipo);
        return this;
    }

    public VeiculoBuilder setCor(String cor){
        veiculo.setCor(cor);
        return this;
    }

    public VeiculoBuilder setRoda(int roda){
        veiculo.setRodas(roda);
        return this;
    }

    public Veiculo build(){
        return this.veiculo;
    }

}
