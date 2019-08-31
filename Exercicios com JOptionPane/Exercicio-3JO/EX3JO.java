import javax.swing.JOptionPane;

  class EX3JO{
    public static void main(String[] args) {
      int n1 =Integer.parseInt (JOptionPane.showInputDialog("Digite um numero"));
      int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));
      if (n1>n2){
        JOptionPane.showMessageDialog(null, "O primeiro eh maior que o segundo ");
      }
      if(n2>n1){
        JOptionPane.showMessageDialog(null, "O segundo eh maior que o primeiro");
      }
    }
  }