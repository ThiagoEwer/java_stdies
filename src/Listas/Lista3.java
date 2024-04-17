package Listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Lista3 {

    public static void Array1() {
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

    public static void Array4() {
        int[] arrayOrigem = { 1, 2, 3, 4, 5 };
        int[] arrayDestino = new int[arrayOrigem.length];

        int i = 0;
        for (int elemento : arrayOrigem) {
            arrayDestino[i++] = elemento;
        }

        System.out.println("Array de Destino:");
        for (int elemento : arrayDestino) {
            System.out.print(elemento + " ");
        }
    }

    public static void Array5() {
        Scanner tec = new Scanner(System.in);
        int[] itens = { 2, 4, 6, 8, 10 };

        System.out.print("Digite o elemento a ser verificado: ");
        int elemento = tec.nextInt();

        boolean encontrado = false;
        for (int num : itens) {
            if (num == elemento) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O elemento " + elemento + " está presente no array.");
        } else {
            System.out.println("O elemento " + elemento + " não está presente no array.");
        }

        tec.close();
    }

    public static void Array6() {
        int[] itens = { 1, 2, 3, 4, 5 };
        int comprimento = itens.length;

        for (int i = 0; i < comprimento / 2; i++) {
            int check = itens[i];
            itens[i] = itens[comprimento - i - 1];
            itens[comprimento - i - 1] = check;
        }

        System.out.print("Array invertido: [");
        for (int i = 0; i < comprimento; i++) {
            System.out.print(itens[i]);
            if (i != comprimento - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void Array7() {
        int[] itens = { 1, 2, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8, 9, 9 };

        int totalDuplicados = 0;

        for (int i = 0; i < itens.length - 1; i++) {
            for (int j = i + 1; j < itens.length; j++) {
                if (itens[i] == itens[j]) {
                    totalDuplicados++;
                    break;
                }
            }
        }

        System.out.println("Número de elementos duplicados: " + totalDuplicados);

    }

    public static void Matriz1() {
        int[][] matriz1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] matriz2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        boolean saoMatrizesIguais = true;

        if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length) {
            saoMatrizesIguais = false;
        } else {
            for (int i = 0; i < matriz1.length && saoMatrizesIguais; i++) {
                for (int j = 0; j < matriz1[0].length && saoMatrizesIguais; j++) {
                    if (matriz1[i][j] != matriz2[i][j]) {
                        saoMatrizesIguais = false;
                    }
                }
            }
        }

        if (saoMatrizesIguais) {
            System.out.println("As matrizes são iguais.");
        } else {
            System.out.println("As matrizes são diferentes.");
        }

    }

    public static void Matriz2() {
        int[][] matrizA = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] matrizB = { { 7, 8 }, { 9, 10 }, { 11, 12 } };

        if (matrizA[0].length != matrizB.length) {
            System.out.println("As matrizes não podem ser multiplicadas.");
            return;
        }

        int m = matrizA.length;
        int n = matrizB[0].length;
        int[][] matrizResultado = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int valor = 0;
                for (int k = 0; k < matrizA[0].length; k++) {
                    valor += matrizA[i][k] * matrizB[j][k];
                }
                matrizResultado[i][j] = valor;
            }
        }

        System.out.println("Resultado da multiplicação das matrizes:");
        for (int[] linhaMatrizResultado : matrizResultado) {
            for (int valor : linhaMatrizResultado) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
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

    public static void ArrayList3() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Maçã");
        arrayList.add("Banana");
        arrayList.add("Laranja");
        arrayList.add("Abacaxi");
        arrayList.add("Uva");

        // elemento a ser procurado.
        String elemento = "Laranja";

        int indice = arrayList.indexOf(elemento);

        if (indice != -1) {
            System.out.println("Índice de \"" + elemento + "\": " + indice);
        } else {
            System.out.println("Elemento \"" + elemento + "\" não encontrado.");
        }
    }

    public static void ArrayList2() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        // Invertendo a ordem dos elementos com Collections
        Collections.reverse(arrayList);

        System.out.println("ArrayList invertido:");
        System.out.println(arrayList);

    }

    public static void ArrayList4() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Maçã");
        arrayList.add("Banana");
        arrayList.add("Laranja");
        arrayList.add("Abacaxi");
        arrayList.add("Uva");

        arrayList.clear();

        // Verifica se o arraylist ficou vazio
        if (arrayList.isEmpty()) {
            System.out.println("Todos os elementos foram removidos com sucesso.");
        } else {
            System.out.println("Falha ao remover todos os elementos.");
        }
    }

    public static void ArrayList5() {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(2);

        int elemento = 2;

        // Contando o número de ocorrências com o collections
        int contagem = Collections.frequency(arrayList, elemento);

        System.out.println("O elemento " + elemento + " ocorre " + contagem + " vezes no ArrayList.");
    }
}
