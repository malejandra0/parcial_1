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
    
    public modelos(int[]digitocedula){ //Este es el constructor en la clase
    this.digitocedula=digitocedula;
    
    }
    //Usaremos setters para calcular a que modelo pertenece cada ultimo digito de cedula ingresado por el usuario
    public void modelo1(){
       // los void en los setters no retornan nada
        for(int a=0;a<15;a++){                          //usamos un for inicializado en 0 para que vaya aumentando si el dato que
                                                         //digitó en el vector es 1 y 6
            if(digitocedula[a]==1||digitocedula[a]==6)
                modelo1++;
            }
        }
    //Se hace el mismo proceso, con la unica diferencia del cambio de datos ingresados 
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
    //Aqui haremos los getters para retornar de la clase al main y poder mostrarlo.
    
    public int model1(){ 
        //Los tipos como int, double, etc en los getters son porque van a retornar al main
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
    
    
     

  
