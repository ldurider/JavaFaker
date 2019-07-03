/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopractica;

/**
 *
 * @author ldurider
 */
public class ProyectoPractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = "Test ##???";
        Fake f = new Fake();
        //f.letterify(cadena);
        //f.numerify(cadena);
        //f.bothify(cadena);
        
        System.out.println(f.letterify(cadena));
        System.out.println(f.numerify(cadena));
        System.out.println(f.bothify(cadena));
       
    }
    
}
