/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cod;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @param 0 o 1 . 0 = Pde datos por consola. 1  = Pide datos en ventana. Si el parametro no esta permitido devuelve 0.
 * @return un valor numerico. 
 * @author Miguel
 */
public class EntradaDatos {

    public int introducir(int tipo) {

        int introducir2 = 0;

        if (tipo == 0) {
            System.out.println("Introducir Numero");
            Scanner dato = new Scanner(System.in);
            int introducir1 = dato.nextInt();

            System.out.println("introducir1");

            return introducir1;
        } else if (tipo == 1) {
            introducir2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce Numero"));
            
            return introducir2;
        }
        else
        return 0;    
    }

}
