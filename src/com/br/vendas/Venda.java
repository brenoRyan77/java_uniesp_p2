package com.br.vendas;

import java.util.Scanner;

public class Venda{
	
	Scanner sc = new Scanner(System.in);


    private Produto produto;
    private Vendedor vendedor;
    private Double desconto = 0.00;
    private Integer quantidadeItens;
    private Double valor;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Integer getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(Integer quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void efetuarDesconto(Double desconto){

        double descontoValor = this.produto.getValorVenda() * (desconto / 100);
        double valorDesconto = this.produto.getValorVenda() - descontoValor;

        if(valorDesconto < this.produto.getValorCusto()){
            System.out.println("Valor final do produto nï¿½o pode" +
                    " ser menor do que o valor de custo.");
        }

        this.desconto = this.produto.getValorVenda() - valorDesconto;


    }

    public void calcularValor(){

        this.valor = this.quantidadeItens *
                this.produto.getValorVenda() - this.quantidadeItens * this.desconto;
    }

    public Double calcularComissao(){

        double comissao = this.valor * (this.vendedor.getComissao() / 100);
        Boolean promocao = this.produto.getPromocao();

        if(promocao){
            return  comissao / 2;
        }
        return comissao;
    }

    public void imprimir(){

		System.out.println();
		System.out.println("####DADOS VENDA####");
		System.out.println("Quantidade de itens vendidos: " + this.quantidadeItens);
		System.out.println("Total de vendas: " + this.valor);
    }
    
    public void cadastrarVenda() {
    	
    	try {
			System.out.println("Quantidade de itens: ");
			setQuantidadeItens(sc.nextInt());
			System.out.println("Valor da venda: ");
			setValor(sc.nextDouble());
			
		} catch (Exception e) {
			
			System.out.println("Algo de errado! Revise seus dados e reinicie a aplicação.");
		}
    }
}
