/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asd;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ricohelvidadrian
 */
public class HashLibTest {

    public HashLibTest() {
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
     * Test of contains method, of class HashLib.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Object obj = null;
        HashLib instance = new HashLib();
        boolean expResult = false;
        boolean result = instance.contains(obj);
        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testContains2() {
        System.out.println("contains");
        HashLib instance = new HashLib();
        instance.add(12345);
        instance.add(1234);
        boolean expResult = true;
        boolean result = instance.contains(1234);
        assertEquals(expResult, result);

    }

    @Test
    public void testContains3() {
        System.out.println("contains");
        HashLib instance = new HashLib();
        instance.add(12345);
        instance.add(1234);
        boolean expResult = false;
        boolean result = instance.contains(123456);
        assertEquals(expResult, result);

    }

    /**
     * Test of add method, of class HashLib.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object obj = null;
        HashLib instance = new HashLib();
        instance.add(obj);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
