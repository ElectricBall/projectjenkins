/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Model.Buku;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Iqbal
 */
public class BukuDAOTest {
    
    public BukuDAOTest() {
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
     * Test of save method, of class BukuDAO.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Buku b = null;
        int expResult = 1;
        int result = BukuDAO.save(b);
        assertEquals(expResult, result);
    }

    /**
     * Test of update method, of class BukuDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Buku b = null;
        int expResult = 0;
        int result = BukuDAO.update(b);
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class BukuDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Buku b = null;
        int expResult = 0;
        int result = BukuDAO.delete(b);
        assertEquals(expResult, result);
    }

    /**
     * Test of getAllRecords method, of class BukuDAO.
     */
    @Test
    public void testGetAllRecords() {
        System.out.println("getAllRecords");
        List<Buku> expResult = null;
        List<Buku> result = BukuDAO.getAllRecords();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRecordById method, of class BukuDAO.
     */
    @Test
    public void testGetRecordById() {
        System.out.println("getRecordById");
        int id = 0;
        Buku expResult = null;
        Buku result = BukuDAO.getRecordById(id);
        assertEquals(expResult, result);
    }
    
}
