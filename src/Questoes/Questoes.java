package Questoes;

import java.util.Scanner;
import java.time.LocalDate;
import java.util.Random;

public class Questoes {

    public static void Lista1Numero1() {
        System.out.println("Ola Usuário, Bem vindo!");
        Scanner inputTeclado = new Scanner(System.in);

        // Input do nome
        System.out.println("Digite seu nome:");
        String nome = inputTeclado.nextLine();
        System.out.println("Que bom te conhecer, " + nome + "!");

        // Input da data
        System.out.println("Qual o seu ano de nascimento?");
        int anoNascimento = inputTeclado.nextInt();

        System.out.println("Qual o mês de nascimento? (1-12)");
        int mesNascimento = inputTeclado.nextInt();

        System.out.println("Qual o dia de nascimento? (1-31)");
        int diaNascimento = inputTeclado.nextInt();

        // Calculo da idade
        LocalDate dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
        LocalDate hoje = LocalDate.now();

        int idadeAtual = hoje.minusYears(dataNascimento.getYear()).getYear();

        System.out.println("Sua idade: " + idadeAtual);

        inputTeclado.close();
    }

    public static void Aula3Exerc1() {
            System.out.println("Ola Usuário, Bem vindo!");
            Scanner inputTeclado = new Scanner(System.in);
            float n1,n2,n3;

            System.out.println("Informe sua primeira nota:");
            n1 = Float.parseFloat(inputTeclado.nextLine());


            System.out.println("Informe sua segunda nota:");
            n2 = Float.parseFloat(inputTeclado.nextLine());

            System.out.println("Informe sua terceira nota:");
            n3 = Float.parseFloat(inputTeclado.nextLine());

            inputTeclado.close();

             float media = (n1+n2+n3)/3;

        String mediaFormatada = String.format("%.2f", media);
        System.out.println("Sua média é: " + mediaFormatada);

        }

    public static void Aula3Exerc3(){
        System.out.println("Digite sua idade");
        Scanner inputTeclado = new Scanner(System.in);
        int idade;

        idade = Integer.parseInt(inputTeclado.nextLine());
        //exemplo simples de operador ternário
        String resultado = (idade >= 18)? "pode votar": "nao pode votar";

        System.out.println(resultado);

        Menu.menu();
    }

    public static void Aula3Exerc6(){
        System.out.println("Responda as perguntas");
            Scanner inputText = new Scanner(System.in);
            int pontuacao = 0;


        System.out.println("Telefonou para a vítima?");
        String resposta0 = inputText.nextLine();
        if(resposta0.equals("sim")) {
            pontuacao++;
        }

        System.out.println("Esteve no local do crime?");
        String resposta1 = inputText.nextLine();
        if(resposta1.equals("sim")) {
            pontuacao++;
        }

        System.out.println("Mora perto da vítima?");
        String resposta2 = inputText.nextLine();
        if(resposta2.equals("sim")) {
            pontuacao++;
        }

        System.out.println("Devia para a vítima?");
        String resposta3 = inputText.nextLine();
        if(resposta3.equals("sim")) {
            pontuacao++;
        }

        System.out.println("Já trabalhou com a vítima?");
        String resposta4 = inputText.nextLine();
        if(resposta4.equals("sim")) {
            pontuacao++;
        }
        
            if(pontuacao < 2){
                System.out.println("Inocente");
            }else if(pontuacao == 2){
                System.out.println("Suspeito");
            }else if(pontuacao <= 4){
                System.out.println("Cúmplice");
            }else{
                System.out.println("Assassino");
            }

        inputText.close();
    }

