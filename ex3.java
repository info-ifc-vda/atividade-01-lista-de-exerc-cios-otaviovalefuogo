import java.util.Scanner;

public class ex3{

    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor dos tres angulos internos do triangulo: ");
        int ang1=teclado.nextInt();
        int ang2=teclado.nextInt();
        int ang3=teclado.nextInt();
        System.out.println("Informe o valor dos tres lados do triangulo: ");
        double lad1=teclado.nextDouble();
        double lad2=teclado.nextDouble();
        double lad3=teclado.nextDouble();

         if (ang1 == 90 || ang2 == 90 || ang3 == 90) {
            System.out.println("Triangulo Retangulo");
        } else if (ang1 > 90 || ang2 > 90 || ang3 > 90) {
            System.out.println("Triangulo Obtusangulo");
        } else {
            System.out.println("Triangulo Acutangulo");
        }
        if(lad1==lad2 && lad2==lad3){
            System.out.println("Triangulo equilatero");
        }
        else if(lad1==lad2||lad1==lad3||lad2==lad3){
            System.out.println("Triangulo isociles");
        }
        else{
            System.out.println("Triangulo escaleno");
        }
        teclado.close();
    }
}