package com.br.vendas;

import java.util.Scanner;

public class Vendedor {
	
	Scanner sc = new Scanner(System.in);

    private String nome;
    private Integer codigo;
    private Double comissao;
    private String endereco;

    public Vendedor(){

    }

    public Vendedor(String nome, Integer codigo, String endereco, Double comissao) {
        this.nome = nome;
        this.codigo = codigo;
        this.endereco = endereco;
        this.comissao = comissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void cadastrar() {
 
    	try {
    		
			System.out.print("Digite o nome do vendedor: ");
			setNome(sc.nextLine());
			
			System.out.print("Digite o Endereço: ");
			setEndereco(sc.nextLine());
			
			System.out.print("Digite a comissão: ");
			setComissao(sc.nextDouble());
			
			System.out.print("Código do vendedor: ");
			setCodigo(sc.nextInt());
			
		} catch (Exception e) {
			System.out.println("Algo de errado! Revise seus dados e reinicie a aplicação.");
		}
		
	}
    
    public void status () {
		System.out.println("####DADOS VENDEDOR####");
		System.out.println("Código: " + this.getCodigo());
		System.out.println("Vendedor: " + this.getNome());
		System.out.println("Endereço: " + this.getEndereco());
		System.out.println("Comissão: " + this.getComissao());
	}
}
