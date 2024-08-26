/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

/**
 *
 * @author maria alejandra
 */
public class modelos {
    int digitocedula[]= new int[15];
    int modelo1=0, modelo2=0, modelo3=0,modelo4=0,modelo5=0;
    
    public modelos(int[]digitocedula){
    this.digitocedula=digitocedula;
    
    }
    public void modelo1(){
       
        for(int a=0;a<15;a++){
            if(digitocedula[a]==1||digitocedula[a]==6)
                modelo1++;
            }
        }
    public void modelo2(){
        
        for(int a=0;a<15;a++){
            if(digitocedula[a]==2||digitocedula[a]==7)
                modelo2++;
            }
        }
    public void modelo3(){
        
        for(int a=0;a<15;a++){
            if(digitocedula[a]==3||digitocedula[a]==8)
                modelo3++;
            }
        }

    public void modelo4(){
        
        for(int a=0;a<15;a++){
            if(digitocedula[a]==4||digitocedula[a]==9)
            modelo4++;
        }
    }
    public void modelo5(){
        
        for(int a=0;a<15;a++){
            if(digitocedula[a]==5||digitocedula[a]==0)
                modelo5++;
            }
        }
    
    public int model1(){ 
        return modelo1; 
    }
    public int model2(){
        return modelo2;
    }
    public int model3(){
        return modelo3;
    }
    public int model4(){
        return modelo4;
    }
    public int model5(){ 
        return modelo5; 
    }
    
}  
    
    
     

  