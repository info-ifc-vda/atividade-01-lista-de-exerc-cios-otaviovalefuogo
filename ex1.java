import java.util.Scanner;

public class ex1 {

        public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantas horas foram trabalhadas ?\n");
        int h = teclado.nextInt();
        System.out.print("Qual o valor da hora trabalhada ?\n");
        double v = teclado.nextDouble();

        double salario = h*v;
        double i = salario*0.3;
        double sl = salario-i;

        System.out.print("O seu salario e:  "+sl);




        teclado.close();
    }
}