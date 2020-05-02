/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.introducaojunit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
    
}
