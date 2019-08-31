import java.util.Scanner;

class E13C{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite a quantidade");
    int a = ler.nextInt();
    boolean referencia = true;
    int b = 0;

    int n = 4;
    System.out.println("2\n");
    b++;
    System.out.println("3\n");
    b++;
    for (int i = 2; i<=n/2  ;   ){


      if(n%i==0){

        n++;
      }else{
        i++;
        if(i>n/2){
          System.out.println("\n" + n);
          b++;
          n++;
        }
      }if (b==a){
        break;
      }
    }
  }
}
