package com.br.vendas;

import java.util.Scanner;

public class Produto {

    Scanner sc = new Scanner(System.in);

    private Integer codigo;
    private String descricao;
    private Double valorVenda;
    private Double valorCusto;
    private Boolean promocao;

    public Produto(){

    }

    public Produto(Integer codigo, String descricao,
                   Double valorVenda, Double valorCusto,
                   Boolean promocao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valorVenda = valorVenda;
        this.valorCusto = valorCusto;
        this.promocao = promocao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Double getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(Double valorCusto) {
        this.valorCusto = valorCusto;
    }

    public Boolean getPromocao() {
        return promocao;
    }

    public void setPromocao(Boolean promocao) {
        this.promocao = promocao;
    }
    
    public void cadastrarProduto() {
    	
    	try {
			System.out.print("Descrição");
			setDescricao(sc.nextLine());
			System.out.print("Código: ");
			setCodigo(sc.nextInt());
		} catch (Exception e) {
			System.out.println("Revise seus dados e reinicie a aplicação");
		}
    }
    
    
    public void status() {
    	System.out.println();
		System.out.println("####DADOS PRODUTO####");
		System.out.println("Código do produto: " + this.codigo);
		System.out.println("Descrição: " + this.descricao);
    }

}