    public static void Aula4Exerc1(){
        System.out.println("====== CARDAPIO ======");
        System.out.println(" 1 - HAMBURGER");
        System.out.println(" 2 - PIZZA");
        System.out.println(" 3 - COXINHA");
        System.out.println(" 4 - PASTEL");
        System.out.println("-----------------------");
        System.out.println("Digite um numero de 1 A 4 PARA ESCOLHER SEU PEDIDO: ");

        Scanner teclado = new Scanner(System.in);

        int escollha = Integer.parseInt(teclado.nextLine());

        switch (escollha) {
            case 1:
                System.out.print("Você escolheu HAMBURGER");
                break;
            case 2:
                System.out.print("Você escolheu PIZZA");
                break;
            case 3:
                System.out.print("Você escolheu COXINHA");
                break;
            case 4:
                System.out.print("Você escolheu PASTEL");
                break;
            default:
                System.out.print("OPCAO INVALIDA!!!");
        }

    }
    public static void Aula4Exerc2() {
            System.out.println("====== CARDAPIO ======");
            System.out.println(" 1 - HAMBURGER - R$:5.00");
            System.out.println(" 2 - PIZZA - R$:10.00");
            System.out.println(" 3 - COXINHA - R$:3.00");
            System.out.println(" 4 - PASTEL - R$:4.00");
            System.out.println("-----------------------");
            System.out.println("Digite um número de 1 A 4 PARA ESCOLHER SEU PEDIDO: ");

            String nomeItem1 = "HAMBURGER";
            double valorItem1 = 5.00;
            int quantidadeItem1;

            String nomeItem2 = "PIZZA";
            double valorItem2 = 10.00;
            int quantidadeItem2;

            String nomeItem3 = "COXINHA";
            double valorItem3 = 3.00;
            int quantidadeItem3;

            String nomeItem4 = "PASTEL";
            double valorItem4 = 4.00;
            int quantidadeItem4;

            double total = 0;

            Scanner teclado = new Scanner(System.in);
            int escolha = Integer.parseInt(teclado.nextLine());

            switch (escolha) {
                case 1:
                    System.out.println(nomeItem1);
                    System.out.println("Valor: " + valorItem1);
                    System.out.println("Digite a quantidade desejada: ");
                    quantidadeItem1 = Integer.parseInt(teclado.nextLine());
                    total += quantidadeItem1 * valorItem1;
                    break;
                case 2:
                    System.out.println(nomeItem2);
                    System.out.println("Valor: " + valorItem2);
                    System.out.println("Digite a quantidade desejada: ");
                    quantidadeItem2 = Integer.parseInt(teclado.nextLine());
                    total += quantidadeItem2 * valorItem2;
                    break;
                case 3:
                    System.out.println(nomeItem3);
                    System.out.println("Valor: " + valorItem3);
                    System.out.println("Digite a quantidade desejada: ");
                    quantidadeItem3 = Integer.parseInt(teclado.nextLine());
                    total += quantidadeItem3 * valorItem3;
                    break;
                case 4:
                    System.out.println(nomeItem4);
                    System.out.println("Valor: " + valorItem4);
                    System.out.println("Digite a quantidade desejada: ");
                    quantidadeItem4 = Integer.parseInt(teclado.nextLine());
                    total += quantidadeItem4 * valorItem4;
                    break;
                default:
                    System.out.print("OPÇÃO INVÁLIDA!!!");
            }

            System.out.println("Total: R$" + total);
        }
    public static void Aula4Exerc3(){
        System.out.println(" Informe seu nome completo");
        Scanner inputText = new Scanner(System.in);
        String nomeCompleto = inputText.nextLine();

        String primeiroNome = nomeCompleto.substring(0,nomeCompleto.indexOf(" "));
        System.out.println("Seu primeiro nome é: "+primeiroNome);



        }
    public static void Aula4Exerc4(){
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Por favor, insira seu nome completo:");
        String nomeCompleto = teclado.nextLine();

        int espaco = nomeCompleto.indexOf(' ');

        String primeiroNome = nomeCompleto.substring(0,espaco);
        String charPrimeiroNome = nomeCompleto.substring(0,1).toLowerCase();
        String ultimoNome = nomeCompleto.substring(nomeCompleto.lastIndexOf(' ') + 1).toLowerCase(); //parte do professor
        String charUltimoNome = ultimoNome.substring(0,1);
        int pswAleatorio = random.nextInt(1000008);
        String login = charPrimeiroNome + ultimoNome + "@estudante.edu.br";
        String senha = charPrimeiroNome + charUltimoNome+charPrimeiroNome+pswAleatorio;

        System.out.println("Seu nome é: "+ nomeCompleto);
        System.out.println("Seu login é: " + login);
        System.out.println("Sua senha é: " + senha);
    }
}
