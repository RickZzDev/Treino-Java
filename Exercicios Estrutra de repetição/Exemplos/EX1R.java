import java.util.Scanner;

class EX1R{
  public static void main(String[] args) {
    Scanner ler = new Scanner (System.in);
    int numero=0;
    System.out.println("Digite um nuemro positivo maior ou igual a zero");
    numero=ler.nextInt();
    while(true){
      if (numero<0){
        System.out.println("Digite um numero positivo por favor ");
        numero=ler.nextInt();
      }else{
        break;
      }
    }
    if(numero%2==0){
      System.out.println("Este numero eh par ");
    }else{
      System.out.println("Este numero eh impar ");
    }
  }
}
