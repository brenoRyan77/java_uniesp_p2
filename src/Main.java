import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import com.br.vendas.Produto;
import com.br.vendas.Venda;
import com.br.vendas.Vendedor;

public class Main {
	
	List<Vendedor> listaVendedor = new ArrayList<>();
	List<Produto> listaProduto = new ArrayList<>();
	List<Venda> listaVenda = new ArrayList<>();

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	Main main = new Main();
    	short menu = 0;

    	do {
    		
    		System.out.println("\n");
            System.out.println("+-------------------------------------------+");
            System.out.println("|        Menu de Opções                     |");
            System.out.println("+-------------------------------------------+");
            System.out.println("| 1 - Cadastrar Vendedor                    |");
            System.out.println("| 2 - Cadastrar Vendas                    	|");
            System.out.println("| 3 - Cadastrar Produto                    	|");
            System.out.println("| 4 - Resumo de vendas                    	|");
            System.out.println("| 100 - Sair                                |");
            System.out.println("+-------------------------------------------+");
            
            if(sc.hasNextShort()) {
            	menu = sc.nextShort();
            	
            } else {
            	sc.next();
            }
            
            switch (menu) {
			case 1:
				main.cadastrarVendedor();
				break;
				
			case 2:
				main.cadastrarVenda();
				break;
				
			case 3:
				main.cadastrarProduto();
				break;
				
			case 4:
				main.listar();
				break;
				
			case 100:
				System.out.println("Finalizando Projeto!");
				break;
				
			default:
				System.out.println("Digite um opção válida!");
				break;
			}
    		
    	} while(menu != 100);
       
   
   }
    
    public void cadastrarVendedor() {
    	
    	try {
    		
    		Scanner sc = new Scanner(System.in);
    		
    		Vendedor vendedor = new Vendedor();
    		
    		vendedor.setCodigo(listaVendedor.size() + 1);
    		
    		System.out.print("Nome do vendedor: ");
    		vendedor.setNome(sc.nextLine());
    		
    		System.out.print("Endereço: ");
    		vendedor.setEndereco(sc.nextLine());
    		
    		System.out.print("Comissão: ");
    		vendedor.setComissao(sc.nextDouble());
    		
    		
    		listaVendedor.add(vendedor);
    		sc.close();
    		
    	} catch (Exception e) {
			System.out.println("Algo de errado não está certo!");
		}
    }
    
    public void cadastrarVenda() {
    	
    	Scanner sc = new Scanner(System.in);
    	Venda venda = null;
    	Produto prod = null;
    	Vendedor vendedor = null;
    	
    	try {
    		
    		venda = new Venda();
    		prod = new Produto();
    		
			/*
			 * if(listaVendedor.size() == 0) {
			 * System.out.print("Nenhum vendedor cadastrado na base de dados!"); }
			 * 
			 * if(listaProduto.size() == 0) {
			 * System.out.print("Nenhum produto cadastrado na base de dados!"); }
			 */
    		boolean c = true;
    		while(c) {
    			System.out.print("Digite o código do produto: ");
    			Integer nrProduto = sc.nextInt();
    			
    			
    			prod = listaProduto.stream().filter(produto -> nrProduto.equals(produto.getCodigo())).findAny().orElse(null);
    			
    			if(prod != null) {
    				venda.setProduto(prod);
    				c = false;
    			}
    		}
    		
    		while(true) {
    			
    			System.out.print("Digite o código do vendedor!");
    			
    			Integer nrVendedor = sc.nextInt();
    			
    			vendedor = listaVendedor.stream().filter(ven -> nrVendedor.equals(ven.getCodigo())).findAny().orElse(null);
    			
    			if(vendedor != null) {
    				venda.setVendedor(vendedor);
    				break;
    			}
    		}
    		
    		System.out.print("Digite a quantidade de itens: ");
    		venda.setQuantidadeItens(sc.nextInt());
    		
    		System.out.print("Valor do desconto: ");
    		venda.setDesconto(sc.nextDouble());
    		
    		listaProduto.add(prod);
    		listaVenda.add(venda);
    		
    	} catch (Exception e) {
			System.out.println("Erro no cadastro de venda");
		}
    }

    public void listar() {
    	
    	if(listaVenda.size() == 0 || listaVendedor.size() == 0 || listaProduto.size() == 0) {
    		System.out.println("Está tudo vazio!");
    	}
    	
    	listaVenda.stream().forEach(Venda::imprimir);
    }
    
    public void cadastrarProduto() {
    	
    	Scanner sc = new Scanner(System.in);
    	Produto prod = null;
    	
    	try {
    		
    		prod = new Produto();
    		
    		prod.setCodigo(listaProduto.size() + 1);
    		
    		System.out.print("Descrição:");
    		prod.setDescricao(sc.nextLine());
    		
    		System.out.print("Valor da venda:");
    		prod.setValorVenda(sc.nextDouble());
    		
    		System.out.print("Valor de custo: ");
    		prod.setValorCusto(sc.nextDouble());
    		
    		int promo = 0;
    		
    		while(promo != 1 && promo != 2) {
    			
    			System.out.print("Promoção? (1 - SIM / 2 - NÂO): ");
    			
    			if(sc.hasNextInt()) {
    				promo = sc.nextInt();
    				
    				if(promo != 1 && promo != 2) {
    					System.out.println("Digite uma opção válida");
    				}
    				
    				prod.setPromocao(Objects.equals(promo, 1));
    				
    			} else {
    				
    				promo = 0;
    				System.out.print("Digite uma opção válida");
    			}
    		}
    		
    		listaProduto.add(prod);
    		
    	} catch (Exception e) {
			System.out.println("Erro ao cadastrar produto");
		}
    	
    }
    
}
