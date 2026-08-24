public class Carro extends Veiculo {

    public Carro(double taxa) {
        this.taxaDiaria = taxa;
    }

    @Override
    public double calcularValorTotal(int numDias) {
        return taxaDiaria * numDias;
    }
}