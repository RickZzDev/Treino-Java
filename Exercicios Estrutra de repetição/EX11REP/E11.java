import java.util.Scanner;


class E11{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println(" Digite um numero para saber se o mesmo eh ou não um numero primo e caso nao seja, veriricar seu primeiro divisor");
    int n = ler.nextInt();
    int b = 0;


    for ( int i = 2 ;  i<n ; i++){
      if(n%i==0){
            b++;
        if(b==1){
          System.out.print( "\n" + n + "\t nao eh primo");

        }
        System.out.print( "\n" + n + "\tSeu primeiro divisor eh o  " + i);
            break;

      }else if (b<1){
        System.out.print( "\nprimo");
            break;
      }
    }
  }
}
