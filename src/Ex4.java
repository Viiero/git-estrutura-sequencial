//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int duracao;

        System.out.println("Hora inicial: ");
        int hi = sc.nextInt();
        System.out.println("Hora final: ");
        int hf = sc.nextInt();

        if(hi < hf){
            duracao = hf - hi;
        }else{
            duracao =   (24 -hi) + hf;
        }

        System.out.println("O jogo durou " + duracao + " hora(s)");

        sc.close();
    }
}
