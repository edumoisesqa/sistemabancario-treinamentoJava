package org.example;


public class Conta {

    private static  int contadorDeContas = 1;

    private Double saldo  =0.0;
    private Pessoa pessoa;

    private int numeroDaConta;

    public Conta(Pessoa pessoa){
        this.numeroDaConta = contadorDeContas;
        this.pessoa = pessoa;
        contadorDeContas += 1;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Pessoa getPessoa() {
        return pessoa   ;
    }



    public String toString() {
        return "\nNumero da conta: " + this.pessoa.getNumeroDaConta() +
        "\nNome: " + this.pessoa.getNome() +
        "\nEndereco: " + this.pessoa.getEndereco()+
        "\nCelular: " + this.pessoa.getCelular()+
        "\nSaldo: " + this.pessoa.getSaldo() +
        "\nTelefone: " + this.pessoa.getTelefone();

    }

    public void depositar (Double valor ){
        if(valor > 0){
            setSaldo(getSaldo() + valor);
            System.out.println("Seu deposito foi realizado com sucesso!");
        }else{
            System.out.println("Não foi possivel realizar");
        }
    }


    public void sacar (Double valor){
        if(valor > 0 && this.getSaldo() >= valor){
            setSaldo(getSaldo() - valor);
            System.out.println("Saque foi realizado com sucesso!");
        }else{
            System.out.println("Não foi possivel realizar saque ");
        }
        }
    public  void trasferir (Conta contaDeposito, Double valor){
        if (valor > 0 && this.getSaldo()>= valor) {
            setSaldo(getSaldo() - valor);

            contaDeposito.saldo = contaDeposito.getSaldo() + valor;
            System.out.println("Saque realizado  com sucesso");
        }

                else{
                    System.out.println("Não e possivel realizar ");
                }

            }

        }

