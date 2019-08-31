import java.util.Scanner;


class E10{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println(" Digite um numero para saber se o mesmo eh ou não um numero primo");
    int n = ler.nextInt();
    int n2 = 0;
    for ( int i = 2 ;  i<n ; i++){
      if(n%i==0){
        System.out.println(" Este numero nao eh primo");
              break;
      }else{
        System.out.println(n + " Este numero eh primo");
              break;
      }
    }
  }
}
