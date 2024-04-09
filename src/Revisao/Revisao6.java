package Revisao;

import java.util.ArrayList;
import java.util.Arrays;

public class Revisao6 {
    public static void Array1() {
        // criando o objeto do array e atribuindo o seu tamanho
        String[] v1 = new String[3];
        v1[0] = "Laranja";
        v1[1] = "Maça";
        v1[2] = "Oliveira";

        System.out.println("A primeira fruta do vetor é: " + v1[0]);
        System.out.println("A Segunda fruta do vetor é: " + v1[1]);
        System.out.println("A Terceira fruta do vetor é: " + v1[2]);

    }

    public static void ForVetor() {
        int[] array = { 1, 4, 5, 6, 12 };

        for (int i = 0; i < array.length; i++) {
            // exibi os elementos do array
            // Tem que colocar a variavel do array com o valor da variavel controladora do
            // for.
            System.out.println(array[i]);
        }

    }

    public static void ForEach() {
        int[] array = { 5, 12, 10, 25 };
        // melhor que o for pra encontrar os elementos do array
        for (int elemento : array) {
            System.out.println(elemento);
        }
    }

    public static void ArraySomaMedia() {
        int[] array = { 2, 4, 6, 8, 10 };

        int soma = 0;
        for (int i = 0; i < array.length; i++) {
            soma = soma + array[i];
        }

        double media = soma / array.length;

        System.out.println("Soma dos elementos do array: " + soma);
        System.out.println("Média dos elementos do array: " + media);
    }

    public static void Array2() {
        int[] item = { 5, 10, 3, 8, 15 };

        int numMenor = item[0];
        int numMaior = item[0];

        for (int elemento : item) {
            if (elemento < numMenor) {
                numMenor = elemento;
            }
            if (elemento > numMaior) {
                numMaior = elemento;
            }
        }
        System.out.println("Menor elemento do item: " + numMenor);
        System.out.println("Maior elemento do item: " + numMaior);
    }

    public static void Array3() {
        int[] item = { 5, 10, 3, 8, 15 };
        // Ordena o array do menor no indice 0 para o maior no ultimo indice.
        Arrays.sort(item);

        System.out.println("O menor elemento do indice é: " + item[0]);
        System.out.println("Segundo menor elemento do item: " + item[1]);
        System.out.println("Segundo menor elemento do item: " + item[4]);

    }

    public static void ArrayList1() {
        ArrayList<Integer> ArrayList1 = new ArrayList<>();
        ArrayList1.add(1);
        ArrayList1.add(2);
        ArrayList1.add(3);
        ArrayList1.add(4);
        ArrayList1.add(5);

        ArrayList<Integer> arrayListCopia = new ArrayList<>(ArrayList1);

        System.out.println("ArrayList de cópia:");
        for (int elemento : arrayListCopia) {
            System.out.println(elemento);
        }
    }

    public static void ArrayList2() {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add(0, "Thiago");
        nomes.add(1, "Ewerton");
        nomes.add(2, "do");
        nomes.add(3, "Nascimento");
        nomes.add(4, "Bezerra");

        System.out.println(nomes.size());
    }

}
