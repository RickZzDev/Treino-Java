import java.util.Scanner;

class EX7S{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.print("Digite seu peso: \n");
    double peso = ler.nextDouble();
    System.out.print("Digite sua altura: \n");
    double altura = ler.nextDouble();
    double alturaQuadrado = altura*altura;
    double imc = peso/alturaQuadrado;

    if (imc>=35 && imc<40){
      System.out.println(" Obesidade grau 2");
    }
    if (imc<17){
      System.out.println(" Extremamente a baixo do peso");
    }  
    if (imc>=18.49 && imc<25){
      System.out.println("Peso ideal");
    }
     if (imc>=17 && imc<18.49){
      System.out.println(" Abaixo do peso ideal");
    }
     if (imc>=25 && imc<30){
      System.out.println(" Sobrepeso");
    }
     if (imc>=30 && imc<35){
      System.out.println(" Obesidade grau 1 ");
    }
    if (imc>=40){
      System.out.println(" Obesidade grau 3 ");
    }
  }
}