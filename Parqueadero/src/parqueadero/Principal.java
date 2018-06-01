/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueadero;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Principal {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Parqueadero miParqueadero=new Parqueadero();
        Vehiculo misVehiculo=new Vehiculo();
        System.out.println(" MI PARQUEADERO");
        
    
        System.out.println(" Seleccione: ");
        System.out.println(" 1. Ingresar Vehiculo");
        System.out.println(" 2. Retirar Vehiculo");
        System.out.println(" 3. Consultar Cupo");
        
        Scanner miScann=new Scanner(System.in);
        switch (miScann.nextInt()) {     
            case 1:
                System.out.println("Digite la placa del vehiculo");
                misVehiculo.setPlaca(miScann.nextString));
                System.out.println("Digite el nombre del propietario");
                misVehiculo.setPropietario(miScann.nextString);
                System.out.println("Digite cilindraje");
                misVehiculo.setCilindraje(miScann.nextfloat);
                System.out.println("Hora de entrada");
                misVehiculo.setHoraEntrada(miScann.nextDouble);
                System.out.println("Guardado");
            case 2:
                System.out.println("digite hora de entrada del  vehiculo");
                misVehiculo.setHoraEntrada(miScann.nextDouble());
                System.out.println("Idigite hora de salida");
                misVehiculo.setHoraSalida(miScann.nextDouble());
                
                misVehiculo.retirarVehiculo();
                System.out.println(miVehiculo.getvp());
            case 3:
                
         
        // TODO code application logic here
    }
    
}