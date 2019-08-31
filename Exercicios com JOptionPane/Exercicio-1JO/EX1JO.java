import javax.swing.JOptionPane;

  class EX1JO{
    public static void main(String[] args) {
      int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
      if (numero>0){
        JOptionPane.showMessageDialog(null, "Positivo");
      }
      if (numero<0){
        JOptionPane.showMessageDialog(null, "Negativo");
      }
      if (numero==0){
        JOptionPane.showMessageDialog(null, "Neutro");
      }
    }
  }
