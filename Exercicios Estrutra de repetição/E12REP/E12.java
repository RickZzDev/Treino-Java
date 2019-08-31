import java.util.Scanner;


class E11{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println(" Digite um numero para saber se o mesmo eh ou não um numero primo");
    int n = ler.nextInt();
    int b = 0;


    for ( int i = 2 ;  i<n ; i++){
      if(n%i==0){
            b++;
        if(b==1){
          System.out.print( "\n" + n + "\t nao eh primo");

        }
        System.out.print( "\n" + n + "\teh divisivel por " + i);
        

      }else if (b<1){
        System.out.print( "\nprimo");
            break;
      }
    }
  }
}
