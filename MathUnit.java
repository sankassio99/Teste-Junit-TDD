/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.introducaojunit;

import java.util.Objects;

/**
 *
 * @author kassio
 */
public class MathUnit {
    public static int mdc(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
        
        final int maior = Math.max(a, b);
        b = Math.min(a, b);
        a = maior ; 
        
        if(b > 0 && a % b == 0){
            return b;
        } 
        
        if(b == 0){
            return Math.abs(a);
        }
        
        if(a % b !=0){
            return 1 ;
        }
        
    return mdc( a-b, b);  
    }
//    public static int mdcPrimo(int p, int a){
//
//        if(a > 0 && p % a == 0){
//            for(int i=2;i>p-1;i++){
//                if(!(i%p==0)){
//                    return p; 
//                }
//            }
//        
//        }
//        return -1 ; 
//    }

    public static int mdc(int ...valores){
        Objects.requireNonNull(valores, "O paramentro não pode ser nulo!");
        
        if(valores.length == 0){
            throw new IllegalArgumentException("É preciso indicar ao menos um valor para calcular o mdc");
        }
        int a = valores[0];
        for (int b : valores) {
            a = mdc(a,b);
        }
        
        return a;
    }

}
