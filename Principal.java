import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(8);
        numeros.add(4);
        numeros.add(1);
        

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o algoritmo de ordenação:");
        System.out.println("1 - Ordenação Bubble Sort");
        System.out.println("2 - Ordenação Selection Sort");
        System.out.println("3 - Ordenação Insertion Sort");


        int escolha = scanner.nextInt();
        EstrategiaOrdenacao estrategia = null;

        switch (escolha) {
            case 1:
                estrategia = new OrdenacaoBubbleSort();
                break;
            case 2:
                estrategia = new OrdenacaoSelectionSort();
                break;
            case 3:
                estrategia = new OrdenacaoInsertionSort();
                break;
            default:
                System.out.println("Escolha inválida!");
                scanner.close();
                return;
        }


        ContextoDeOrdenacao contexto = new ContextoDeOrdenacao(estrategia);
        contexto.executarOrdenacao(numeros);


        System.out.println("Lista ordenada: " + numeros);
        scanner.close();
    }
}
