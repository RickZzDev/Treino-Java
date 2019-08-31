import java.util.Scanner;

class TabuadaRep{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite um numero ");
    int numero = ler.nextInt();
    for (int i =1 ; i <=10 ; i++){
      System.out.println(numero + "x" + i + "=" + numero * i);
    }
  }
}
