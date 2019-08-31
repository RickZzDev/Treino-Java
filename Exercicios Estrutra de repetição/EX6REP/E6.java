import java.util.Scanner;

class E6{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    char ch = '\u2588';

    for (int i = 0 ; i<=120 ; i++){//Linha superior
      System.out.print(ch);
    }for ( int n = 0; n <=119; n++){
      if(n<1){
        System.out.print("\n" + ch);

      }else if(n>1 && n==118){
        System.out.print("\t\t\tDesenvolvimento de Sistemas - Turma DS1- T\t\t\t\t\t\t\t\t");

      }else if (n>=119){
        System.out.print( ch + "\n");

      }
    }for (int u = 0 ; u<=120 ; u++){//Linha inferior
      System.out.print(ch);
    }

  }
}
