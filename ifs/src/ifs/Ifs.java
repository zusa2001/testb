/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifs;

import javax.swing.JOptionPane;


/**
 *
 * @author HP
 */
public class Ifs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String placa = JOptionPane.showInputDialog(null,"Ingrese su numero de placa");
        
        String t = Character.toString(placa.charAt(5));
        Integer nf = Integer.parseInt(t);
        
        
        
        if(nf==1){
            JOptionPane.showMessageDialog(null,"Puedes transitar lunes","",JOptionPane.WARNING_MESSAGE);
        }else{
            if(nf==2){
                JOptionPane.showMessageDialog(null,"Puedes transitar lunes","",JOptionPane.WARNING_MESSAGE);
            }else{
                if(nf==3){
                    JOptionPane.showMessageDialog(null,"Puedes transitar martes","",JOptionPane.WARNING_MESSAGE);
                }else{
                    if(nf==4){
                        JOptionPane.showMessageDialog(null,"Puedes transitar martes","",JOptionPane.WARNING_MESSAGE);
                    }else{
                        if(nf==5){
                            JOptionPane.showMessageDialog(null,"Puedes transitar miercoles","",JOptionPane.WARNING_MESSAGE);
                        }else{
                            if(nf==6){
                                JOptionPane.showMessageDialog(null,"Puedes transitar miercoles","",JOptionPane.WARNING_MESSAGE);
                                
                            }else{
                                if(nf==7){
                                    JOptionPane.showMessageDialog(null,"Puedes transitar jueves","",JOptionPane.WARNING_MESSAGE);
                                    
                                }
                                else{
                                    if(nf==8){
                                        JOptionPane.showMessageDialog(null,"Puedes transitar jueves","",JOptionPane.WARNING_MESSAGE);
                                        
                                    }else{
                                        if(nf==9){
                                            JOptionPane.showMessageDialog(null,"Puedes transitar viernes","",JOptionPane.WARNING_MESSAGE);
                                            
                                        }else{
                                            if(nf==0){
                                                JOptionPane.showMessageDialog(null,"Puedes transitar viernes","",JOptionPane.WARNING_MESSAGE);
                                                
                                            }
                                        }
                                     }
                                }
                            }
                        }
                    }
                }
            }
    
        }
    }
    
}
