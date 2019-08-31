import java.util.Scanner;

 class EX1S{
   public static void main (String []args){
     Scanner ler= new Scanner (System.in);
     System.out.print (" Digite um numero: ");
     int inteiro = ler.nextInt();

     if(inteiro>0){
       System.out.print (" positivo ");
     }if (inteiro<0){
       System.out.print (" negativo ");
     }

     if(inteiro==0){
       System.out.print (" neutro ");
     }
   }
 }