import javax.swing.JOptionPane;

  class EX6JO{
    public static void main(String[] args) {
      double metros = Double.parseDouble(JOptionPane.showInputDialog("Informe uma medida em metros para efetuar a conversao"));
      double km = Double.parseDouble(JOptionPane.showInputDialog("Se deseja converter para km digite 1"));
      if(km==1){
        JOptionPane.showMessageDialog(null, "Este valor em km eh igual a " + metros/1000);
      }else if(km==0){
        
      }
        double hm = Double.parseDouble(JOptionPane.showInputDialog("Se deseja converter para hm digite 1 ou 0 caso nao queira"));
        if(hm==1){
          JOptionPane.showMessageDialog(null, "Este valor em hm eh igual a " + metros/100);
        }else if (hm==0){
          
        }
        double dam = Double.parseDouble(JOptionPane.showInputDialog("Se deseja converter para dam digite 1 ou 0 caso nao queira"));
        if(dam==1){
          JOptionPane.showMessageDialog(null, "Este valor em dam eh igual a " + metros/10);
        }else if (dam==0){
          
        }
        double dm = Double.parseDouble(JOptionPane.showInputDialog("Se deseja converter para dm digite 1 ou 0 caso nao queira"));
        if(dm==1){
          JOptionPane.showMessageDialog(null, "Este valor em dm eh igual a " + metros*10);
        }else if (dm==0){
          
        }
        double cm = Double.parseDouble(JOptionPane.showInputDialog("Se deseja converter para cm digite 1 ou 0 caso nao queira"));
        if(cm==1){
          JOptionPane.showMessageDialog(null, "Este valor em cm eh igual a " + metros*100);
        }else if (cm==0){
          
        }
        double mm = Double.parseDouble(JOptionPane.showInputDialog("Se deseja converter para mm digite 1 ou 0 caso nao queira"));
        if(mm==1){
          JOptionPane.showMessageDialog(null, "Este valor em hm eh igual a " + metros*1000);
        }else if (mm==0){
          
        }
        JOptionPane.showMessageDialog(null, "Obrigado por usar o meu programa");
      }
    }
  