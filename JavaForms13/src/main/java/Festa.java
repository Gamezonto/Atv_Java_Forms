// Classe concreta Festa
public class Festa extends FestaDeAniversario {

    // Construtor que chama o da superclasse
    public Festa(String tema, int quantidadeConvidados, String local, String data, double custoEstimado) {
        super(tema, quantidadeConvidados, local, data, custoEstimado);
    }

    // Implementação do método abstrato
    @Override
    public void exibirDetalhes() {
        System.out.println("Detalhes da Festa de Aniversário:");
        System.out.println("Tema: " + getTema());
        System.out.println("Quantidade de Convidados: " + getQuantidadeConvidados());
        System.out.println("Local: " + getLocal());
        System.out.println("Data: " + getData());
        System.out.println("Custo Estimado: R$" + getCustoEstimado());
    }
}
