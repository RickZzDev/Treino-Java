import java.util.Scanner;

class EX2REP{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    String login = "Tony";
    String senha = "Stark";
    int i =0;


    for (i = 1;i <=3; i++ ){
      System.out.println("\nDigite seu login por favor ");
      login=ler.next();
      System.out.println("\nDigite sua senha por favor  ");
      senha = ler.next();
      if(login.equals("Tony") && senha.equals("Stark")){
        System.out.println("\n Bem vindo senhor Stark ");
        break;
      }else if(i==0){
        System.out.println("\n Restam 3 tentativas");
      }
      else if(i==1) {
        System.out.println("\n Resta 2 tentativas ");
      }  else if(i==2) {
          System.out.println("\n Ultima tentativa ");
        }else if(i==3) {
            System.out.println("\n Acesso negado ");
          }
    }
  }
}
