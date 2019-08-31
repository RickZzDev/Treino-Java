import javax.swing.JOptionPane;

  class EX6JOT{
    public static void main(String[] args) {
      double metros = Double.parseDouble(JOptionPane.showInputDialog("Informe uma medida em metros para efetuar a conversao"));
      String km= JOptionPane.showInputDialog("Se deseja converter para km digite " );
      if(km==(String "sim")){
        JOptionPane.showMessageDialog(null, "Este valor em km eh igual a " + metros/1000);
      }else if(km==(String"nao")){
        
      }
        String hm = JOptionPane.showInputDialog("Se deseja converter para hm digite 1 ou 0 caso nao queira");
        if(hm==(String)"sim"){
          JOptionPane.showMessageDialog(null, "Este valor em hm eh igual a " + metros/100);
        }else if (hm==(String)"nao"){
          
        }
        String dam = JOptionPane.showInputDialog("Se deseja converter para dam digite 1 ou 0 caso nao queira");
        if(dam==(String)"sim"){
          JOptionPane.showMessageDialog(null, "Este valor em dam eh igual a " + metros/10);
        }else if (dam==(String)"nao"){
          
        }
        String dm =JOptionPane.showInputDialog("Se deseja converter para dm digite 1 ou 0 caso nao queira");
        if(dm==(String)"sim"){
          JOptionPane.showMessageDialog(null, "Este valor em dm eh igual a " + metros*10);
        }else if (dm==(String)"nao"){
          
        }
        String cm = JOptionPane.showInputDialog("Se deseja converter para cm digite 1 ou 0 caso nao queira");
        if(cm==(String)"sim"){
          JOptionPane.showMessageDialog(null, "Este valor em cm eh igual a " + metros*100);
        }else if (cm==(String)"nao"){
          
        }
        String mm = JOptionPane.showInputDialog("Se deseja converter para mm digite 1 ou 0 caso nao queira");
        if(mm==(String)"sim"){
          JOptionPane.showMessageDialog(null, "Este valor em hm eh igual a " + metros*1000);
        }else if (mm==(String)"nao"){
          
        }
        JOptionPane.showMessageDialog(null, "Obrigado por usar o meu programa");
      }
    }
  