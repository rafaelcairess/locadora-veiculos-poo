public class App {
    public static void main(String[] args) {

        Carro carro = new Carro(50.0);
        Moto moto = new Moto(25.0);

        System.out.println("Valor do carro por 10 dias: R$ "
                + carro.calcularValorTotal(10));

        System.out.println("Valor da moto por 10 dias: R$ "
                + moto.calcularValorTotal(10));
    }
}