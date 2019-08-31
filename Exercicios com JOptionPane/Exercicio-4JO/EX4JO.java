import javax.swing.JOptionPane;
 class EX4JO{
   public static void main(String[] args) {
     double n = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero e veja se ele eh par ou impar: "));
     if(n%2==0){
       JOptionPane.showMessageDialog(null, "Este numero eh par ");
     }else{
       JOptionPane.showMessageDialog(null,"Este numero eh impar ");
     }
   }
 }