/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.introducao.junit5;

/**
 *
 * @author flavio
 */
public class MathUtil {
    //                        0,   -30
    public static int mdc(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
        //propriedade6
        final int maior = Math.max(a, b);
        b = Math.min(a, b);
        a = maior;
         //propriedade1       
        if(b > 0 && a % b ==0){
            return b;
        }
        //propriedade3
        if(b == 0){
            return Math.abs(a);
        }
        //propriedade5
        if(a % b != 0 ){
            return 1;
        }
    return -1;
}
}
