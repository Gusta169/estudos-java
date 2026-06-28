//Você está desenvolvendo uma funcionalidade para um aplicativo de lanchonete. O sistema precisa calcular o valor total
// de um pedido com base na quantidade de itens solicitados.
//
//O cliente pode pedir:
//
//Hambúrguer: R$ 12,00
//Batata frita: R$ 7,00
//Refrigerante: R$ 5,00
//Sua tarefa é criar um algoritmo em linguagem natural ou fluxograma que armazene os dados necessários em variáveis e
// faça o cálculo do valor total com base nas quantidades informadas.

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int hamburguer = 12;
        int batata_frita = 7;
        int refrigerante = 5;

        Scanner input = new Scanner(System.in);

        System.out.print("Quantos hamburguer? ");
        int qnthamburguer = input.nextInt();

        System.out.print("Quantos Refrigerantes? ");
        int qnthrefrigerante = input.nextInt();

        System.out.print("Quantos Batata Frita? ");
        int qntbatata_frita = input.nextInt();
        int soma = qntbatata_frita * batata_frita + qnthamburguer * hamburguer + qnthrefrigerante * refrigerante;

        System.out.print("Ficou: "+ soma + " reais");

    }
}