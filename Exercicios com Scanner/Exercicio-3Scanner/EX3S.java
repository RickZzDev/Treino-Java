import java.util.Scanner;

 class EX3S{
   public static void main(String[] args) {
     Scanner ler = new Scanner (System.in);
     System.out.print (" Digite um numero: ");
     double n1 = ler.nextDouble();
     System.out.print (" Digite outro numero: ");
     double n2 = ler.nextDouble();
     if (n1>n2){
       System.out.print (" O primero eh maior");
     }else{
       System.out.print (" O segundo eh maior ");
     }
   }
 }
 