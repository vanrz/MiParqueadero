/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueadero;

/**
 *
 * @author Estudiantes
 */
public class Parqueadero {
    
    Vehiculo miVehiculo[]=new Vehiculo[100];
    
    public void consultarCupo(){
        
        for (int i=0;i<100;i++){
            
            miVehiculo[i]=new Vehiculo();
        }
         if (miVehiculo == null) {
            System.out.println("Hay cupos disponibles.");
        } else {
            System.out.println("No hay cupos disponibles.");
}
            
        
    }
        
    public int retirarVehiculo(){
        
       
       int HoraEntrada=0;
        int HoraSalida = 0;
        int  vp=0;
        
        
        vp= (HoraSalida-HoraEntrada)*100;
        
        return vp;
        }
        
        
        
    }    
    
    public void ingresarVehiculo(){
    
}        
        
    }
}
    
    
    

    
    
}
