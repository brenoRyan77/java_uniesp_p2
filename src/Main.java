import java.util.Scanner;

import com.br.vendas.Produto;
import com.br.vendas.Venda;
import com.br.vendas.Vendedor;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Venda venda = new Venda();
		Vendedor vendedor = new Vendedor();
		Produto prod = new Produto();

		String result;

		Boolean menu = true;

		while (menu == true) {

			System.out.println("Digite 1 para cadastrar um vendedor.");
			System.out.println("Digite 2 para registrar uma venda.");
			System.out.println("Digite 3 para cadastrar um produto.");
			System.out.println("Digite 4 para exibir o status da venda.");
			System.out.println("Digite 100 para encerrar o programa.");
			result = sc.nextLine();

			if (result.equals("100")) {
				System.out.println("Finalizando...");
				menu = false;
			} else if (!result.equals("1") && !result.equals("2") && !result.equals("3") && !result.equals("4")) {
				System.out.println("Digite uma opção válida!");
				menu = true;
			}

			if (result.equals("1")) {
				vendedor.cadastrar();
				System.out.println();
			}

			if (result.equals("2")) {
				venda.cadastrarVenda();
				System.out.println();
			}

			if (result.equals("3")) {
				prod.cadastrarProduto();
				System.out.println();
			}

			if (result.equals("4")) {
				vendedor.status();
				venda.imprimir();
				prod.status();
				System.out.println();
			}

		}
		sc.close();
	}

}
