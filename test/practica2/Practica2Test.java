/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author oscar
 */
public class Practica2Test {
    
    public Practica2Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * casos de prueba
     * 
     * new Practica2(1,2d) - cuadrado de lado 2    Resultado esperado=4 OK
     * new Practica2(1,3d) - cuadrado de lado 3    Resultado esperado=4 FAIL
     * new Practica2(1,5d) - cuadrado de lado 5    Resultado esperado=25 OK
     * new Practica2(1,5d) - cuadrado de lado 5    Resultado esperado=50 FAIL
     */
    @Test
    public void testArea() {
        System.out.println("area");
        Practica2 obj = new Practica2(1,5d) ;
        double expResult = 50.0;
        double result = obj.area();
        if (expResult==result){
            System.out.println("Resultado esperado: "+expResult+". Resultado obtenido:"+result);
        }else{
            fail("Resultado no esperado.");
        }
        
    }
    
}
