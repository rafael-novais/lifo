import java.util.ArrayList;
import java.util.ArrayDeque;
public class Exercicio {
    public static void main(String args[]){
        System.out.println("Iniciando programa...");
        System.out.println();

        ArrayList<Integer> lista = new ArrayList<>(5);
        ArrayDeque<Integer> pilha = new ArrayDeque<>(5);
        ArrayDeque<Integer> fila = new ArrayDeque<>(10);

        //passo 1
        System.out.println("PASSO 1");
        System.out.println("Insira os números [1, 2, 3, 4 e 5] em uma lista - com 5 células");

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        System.out.println(lista);
        System.out.println("--------------------------------------------");

        //passo 2
        System.out.println("PASSO 2");
        System.out.println("Remova todos os dados da lista e insira-os em uma Pilha - com 5 células. Deve-se sempre remover os dados da célula inicial da lista");

        while(!lista.isEmpty()) {
            pilha.push(lista.get(0));
            lista.remove(0);
            System.out.println(lista);
        }

        System.out.println("Pilha:");
        System.out.println(pilha);
        System.out.println("--------------------------------------------");


        //passo 3
        System.out.println("PASSO 3");
        System.out.println("Remova os dados da Pilha e insira-os em uma Fila - com 10 células");

        while(!pilha.isEmpty()) {
            fila.add(pilha.pop());
            System.out.println(pilha);
        }

        System.out.println(pilha);
        System.out.println("--------------------------------------------");

        //passo 4
        System.out.println("PASSO 4");
        System.out.println("Insira os números [6, 7, 8, 9 e 10] na lista;");

        for(int i = 0; i < 5; i++){
            lista.add(i + 6);
        }

        //passo 5
        System.out.println("PASSO 5");
        while(!lista.isEmpty()) {
            pilha.push(lista.get(0));
            lista.remove(0);
            System.out.println(lista);
        }

        System.out.println("Pilha:");
        System.out.println(pilha);
        System.out.println("--------------------------------------------");

        while(!pilha.isEmpty()) {
            fila.add(pilha.pop());
            System.out.println(pilha);
        }

        System.out.println(pilha);
        System.out.println("--------------------------------------------");

        //passo 6
        System.out.println("FINAL");
        System.out.println(fila);        

} 

        
}