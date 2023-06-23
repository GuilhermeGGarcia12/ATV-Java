public class Main {
    public static void main(String[] args) {
        TelefoneCelular celular = new TelefoneCelular("Samsung", "Galaxy S21", "Preto", 5000, 3999.99);

        // Utilizando os setters para modificar os valores dos atributos
        celular.setMarca("Apple");
        celular.setModelo("iPhone 12");
        celular.setCor("Branco");
        celular.setCapacidadeBateria(4500);
        celular.setPreco(4999.99);

        // Exibindo os atributos utilizando os getters
        System.out.println("Marca: " + celular.getMarca());
        System.out.println("Modelo: " + celular.getModelo());
        System.out.println("Cor: " + celular.getCor());
        System.out.println("Capacidade da bateria: " + celular.getCapacidadeBateria() + " mAh");
        System.out.println("Preço: R$" + celular.getPreco());
    }
}
