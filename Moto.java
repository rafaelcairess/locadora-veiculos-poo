public class Moto extends Veiculo {

    public Moto(double taxa) {
        this.taxaDiaria = taxa;
    }

    @Override
    public double calcularValorTotal(int numDias) {
        return taxaDiaria * numDias;
    }
}