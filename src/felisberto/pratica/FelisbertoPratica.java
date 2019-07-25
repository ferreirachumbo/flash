/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package felisberto.pratica;

import java.util.Scanner;

/**
 *
 * @author trajano
 */
public class FelisbertoPratica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        int x;
        int y;
        System.out.println("digiti dois numero");
        x = entrada.nextInt();
        y = entrada.nextInt();
        int maior = Math.max(x, y);
        if(maior % 2 == 0){
            System.out.println("o numero " + maior +" e par");
        }else{
            
            System.out.println("o numero " + maior +" e impar");
        }
    
       }
    
}
