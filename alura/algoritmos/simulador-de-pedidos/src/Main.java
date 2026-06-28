
//Você foi contratado por uma cafeteria que deseja automatizar o atendimento no balcão.
// O sistema deve permitir que o atendente registre os pedidos de cada cliente, calcule o valor total e aplique
// um desconto de 10% para clientes cadastrados

//O atendente informa quantos itens o cliente vai pedir.
//Para cada item, o sistema solicita o nome e o preço.
//Ao final, o sistema pergunta se o cliente é cadastrado.
//Se for, aplica o desconto e exibe o valor com desconto.
//Caso contrário, exibe o valor cheio.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int soma = 0;
    int itens = 0;

    String nome_item = "";
    double desconto = 0.1;
    int valor = 0;
    String cadastro = "";
    Scanner scanner = new Scanner(System.in);

    System.out.println("Quantos itens o cliente pediu? ");
    itens = scanner.nextInt();

    System.out.println("Qual o nome do item? ");
    nome_item = scanner.next();

    System.out.println("Qual o valor do " + nome_item + "? ");
    valor = scanner.nextInt();

    System.out.println("Tem cadastro? y/n ");
    cadastro = scanner.next();

    if (cadastro.equals("y")) {
        soma = valor * itens;
        double somaFinal = soma;
        somaFinal *= desconto;
        int descontoFinal = (int)somaFinal;
        int resultado = soma - descontoFinal;

        System.out.println("A compra ficou " + resultado + " reais. ");
        }
    else if (cadastro.equals("n")) {
        soma = valor * itens;
        System.out.println("A compra ficou " + soma + " reais. ");
        }
    else {
        System.out.println("Operação invalida");
        }
    }
}
