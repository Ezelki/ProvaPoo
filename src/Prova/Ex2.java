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
public class Ex2 {
    public static void main(String[] args) {
        double sm = 1192.40;
        double qh = sm/5;
        int qg;
        double v, d;
        
        DecimalFormat f = new DecimalFormat("#.##");
        Scanner l = new Scanner(System.in);
        System.out.println("Digite quantos quilowatts/hora a residência gasta.");
        qg = l.nextInt();
        
        v = qh*qg;
        
        System.out.println("O valor a ser pago é: "+f.format(v));
        
        d = (v*17)/100;
        v = v - d;
        
        System.out.println("O valor a ser pago com 17% de desconto é: "+f.format(v));
        
        System.out.println("Cada quilowatt custa: "+f.format(qh));
    }
}
