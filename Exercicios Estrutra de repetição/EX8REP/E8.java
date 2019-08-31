import java.util.Scanner;


class E8{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int n1 = 1;
    int n2 = 1;
    int n3 = 0;
    System.out.println("Digite ate onde deve aparecer a sequencia de Fibonacci\n ");
    int quantidade = ler.nextInt();
    for (int i = 0  ; i <=quantidade  ; i++ ){
      n3 = n1 + n2;
      System.out.println( n3);
      n1 = n2;
      n2 = n3;

    }
  }
}
