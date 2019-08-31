import javax.swing.JOptionPane;
class EX7JO{
  public static void main(String[] args) {
    double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: "));
    double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
    double alturaQuadrado = altura*altura;
    double imc = peso/alturaQuadrado;

    if (imc>=35 && imc<40){
    JOptionPane.showMessageDialog(null,"Obesidade grau 1");
  }
  if (imc<17){
    JOptionPane.showMessageDialog(null," Extremamente a baixo do peso");
  }  
  if (imc>=18.49 && imc<25){
    JOptionPane.showMessageDialog(null,"Peso ideal");
  }
   if (imc>=17 && imc<18.49){
    JOptionPane.showMessageDialog(null," Abaixo do peso ideal");
  }
   if (imc>=25 && imc<30){
    JOptionPane.showMessageDialog(null," Sobrepeso");
  }
   if (imc>=30 && imc<35){
    JOptionPane.showMessageDialog(null," Obesidade grau 1 ");
  }
  if (imc>=40){
    JOptionPane.showMessageDialog(null," Obesidade grau 3 ");
  }
	JOptionPane.showMessageDialog(null," Obrigado por usar meu programa ");
  }
}