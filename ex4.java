import java.util.Scanner;
public class ex4{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o codigo do produto?");
        int cod=teclado.nextInt();
        System.out.println("Qual a quantidade de produtos comprados?");
        int quant=teclado.nextInt();
        double un=0;
        if(cod<=10){
            un=10;
        }
        else if(cod<=20){
            un=15;
        }
        else if(cod<=30){
            un=20;
        }
        else{
            un=40;
        }
        double total =un*quant;
        double desc=0;
        if(total<250){
            desc=total*0.05;
        }
        else if(total<500){
            desc=total*0.1;
        }
        else{
            desc=total*0.15;
        }
        double pf=total-desc;
        System.out.println("O preço unitário do produto comprado é "+un);
        System.out.println("O preço total da nota é "+total);
        System.out.println("O valor do desconto é "+desc);
        System.out.println("O preço final da nota depois do desconto é "+pf);
        teclado.close();
    }
}