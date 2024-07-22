package ExerciciosEmCasa;

public class FaturaTeste {
	
    public static void main(String[] args) {
        Fatura fatura1 = new Fatura("1234", "Teclado", 5, 150.0);
        System.out.println("Fatura 1");
        System.out.println("Número: " + fatura1.getNumero());
        System.out.println("Descrição: " + fatura1.getDescricao());
        System.out.println("Quantidade: " + fatura1.getQuantidade());
        System.out.println("Preço por item: " + fatura1.getPreco());
        System.out.println("Total da Fatura: " + fatura1.getTotalFatura());

        
        Fatura fatura2 = new Fatura("5678", "Mouse", -2, -50.0);
        System.out.println("\nFatura 2");
        System.out.println("Número: " + fatura2.getNumero());
        System.out.println("Descrição: " + fatura2.getDescricao());
        System.out.println("Quantidade: " + fatura2.getQuantidade());
        System.out.println("Preço por item: " + fatura2.getPreco());
        System.out.println("Total da Fatura: " + fatura2.getTotalFatura());
    }
}
