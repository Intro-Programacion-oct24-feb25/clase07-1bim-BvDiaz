/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclowhile;

/**
 *
 * @author reroes
 */
public class Ejemplo011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int operador = 1;
        int limite = 13;
        
        while (operador <= limite){
            System.out.printf("%d\n", operador);
            operador = operador + 1;
        }
    }
    
}
