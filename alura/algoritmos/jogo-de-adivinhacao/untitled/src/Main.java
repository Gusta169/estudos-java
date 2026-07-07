// Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e pedir para que
// o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa, o programa deve informar se o número
// digitado pelo usuário é maior ou menor do que o número gerado.

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int tentativas = 5;
    int count = 0;
    int numeroGerado = new Random().nextInt(100);
    int numeroDigitado = 0;

    while(count < tentativas) {
    System.out.println("Tente adivinhar o numero entre 0 a 100: ");
    numeroDigitado = scanner.nextInt();
    count++;

    if(numeroDigitado == numeroGerado) {
        System.out.println("Parabens você acertou o numero!!!");
        break;
    }
    else if (numeroDigitado < numeroGerado) {
        System.out.println("O número digitado é menor que o número gerado.");
    }
    else {
        System.out.println("O número digitado é maior que o número gerado.");
    }

    if(tentativas == count && numeroDigitado != numeroGerado) {
        System.out.println("Você não acertou em " +tentativas+ " tentativas. O numero era: " + numeroGerado);
    }
        }
    }
}
