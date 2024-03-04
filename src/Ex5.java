//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//seguir, calcule e mostre o valor da conta a pagar.
//1- Cachorro Quente | R$4.00
//2- X-Salada        | R$4.50
//3- X-Bacon         | R$5.00
//4- Torrada simples | R$2.00
//5- Refrigerante    | R$1.50

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double conta = 0.0;

        System.out.println("Código do item (1-5): ");
        int codigo = sc.nextInt();

        System.out.println("Quantidade deste item: ");
        int quantia = sc.nextInt();

        switch(codigo){
            case 1:
                conta = quantia * 4.00;
                break;
            case 2:
                conta = quantia * 4.50;
                break;
            case 3:
                conta = quantia * 5.00;
                break;
            case 4:
                conta = quantia * 2.00;
                break;
            case 5:
                conta = quantia * 1.50;
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        System.out.printf("Total: R$%.2f%n", conta);

        sc.close();
    }
}
