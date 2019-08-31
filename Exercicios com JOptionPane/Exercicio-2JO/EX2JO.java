import javax.swing.JOptionPane;

 class EX2JO{
   public static void main(String[] args) {
     int numero = Integer.parseInt (JOptionPane.showInputDialog("Digite um numero: "));
     if (numero>10){
       JOptionPane.showMessageDialog(null, "Maior que dez ");
     }
     if (numero<10){
       JOptionPane.showMessageDialog(null, "Menor que dez ");
   }
   if (numero==10){
     JOptionPane.showMessageDialog(null, "Este numero eh o proprio dez ");
   }
 }
 }