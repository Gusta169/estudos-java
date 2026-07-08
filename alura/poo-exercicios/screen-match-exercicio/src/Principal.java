
// projeto ScreenMatch no IntelliJ, sendo que nele você deve criar a classe Filme, contendo os atributos nome,
// anoDeLancamento, duracaoEmMinutos, incluidoNoPlano, somaDasAvaliacoes e totalDeAvaliacoes, além de também conter os
// métodos exibeFichaTecnica, avalia e pegaMedia.

// Além disso, crie também uma outra classe contendo o método main, no qual você deve criar um objeto Filme, preencher
// seus atributos e chamar seus métodos.

import java.util.Random;

public class Principal {
    public static void main(String[] args) {
    Filme filme_01 = new Filme();

    double nota1 = new Random().nextInt(10);
    double nota2 = new Random().nextInt(10);
    double nota3 = new Random().nextInt(10);

    filme_01.nome = "Carros 1";
    filme_01.anoDeLancamento = 2006;
    filme_01.duracaoEmMinutos = 117;
    filme_01.IncluidoNoPlano = true;

    filme_01.exibeFichaTecnica();

    filme_01.avalia(nota1);
    filme_01.avalia(nota2);
    filme_01.avalia(nota3);

    System.out.println("Media de avaliações do filme: " + filme_01.pegaMedia());
    }
}
