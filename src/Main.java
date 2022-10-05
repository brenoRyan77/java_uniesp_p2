import com.br.vendas.Produto;
import com.br.vendas.Venda;
import com.br.vendas.Vendedor;

public class Main {

    public static void main(String[] args) {

        Produto produto = new Produto(1, "TV",
                1200.00, 1000.00, false);

        Vendedor vendedor1 = new Vendedor("Breno", 1, "Rua A");
        vendedor1.setComissao(7.00);

        Venda venda = new Venda();

        venda.setProduto(produto);
        venda.setVendedor(vendedor1);
        venda.setQuantidadeItens(2);
        venda.calcularValor();
        venda.calcularComissao();
        venda.imprimir();

        System.out.println("\n== Venda 2 ==");

        Produto produto2 = new Produto(2, "Teclado", 100.00, 80.00, true);

        Vendedor vendedor2 = new Vendedor("João", 2, "Rua B");
        vendedor2.setComissao(5.00);

        Venda venda2 = new Venda();

        venda2.setProduto(produto2);
        venda2.setVendedor(vendedor2);
        venda2.setQuantidadeItens(3);
        venda2.setDesconto(10.00);
        venda2.calcularValor();
        venda2.calcularComissao();
        venda2.imprimir();

        System.out.println("\n== Venda 3 ==");

        Venda venda3 = new Venda();

        venda3.setProduto(produto2);
        venda3.setVendedor(vendedor2);
        venda3.efetuarDesconto(30.00);
        venda3.setQuantidadeItens(2);
        venda3.setDesconto(10.00);
        venda3.calcularValor();
        venda3.calcularComissao();
        venda3.imprimir();

    }
}
