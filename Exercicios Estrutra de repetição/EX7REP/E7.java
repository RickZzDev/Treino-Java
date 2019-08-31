import java.util.Scanner;


class E7{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println(" Digite um numero para efetuar o processo fatorial ");
    long n = ler.nextInt();
    long fatorial = n;
    long n2 = n ;

    for(int i = 2 ; i < n ; i++){

       n2 = n2 - 1;

      fatorial = fatorial *n2;
      System.out.println(fatorial);


    }
  }
}
