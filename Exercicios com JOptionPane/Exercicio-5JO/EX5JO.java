import javax.swing.JOptionPane;

class EX5JO{
  public static void main(String[] args) {
    int idade= Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
    if(idade>=18){
      JOptionPane.showMessageDialog(null,"Maior de idade");
    }else{
      JOptionPane.showMessageDialog(null,"Menor de idade");
    }
  }
}