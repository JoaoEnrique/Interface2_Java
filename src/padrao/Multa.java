package padrao;

import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Multa 
{
    private int P = 0;//quantidade de peixe
    private int M = 0;//multa
    private int U = 0;//ultrapassagem

    public Multa()
    {
      
    }
 
//============================ METODOS SET E GET ===============================  
    public int getP()
    {
      return P;
    }
    
    public void setP(int P)
    {
      this.P = P;
    }
    
    public int getM()
    {
      return P;
    }
    
    public void setM(int M)
    {
      this.M = M;
    }
    
    public int getU()
    {
      return U;
    }
    
    public void setU(int U)
    {
      this.U = U;
    }
    
//============================= CALCULAR JUROS =================================

    public void calcularMulta()
    {
      try
      {
        this.setP(Integer.parseInt(JOptionPane.showInputDialog("Multa por ultarapasar o peso de peixes permitidos por lei! \nInforme a quantidade de peixes em Kg:  ")));
      }
      catch(Exception erro)
      {
        JOptionPane.showMessageDialog(null, "ERRO: Ocorreu um erro ao armazenar o \"QUANTIDADE DE PEIXES\"\nDETALHE: " + erro);
        System.exit(0);
      }
      
      M = P;
      
      if (P > 50)
      {
        U = P - 50;
        M = U*4;
        JOptionPane.showMessageDialog(null, "\nO pescador ultrapassou: " + U + " kg de peixe. \n A multa foi de R$ " + M);
      }
      
      else
      {
        JOptionPane.showMessageDialog(null, "O peso está dentro do limite!");
      }
    }
    
    
}
