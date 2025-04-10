/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba2;

import javax.swing.JOptionPane;

/**
 *
 * @author sheyr
 */
public class Habitaciones {
    private final int cuarto= 4;
    private final int piso = 3;
    public  String hotel[][]; 

    public Habitaciones(String[][] hotel) {
        this.hotel = hotel;
        
    }

    Habitaciones() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    
    
    
    public void Habitaciones (){
          int numeroH= 101;
        for (String[] hotel1 : hotel) {
            for (int j = 0; j < hotel1.length; j++) {
                hotel1[j] = String.valueOf(numeroH++);
            }
        } 
    }
    
    
    public void AsignarHab(){
         for (int i = 0; i < cuarto; i++) {
                 for (int j = 0; j < piso; j++) {
                     
                     int cuartos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de piso: ")) ;
                     int pisos  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cuarto: ")) ;

                     if (pisos >= 0  && cuartos >= 0 ) {
                         if ("ocupado".equals(hotel[cuartos][pisos])) {
                              hotel [this.piso][this.cuarto] = " liberado ";
                              JOptionPane.showMessageDialog(null, "Se libero con exitosamente.");
                      
                     }else {
                           JOptionPane.showMessageDialog(null, "El Espacio ya esta libre ");
                             } 
                     } else {
                         JOptionPane.showMessageDialog(null, "Ubicado fuera del rango. ");
                        }             
                     }  }
                     

                 }
   public void MostrarHabitaciones(String[][] hotel){
        if (hotel == null) return;
   
        String estadoHab = " | 1 | 2 | 3 | 4 |\n";
        for (int i = 0; i < hotel.length; i++) {
            estadoHab += (i + 1) + " | ";
            for (int j = 0; j < hotel[i].length; j++) {
                estadoHab += hotel[i][j] + " | ";
        JOptionPane.showMessageDialog(null, "Estado del Hotel \n" + estadoHab);
         
            }
        }
    }
      
    public void liberarHab(){
         for (int i = 0; i < cuarto; i++) {
                 for (int j = 0; j < piso; j++) {
                     
                     int cuarto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de piso: ")) ;
                     int piso  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cuarto: ")) ;

                     if (piso >= 0  && cuarto >= 0 ) {
                         if ("ocupado".equals(hotel[cuarto][piso])) {
                              hotel [this.piso][this.cuarto] = " reservado ";
                              JOptionPane.showMessageDialog(null, "Se reservo exitosamente.");
                      
                     }else {
                           JOptionPane.showMessageDialog(null, "El Espacio ya esta ocupado. ");
                             } 
                     } else {
                         JOptionPane.showMessageDialog(null, "Ubicado fuera del rango. ");
                        }             
                     }  
            }
                     

                 }

    void LiberarHab() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

  
