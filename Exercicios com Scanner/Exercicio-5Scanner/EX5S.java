import java.util.Scanner;

class EX5S{
  public static void main(String[] args) {
    Scanner ler= new Scanner (System.in);
    System.out.print("Digite sua idade: ");
    int idade= ler.nextInt();
    if (idade>=18){
      System.out.print("Maior de idade ");
    }else{
      System.out.print("Menor de idade ");
    }
  }
}