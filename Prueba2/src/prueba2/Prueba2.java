/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba2;

import javax.swing.JOptionPane;

/**
 *
 * @author sheyr
 */
public class Prueba2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MenudeHabitaciones();
        
        
    
    }


    public static void MenudeHabitaciones() {
        Habitaciones menu = new Habitaciones();
        
        while (true) {
            String opcion = JOptionPane.showInputDialog("Habitaciones \n"
                    + "1. Asignar Habitacion \n "
                    + "2. Liberar Habitacion \n"
                    + "3. Ver Estado del Hotel \n"
                    + "4. Salir");

            if (opcion == null || opcion.equals("4")) {
                break;
            }

            switch (opcion) {
                case "1":
                    menu.AsignarHab();
                    break;
                case "2":
                    menu.LiberarHab();
                    break;
                case "3":
                    menu.MostrarHabitaciones();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida.");

            }
    
     
        }}

    private void AsignarHab() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void LiberarHab() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void MostrarHabitaciones() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
