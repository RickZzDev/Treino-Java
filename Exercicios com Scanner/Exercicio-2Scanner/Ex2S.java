import java.util.Scanner;

 class EX2S{
   public static void main(String [] args){
     Scanner ler = new Scanner (System.in);
     System.out.print(" Digite um numero: ");
     int n = ler.nextInt();
     if (n>10){
       System.out.print(" Maior que dez ");
     }
     if (n<10){
       System.out.print(" Menor que dez ");
     }
     if (n==10){
       System.out.print(" Este numero eh o proprio dez");
     }
   }
 }


