import java.util.Scanner;

import com.br.vendas.Produto;
import com.br.vendas.Venda;
import com.br.vendas.Vendedor;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Inicializando objetos
		Venda venda = new Venda();
		Vendedor vendedor = new Vendedor();
		Produto prod = new Produto();

		Integer result;

		Boolean menu = true;

		while (menu == true) {

			System.out.println("Digite 1 para cadastrar um vendedor.");
			System.out.println("Digite 2 para registrar uma venda.");
			System.out.println("Digite 3 para cadastrar um produto.");
			System.out.println("Digite 4 para exibir o status da venda.");
			System.out.println("Digite 100 para encerrar o programa.");
			result = sc.nextInt();

			if (result.equals(100)) {
				System.out.println("Programa encerrado!");
				menu = false;
			} else if (result != 1 && result != 2 && result != 3) {
				System.out.println("Digite uma opção válida!");
				menu = true;
			}

			if (result == 1) {
				vendedor.cadastrar();
			}

			if (result == 2) {
				venda.cadastrarVenda();
			}

			if (result == 3) {
				prod.cadastrarProduto();
			}

			if (result == 4) {
				vendedor.status();
				venda.imprimir();
				prod.status();
			}

		}
		sc.close();
	}

}
