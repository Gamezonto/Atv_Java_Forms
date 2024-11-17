// Classe principal
public class Main {
    public static void main(String[] args) {
        // Criando uma instância da classe Festa
        Festa festa = new Festa("Super-Heróis", 50, "Salão de Festas", "10/12/2024", 2000.0);

        // Exibindo os detalhes da festa
        festa.exibirDetalhes();

        // Atualizando os valores usando os setters
        festa.setTema("Princesas");
        festa.setQuantidadeConvidados(30);
        festa.setLocal("Parque");
        festa.setData("15/12/2024");
        festa.setCustoEstimado(1500.0);

        // Exibindo os detalhes atualizados
        System.out.println("\nDetalhes atualizados da Festa de Aniversário:");
        festa.exibirDetalhes();
    }
}
