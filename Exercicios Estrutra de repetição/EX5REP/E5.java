import java.util.Scanner;

class E5{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Seja bem vindo senhor Stark");
    double n = 0;
    double e =0;
    int quantidade = 0;
    while(true){
      System.out.println("Um numero positivo por favor");
      n = ler.nextDouble();

      System.out.println(" Digite a quantidade de repetições");
      quantidade = ler.nextInt();

      if(n>=0 && quantidade>=0){
        break;
      }
    }
    for(int i=0 ;i<=quantidade ; i++){

      e = Math.pow(1 + 1 / n , n );
      System.out.println(e);
        n++;
    }

  }
}
