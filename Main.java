import javax.swing.JOptionPane;
public class Main {
  public static void main(String[] args) {
      Quadrado ler1 = new Quadrado();
      Retangulo ler2 = new Retangulo();
    
      float base = Float.parseFloat(JOptionPane.showInputDialog("Informe a base do Quadrado:"));
    float altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura do Quadrado:"));
       
    
    float resultado_qua = ler1.area(base, altura);
    float resultado_retan = ler2.area(base, altura);

    JOptionPane.showMessageDialog(null, "============================\n"
      +"\nArea do Quadrado: "+resultado_qua
      +"\nArea do Retangulo: "+resultado_retan
      + "\n============================");
  }

 
}