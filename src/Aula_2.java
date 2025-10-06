import java.util.ArrayList;

public class Aula_2 {
    public static void main{String [] args){
//        int x = 10; //numeros inteiros
//        var nome = "Gustavo"; //reconhecimento do tipo da variavel
//      byte => 8 bits => 128 a 127 Declaração de representação pequena
//      short => 16 bits => -37.538 - 37.537 declaração de quanto ele irá
//          int => 32 bits => -2.147.483.648 a 2.147.483.647 Maior representação de numeros utilizados
//         long => 64bits => -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807 //total de numeros que poderá ser representado
//        numeros decimais = 1.2, 3.4, 5.4. 7.8. 9.0
//        flaot => 32 bits => precisão simples //utilizado para um numero com mais precisão e nao sendo longos numeros pós virgulas
//        double => 64 bits => precisão dupla //utilizado para maior numeros pós virgulas,
//
//            String => representar palavras e frases
//                char => representar um unico caracter => a/b/c e utiliza apenas aspas simples ''
//
//            boolen => true ou false
//  Tipos primitivos:

    byte b = 100;
    short s = 10000;
    int i = 100000;
    long l = 100000L; //necessario por o "L" no final do long
    float f = 10.5f;  //necessario por o "f" no final do float
    double d = 20.5;
    char c = 'A';
    String str = "Gustavo";
    boolean bool = true;

//  Condicionais simples:

    if(b > 99) {
        System.out.println("Verdadeiro");
    } else if(str == "Gustavo");
    else{
        System.out.println("Falso");
    }

    //Vetores:
    //  posicoes                  [0, 1, 2, 3, 4]
        int[] colecaoDeInteiros = {1, 2, 3, 4 ,5};
        colecaoDeInteiros[0] = 3;
        int[] meusNumeros = new int[5] //caso não queira adicionar ja os numeros, apenas declarar o tamnho da variavel


    //ArrayList
    //É uma implemente uma lista dinamica de elementos, sem a declaração do tamanho facilitando adicionar ou remover
    //Para utilizar tem que fazer a importação
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Gustavo")
                nomes.add("Joao")
                        nomes.add("Maria")
                                nomes.add("Pedro")
        System.out.println(nomes.get(0));
        System.out.println(nomes.get(1));
        System.out.println(nomes.get(2));

//      Para a remoção Dinamica:
        nomes.remove(0);
        nomes.remove(1);;
        System.out.println(nomes.get(0));

//      Loops:

        for(int i = 0; i < nomes.size();i++) //Primeiro a declaração da variavel, e pós isso a condicional, e então por fim a atribuição
//      do que fará
            System.out.println(nomes.get(i));
        for(int minhaCondicao = 0; minhaCondicao <nomesArr.length; Minhacondicao++){ //utilizacao do "nomesArr" pois nao é uma arraylist

        }
        int contador = 0 //o contador sera a condição para que adentramos no while
        while (contador <10) {
            System.out.println("Estou no while");
            contador++; //diferente do for, a interação tem que ser mexida diretamente dentro
        }
        //casting:
        //exemplo:
        double resultado = 0.0;
        int resultado = (int) resultado; //casting explicto

        int meuInt = 10;
        double meuDouble = meuInt; //casting implícito

        String meuString = "10";
        Int meuInt2 = Integer.parseInt(meuString); //transformação da string em inteiro
        }
    }
}