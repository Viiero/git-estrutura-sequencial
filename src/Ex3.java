//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
//ordem crescente ou decrescente.

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int A, B;

        System.out.println("Valor de A: ");
        A = sc.nextInt();

        System.out.println("Valor de B: ");
        B = sc.nextInt();

        if(A % B == 0){
            System.out.println("São múltiplos");
        }else{
            System.out.println("Não são múltiplos");
        }
        sc.close();
    }
}
