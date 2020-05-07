/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.introducaojunit;

/**
 *
 * @author kassio
 */
public class MathUnit {
    public static int mdc(int a, int b){
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
        
    return -1;    
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

    public static int mdc3(int a, int b, int c){
        if(b > 0 && a % b == 0){
            if(c > 0 && b % c == 0)
                return c;
        } 

        return -1;
    }

}
