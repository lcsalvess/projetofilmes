import com.sun.source.util.SourcePositions;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Object resultado;

    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (int) (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = "Filme de aventura com galã dos anos 80";
        System.out.println(sinopse);
    // soma de 1 à 1000 nos termos
        int inicio= 1;
        double fim= 1000;
        double operacao= (inicio + fim) * fim / 2;
        int resultado = (int)operacao;
        System.out.println(resultado);
    // progressão aritmética, PA (1; 4; 7; 10; 13)
        int termoinicial = 1;
        int quantidadesequencia = 5;
        int termofinal = 13;
        int operacaogeometrica = (termoinicial + termofinal) * quantidadesequencia / 2;
        System.out.println(operacaogeometrica);
    // imprime todos os múltiplos de 3, entre 1 e 100
        for (int i = 1; i < 100; i++){
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    // fatoriais de 1 a 10
        long indicefat = 1;
        for(int n = 1; n <=10; n++) {
            indicefat = indicefat * n;
            System.out.println("fat(" + n + ") = " + indicefat);
        }
    // aumentar a quantidade de números que terão os fatorais impressos
        long indicefat2 = 1;
        for(long n=1; n <=20; n++) {
            indicefat2 = indicefat2 * n;
            System.out.println("fat(" + n + ") = " + indicefat2);
        }
    // Sequência de Fibonnaci
        int anterior = 0;
        int atual = 1;
        while (atual < 100) {
            System.out.println(atual);
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
        System.out.println(atual);
    //Se x é par : x = x / 2 ; se x é impar : x = (3 * x) + 1
        int z = 13;
        System.out.println("Iniciando ...\n" + z);
        while (z!=1) {
            if (z % 2 == 0) {
                z = z / 2;
            } else {
                z = (3 * z) + 1;
            }
            System.out.println(z);
        }
    }
}