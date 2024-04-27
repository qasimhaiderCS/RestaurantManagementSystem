/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOQasimsTakeaways;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author paras
 */
public class ParentClass {
    
    public double ChickenBurger;
    public double BeefBurger;
    public double Fries;
    public double BunnyChow;
    public double Samoosa;
    
    public double VanMilkShake;
    public double BubbleMilkShake;
    public double VirginMojito;
    public double StrwMojito;
    public double BobaTea;
    
    public double Meals;
    public double Drinks;
    public double TotalofMD;
    
    public double AllTotalofMD;
    
    
    public double GetAmount(){
        
        Meals = ChickenBurger + BeefBurger + Fries + BunnyChow + Samoosa;
        Drinks = VanMilkShake + BubbleMilkShake + VirginMojito + StrwMojito + BobaTea;
        TotalofMD = Meals + Drinks;
        AllTotalofMD = TotalofMD;
        return AllTotalofMD;
        
    }
    
    private JFrame frame;
    
   public void iExitSystem(){
        frame = new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Qasim's Takeaways",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }
   
   //===========================================Prices=====================================================================
   
   public double pChickenBurger = 35.00;
    public double pBeefBurger = 40.00;
    public double pFries = 10.00;
    public double pBunnyChow = 20.00;
    public double pSamoosa = 5.00;
    
    public double pVanMilkShake = 25.00;
    public double pBubbleMilkShake = 25.00;
    public double pVirginMojito = 28.00;
    public double pStrwMojito = 24.00;
    public double pBobaTea = 30.00;
   
   //======================================================================================================================
    
    public double mcTax = 0.99;
    
    public Double cFindTax(double cAmount){
        double FindTax = cAmount - (cAmount * mcTax);
        return FindTax;
    }
    //======================================================================================================================
   
    
    
    
    
}
