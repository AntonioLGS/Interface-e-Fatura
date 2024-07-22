package ExerciciosEmCasa;

public class FaturaTeste {

	public static void main(String[] args) {
		Fatura fatura1 = new Fatura("1234", "Teclado", 5, 150.0);
		System.out.printf(
				"Fatura 1: Número: %s, Descrição: %s, Quantidade: %d, Preço por item: %.2f, Total da Fatura: %.2f%n",
				fatura1.getNumero(), fatura1.getDescricao(), fatura1.getQuantidade(), fatura1.getPreco(),
				fatura1.getTotalFatura());

		Fatura fatura2 = new Fatura("5678", "Mouse", -2, -50.0);
		System.out.printf(
				"Fatura 2: Número: %s, Descrição: %s, Quantidade: %d, Preço por item: %.2f, Total da Fatura: %.2f%n",
				fatura2.getNumero(), fatura2.getDescricao(), fatura2.getQuantidade(), fatura2.getPreco(),
				fatura2.getTotalFatura());

	}

}