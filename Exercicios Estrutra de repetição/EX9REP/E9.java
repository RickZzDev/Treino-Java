import java.util.Scanner;


class E9{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    double n1 = 1;
    double n2 = 1;
    double n3 = 0;
    System.out.println("Digite ate onde deve aparecer a sequencia de Fibonacci\n ");
    double quantidade = ler.nextDouble();
    System.out.println(n1);
    System.out.println(n2);
    double div1= n1/n2;
    System.out.println(div1 + " Phi");
    double div2= 0;


    for (int i = 1  ; i <=quantidade  ; i++ ){
      n3 = n1 + n2;
      System.out.println(n3);
      n1 = n2;
      n2 = n3;
      if (i%2==0){
        div2 = n2/n1;
        System.out.println(div2 + " Phi");

      }
    }
  }
}
