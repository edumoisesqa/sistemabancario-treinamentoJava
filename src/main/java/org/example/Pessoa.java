package org.example;

public class Pessoa {

    private static int counter = 1;

    private String nome;
    private String endereco;

    private int telefone;

    private int celular;
    private int  numeroDaConta;

    private int saldo;

    public Pessoa (String nome, String endereco, int telefone, int celular){
        this.nome = nome;
        this.endereco = endereco;
        this.celular = celular;
        this.telefone = telefone;
        counter +=1;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }


    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }
}
