public class Main {
    public static void main(String[] args) {
        TelefoneCelular celular = new TelefoneCelular("Samsung", "Galaxy S21", "Preto", 4000, 2999.99);

        System.out.println("Detalhes do Telefone Celular:");
        System.out.println("Marca: " + celular.getMarca());
        System.out.println("Modelo: " + celular.getModelo());
        System.out.println("Cor: " + celular.getCor());
        System.out.println("Capacidade da Bateria: " + celular.getCapacidadeBateria() + "mAh");
        System.out.println("Preço: R$" + celular.getPreco());

        celular.setMarca("Apple");
        celular.setModelo("iPhone 14");
        celular.setCor("Prata");
        celular.setCapacidadeBateria(3300);
        celular.setPreco(9999.99);

        System.out.println("\nDetalhes atualizados do Telefone Celular:");
        System.out.println("Marca: " + celular.getMarca());
        System.out.println("Modelo: " + celular.getModelo());
        System.out.println("Cor: " + celular.getCor());
        System.out.println("Capacidade da Bateria: " + celular.getCapacidadeBateria() + "mAh");
        System.out.println("Preço: R$" + celular.getPreco());
    }
}
