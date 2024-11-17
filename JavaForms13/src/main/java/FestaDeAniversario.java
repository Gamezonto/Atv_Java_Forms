// Classe abstrata FestaDeAniversario
public abstract class FestaDeAniversario {
    // Atributos
    private String tema;
    private int quantidadeConvidados;
    private String local;
    private String data;
    private double custoEstimado;

    // Construtor
    public FestaDeAniversario(String tema, int quantidadeConvidados, String local, String data, double custoEstimado) {
        this.tema = tema;
        this.quantidadeConvidados = quantidadeConvidados;
        this.local = local;
        this.data = data;
        this.custoEstimado = custoEstimado;
    }

    // Getters e Setters
    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getQuantidadeConvidados() {
        return quantidadeConvidados;
    }

    public void setQuantidadeConvidados(int quantidadeConvidados) {
        this.quantidadeConvidados = quantidadeConvidados;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getCustoEstimado() {
        return custoEstimado;
    }

    public void setCustoEstimado(double custoEstimado) {
        this.custoEstimado = custoEstimado;
    }

    // Método abstrato
    public abstract void exibirDetalhes();
}
