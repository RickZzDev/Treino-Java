import java.util.Scanner;

class EX3REP{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int base= 0 ;
    int expoente = 0;

    while(true){
      System.out.print("\n Digite a base  ");
      base=ler.nextInt();
      System.out.print("\n Digite um expoente  ");
      expoente=ler.nextInt();

      if(base>=0 && expoente>=0){
        break;
      }else{
        System.out.print("\n Digite numeros positivos por favor  ");
      }
    }

      long potencia = 1;
      for( int i= 0 ; i < expoente ;i++){
        potencia = potencia * base ;
      }System.out.println(base + "^" + expoente + "=" + potencia);
    }
  }
