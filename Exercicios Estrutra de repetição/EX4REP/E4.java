import java.util.Scanner;

class E4{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Seja bem vindo senhor Stark");
    double n = 0;
    double e =0;
    while(true){
      System.out.println("Um numero positivo por favor");
      n = ler.nextDouble();

      if(n<0){

      }else{
        break;
      }
    } e = Math.pow(1 + 1 / n , n );
    System.out.println(e);

  }
}
