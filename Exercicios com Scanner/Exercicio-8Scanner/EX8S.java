import java.util.Scanner;

 class EX8S{
   public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
     System.out.println(" Digite sua idade ");
     int idade = ler.nextInt();
     if (idade>0 && idade<=150){
       System.out.println(" Idade valida ");
     }else{
       System.out.println(" Idade invalida ");
     }if (idade>=18 && idade<=150){
       System.out.println(" Maior de idade ");
     }else{
       System.out.println(" Menor de idade ");
     }
   }
 }
