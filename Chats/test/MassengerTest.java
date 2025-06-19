/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class MassengerTest {
    
    public MassengerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of search method, of class Massenger.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        Massenger instance = new Massenger();
        instance.search();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of msgnLoop method, of class Massenger.
     */
    @Test
    public void testMsgnLoop() {
        System.out.println("msgnLoop");
        Massenger instance = new Massenger();
        instance.msgnLoop();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValidPhoneNumber method, of class Massenger.
     */
    @Test
    public void testIsValidPhoneNumber() {
        System.out.println("isValidPhoneNumber");
        String phnNum = "";
        Massenger instance = new Massenger();
        boolean expResult = false;
        boolean result = instance.isValidPhoneNumber(phnNum);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of collectMsgn method, of class Massenger.
     */
    @Test
    public void testCollectMsgn() {
        System.out.println("collectMsgn");
        int count = 0;
        String phone = "";
        String identifier = "";
        Massenger instance = new Massenger();
        instance.collectMsgn(count, phone, identifier);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of msgnID method, of class Massenger.
     */
    @Test
    public void testMsgnID() {
        System.out.println("msgnID");
        Massenger instance = new Massenger();
        String expResult = "";
        String result = instance.msgnID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of msgnHash method, of class Massenger.
     */
    @Test
    public void testMsgnHash() {
        System.out.println("msgnHash");
        String messageID = "";
        int messageNumber = 0;
        String messageText = "";
        Massenger instance = new Massenger();
        String expResult = "";
        String result = instance.msgnHash(messageID, messageNumber, messageText);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of msgnReview method, of class Massenger.
     */
    @Test
    public void testMsgnReview() {
        System.out.println("msgnReview");
        int i = 0;
        String message = "";
        String messageID = "";
        String messageHash = "";
        Massenger instance = new Massenger();
        int expResult = 0;
        int result = instance.msgnReview(i, message, messageID, messageHash);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of msgnPrint method, of class Massenger.
     */
    @Test
    public void testMsgnPrint() {
        System.out.println("msgnPrint");
        Massenger instance = new Massenger();
        instance.msgnPrint();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of msgnTotal method, of class Massenger.
     */
    @Test
    public void testMsgnTotal() {
        System.out.println("msgnTotal");
        Massenger instance = new Massenger();
        int expResult = 0;
        int result = instance.msgnTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of msgnJSONSave method, of class Massenger.
     */
    @Test
    public void testMsgnJSONSave() {
        System.out.println("msgnJSONSave");
        List<Massenger.MessagesJSON> messages = null;
        String filePath = "";
        Massenger instance = new Massenger();
        instance.msgnJSONSave(messages, filePath);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchMessageByID method, of class Massenger.
     */
    @Test
    public void testSearchMessageByID() {
        System.out.println("searchMessageByID");
        Massenger instance = new Massenger();
        instance.searchMessageByID();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Massenger.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Massenger.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
