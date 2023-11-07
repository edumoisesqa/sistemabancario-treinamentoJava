package org.sistema.AgenciaBancaria;

import org.example.Conta;
import org.example.ContaCorrente;
import org.example.Pessoa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AgenciaBancaria {
        static Scanner input  = new Scanner(System.in);
        static ArrayList<Conta> contasBancarias;
        public  static void  main (String[] args){
            contasBancarias = new ArrayList<Conta>();
            operacoes ();


        }
        public static  void operacoes(){

            System.out.println("Bem vindos ao banco Itau ");
            System.out.println("Selecione a opcao desejada");
            System.out.println("Opcao 1 - Criar Conta");
            System.out.println("Opcao 2 - Depositar ");
            System.out.println("Opcao 3 -  sacar ");
            System.out.println("Opcao 4 -  Trasferir");
            System.out.println("Opcao 5 -  Listar");
            System.out.println("Opcao 6 -  Sair");

            int operacao  = input.nextInt();

            switch (operacao){
                case 1:
                    criarConta();
                    break;
                case 2:
                    depositar();
                    break;
                case 3:
                    sacar();
                    break;
                case 4:
                    transferir();
                    break;
                case 5:
                    listar();
                    break;
                case 6:
                    System.out.println("Obrigado por usar  nossa Agencia");
                  System.exit(0);

                default:
                    System.out.println("Opcao invalida");
                    operacoes();
                            break;


            }
        }
            public  static void criarConta(){

                System.out.println("\nNome: ");
                String nome = input.next();

                System.out.println("\nEndereco: ");
                String endereco = input.next();

                System.out.println("\nCelular: ");
                String celular = input.next();


                System.out.println("\nTelefone: ");
                String telefone = input.nextLine();

                Pessoa pessoa = new Pessoa(nome, endereco, celular, telefone);

                Conta conta = new Conta(pessoa);

                contasBancarias.add(conta);
                System.out.println("Sua conta foi criada com sucesso");

                operacoes();

        }


        private  static Conta encontrarConta(int numeroConta){
            Conta conta  = null;

                if (contasBancarias.size() > 0){
                    for(Conta c: contasBancarias){
                        if(c.getNumeroDaConta() == numeroConta);
                        conta = c;

                    }
                }

                return conta;


            }

            public static void depositar (){
                System.out.println("Numero  da conta: ");
                int  numeroConta = input.nextInt();

                Conta conta = encontrarConta(numeroConta);

                if (conta!=null){
                    System.out.println("Qual valor  deseja Depositar? ");
                    Double valorDeposito = input.nextDouble();
                    conta.depositar(valorDeposito);
                    System.out.println("Valor  deposito com sucesso");
            }else{
                    System.out.println("Conta não encontrada");
                }
                operacoes();
        }

        public  static  void sacar(){
            System.out.println("Numero  da conta: ");
            int  numeroConta = input.nextInt();

            Conta conta = encontrarConta(numeroConta);
            if (conta!=null){
                System.out.println("Qual valor  deseja Sacar? ");
                Double valorSaque = input.nextDouble();
                conta.sacar(valorSaque);
                System.out.println("Saque efetuado com sucesso");
            }else{
                System.out.println("Conta não encontrada");
            }
            operacoes();
        }

        public static void transferir(){
            System.out.println("Numero de conta remetente ");
            int numeroRemetente = input.nextInt();

            Conta contaRemetente = encontrarConta(numeroRemetente);
                if(contaRemetente!= null){
                    System.out.println("Numero da conta Destinatario");
                    int numeroContaDestinario = input.nextInt();

                    Conta contaDestinario = encontrarConta(numeroContaDestinario);
                        if(contaDestinario != null){
                            System.out.println("Valor trasferrencia:   ");
                             Double valor = input.nextDouble();

                             contaRemetente.trasferir(contaDestinario,valor);
                        }
                }
                operacoes();
            }
        }




