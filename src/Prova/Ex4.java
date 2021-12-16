/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prova;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author IFSC
 */
public class Ex4 {

    public static void main(String[] args) {
        int m[] = new int[999];
        int vc;
        double vm[] = new double[999];
        double vt = 0;

        Scanner l = new Scanner(System.in);

        System.out.println("Digite quantas carteiras serão verificadas: ");
        vc = l.nextInt();

        int c[] = new int[vc];

        for (int i = 0; i < vc; i++) {
            System.out.println("Digite sua carteira de motorista: ");
            c[i] = l.nextInt();
        }

        for (int i = 0; i < vc; i++) {
            if ((c[i] < 1) || (c[i] > 3235)) {

                System.out.println("Número da carteira errada, por favor digite novamente: ");
                c[i] = l.nextInt();

            }
        }
        
        
        
        

    }
}
