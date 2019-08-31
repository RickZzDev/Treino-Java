import java.util.Scanner;

class EX1REP{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int i=0;



    while(true){
      System.out.print("\nDigite um numero para saber se o mesmo eh par ou impar ");
      i=ler.nextInt();
        if(i%2==0){
          System.out.println(i + " eh par ");

        }else{
          System.out.println(i + " eh impar ");

        }
        System.out.println("\nDeseja continuar a calcular? ");
        String pergunta=ler.next();
        if(pergunta.equals("sim")){

        }
        else{
          break;
        }

    }



  }
}
