import java.util.Scanner;
public class ex7 {
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        System.out.print("Informe o primeiro numero: ");
        int n1 = t.nextInt();
        System.out.print("Informe o segundo numero: ");
        int n2 = t.nextInt();
        int fat=1;
        if(n1<n2){
             System.out.println("\nFatoriais no intervalo de " + n1 + " até " + n2 + ":");

        for (int i = n1; i <= n2; i++) {
            for (int j = 1; j <= i; j++) {
                fat *= j;
            }
            System.out.println(i + "! = " + fat);
        }
        }else if(n2<n1){
            System.out.println("\nFatoriais no intervalo de " + n2 + " até " + n1 + ":");

        for (int i = n2; i <= n1; i++) {
            for (int j = 1; j <= i; j++) {
                fat *= j;
            }
            System.out.println(i + "! = " + fat);
        }
        }
        else{
            System.out.println("Os numeros sao iguais.");
        }
         t.close();
    }
}
