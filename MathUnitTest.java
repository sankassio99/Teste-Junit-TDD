/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.introducaojunit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static com.mycompany.introducaojunit.MathUnit.mdc ;
import static com.mycompany.introducaojunit.MathUnit.mdc3 ;
/**
 *
 * @author kassi
 */
public class MathUnitTest {
    
    public MathUnitTest() {
    }

    @Test
    public void testMdcP1() {
        final int a = 6;
        final int b = 3;
        final int esperado = b ;
        final int obtido = MathUnit.mdc(a, b);
        assertEquals(esperado, obtido);
    }

    @Test
    void testeMdcImparP1(){
        final int a = 9;
        final int b = 3;
        final int esperado = b ;
        final int obtido = MathUnit.mdc(a,b);
        assertEquals(esperado, obtido);
    }
    //Propriedade 02 
    @Test
    void testeMdcP2() {
        final int a = 16;
        final int b = 8;
        final int divisor = 4 ;
        final int esperado = 0 ;
        final int obtido = MathUnit.mdc(a,b);
        assertEquals(esperado, obtido % divisor);
    }



    //Propriedade 08
    @Test
    void testeMdcP8() {
        final int a = 8;
        final int b = 8;
        final int esperado = a ;

        final int obtido = mdc(a,b);
        assertEquals(esperado, Math.abs(a));
    };
//
//    //Propriedade 09
    @Test
    void testeMdcP9(){
        final int a = 16;
        final int b = 8;
        final int c = 4 ;

        final int[] arrayEsp = { c, c, c };
        
        
        final int obtido1 = mdc(a, mdc(a,c));
        final int obtido2 = mdc(mdc(a,b),c);
        final int obtido3 = mdc3(a,b,c);
//        System.out.println("returns: "+obtido1+ obtido2+ obtido3);

        final int arrayObt [] = {obtido1, obtido2, obtido3};
        assertArrayEquals(arrayEsp , arrayObt);
        
    }

    //Propriedade 12
    //Se p é um número primo mdc(p,a)=p ou mdc(p,a)=1;
    
    @Test
    void testeMdc12() {
        final int p = 7;
        final int a = 1;
        
        final int esperado = p ;
        final int esperado2 = a ;
        
        final int obtido = mdc(p,a) ;

        System.out.println("obtido "+obtido );

        assertEquals( esperado2,  obtido );
    }
    
}
