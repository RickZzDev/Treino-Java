import javax.swing.JOptionPane;

 class EX8JO{
   public static void main(String[] args) {
     int idade= Integer.parseInt(JOptionPane.showInputDialog(" Digite sua idade"));
     if (idade>0 && idade<=150){
       JOptionPane.showMessageDialog(null, " Idade valida ");
     }else{
       JOptionPane.showMessageDialog(null, " Idade invalida ");
     }if (idade>=18){
       JOptionPane.showMessageDialog(null, " Maior de idade ");
     }else{
       JOptionPane.showMessageDialog(null, " Menor de idade ");
     }
   }
 }
