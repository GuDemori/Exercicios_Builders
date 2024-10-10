import pizza.Pizza;
import pizza.PizzaBuilder;
import relatorio.Relatorio;
import relatorio.RelatorioBuilder;
import veiculo.Veiculo;
import veiculo.VeiculoBuilder;

public class Main {

    public static void main(String[] args) {
        System.out.println("Executar pizza:");
        executarPizza();

        System.out.println("\n\nExecutar veiculo:");
        executarVeiculo();

        System.out.println("\n\nExecutar relatorios:");
        executarRelatorio();
    }

    public static void executarPizza(){
        Pizza calabresa = new PizzaBuilder()
                .setMassa("padrão")
                .setTamanho("G")
                .setIngrediente("Calabresa")
                .build();
        System.out.println(calabresa.toString());
    }

    public static void executarVeiculo(){
        Veiculo palio = new VeiculoBuilder()
                .setTipo("hatch")
                .setCor("prata")
                .setRoda(4)
                .build();
        System.out.println(palio.toString());
    }

    public static void executarRelatorio(){
        Relatorio comRodape = new RelatorioBuilder()
                .setTitulo("titulo")
                .setCorpo("corpo")
                .setRodape("rodape")
                .build();

        Relatorio semRodape = new RelatorioBuilder()
                .setTitulo("titulo")
                .setCorpo("corpo")
                .build();

        System.out.println(comRodape.toString());
        System.out.println(semRodape.toString());
    }

}
