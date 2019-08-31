import java.util.Scanner;

class E13{
  public static void main(String[] args) {
    
    int a = 0;
    int b = 0;
    for( int i = 0; i ==10 ; i++){
      b = i-1;
      a = i / b;
      if(i%b==0){
        System.out.println("pulou");

      }else{
        System.out.println(i);
      }
    }
  }
}
