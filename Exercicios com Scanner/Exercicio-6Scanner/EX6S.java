import java.util.Scanner;

 class EX6S{
   public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
     System.out.print("DIgite uma medida em metros para conversao: ");
     double metros = ler.nextDouble();
     double dam=metros/10;
     double hm=metros / 100;
     double km=metros / 1000;
     double dm=metros * 10;
     double cm=metros * 100;
     double mm=metros * 1000;
     System.out.println (metros + " metros eh equivalente a " + dam + "dam" );
     System.out.println (metros + " metros eh equivalente a " + km + "km" );
     System.out.println (metros + " metros eh equivalente a " + dm + "dm" );
     System.out.println (metros + " metros eh equivalente a " + cm + "cm" );
     System.out.println (metros + " metros eh equivalente a " + mm + "mm" );
     System.out.println (metros + " metros eh equivalente a " + hm + "hm" );
   }
 }