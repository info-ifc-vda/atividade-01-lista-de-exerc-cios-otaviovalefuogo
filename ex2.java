import java.util.Scanner;
public class ex2 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o salario minimo ?");
        double sm = teclado.nextDouble();
        System.out.println("Qual foi o consumo de energia em quilowatts?");
        double c = teclado.nextDouble();

        double k = sm*0.01;
        double valor = k*c;

        System.out.println("Valor do quilowatts: "+k);
        System.out.print("Valor da conta de energia: "+valor);

        teclado.close();
    }
}