public class TelefoneCelular {
    private String marca;
    private String modelo;
    private String cor;
    private int capacidadeBateria;
    private double preco;

    public TelefoneCelular(String marca, String modelo, String cor, int capacidadeBateria, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.capacidadeBateria = capacidadeBateria;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public void setCapacidadeBateria(int capacidadeBateria) {
        this.capacidadeBateria = capacidadeBateria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
