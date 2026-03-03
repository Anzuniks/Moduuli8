package moduuli8_1.task2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

   class StringManipulatorTest {

       @Test
       void testConcatenate() {
           StringManipulator sm = new StringManipulator();

           assertEquals("HelloWorld", sm.concatenateWithSpace("Hello", "World"));
           assertEquals("Hello", sm.concatenateWithSpace("Hello", ""));
           assertEquals("", sm.concatenateWithSpace("", ""));
       }

   @Test
   void testFindLength()  {
       StringManipulator sm = new StringManipulator();

       assertEquals(5, sm.findLength("Hello"));
       assertEquals(0, sm.findLength(""));
       assertEquals(3, sm.findLength("123"));
   }

    @Test
    void testConvertToUpperCase()  {
        StringManipulator sm = new StringManipulator();

        assertEquals("HELLO", sm.convertToUpperCase("hello"));
        assertEquals("HELLO WORLD", sm.convertToUpperCase("Hello World"));
        assertEquals("", sm.convertToUpperCase(""));
    }

    @Test
    void testConvertToLowerCase()  {
        StringManipulator sm = new StringManipulator();

        assertEquals("hello", sm.convertToLowerCase("HELLO"));
        assertEquals("hello world", sm.convertToLowerCase("Hello World"));
        assertEquals("", sm.convertToLowerCase(""));
    }

    @Test
       void testContainsSubstring()  {
           StringManipulator sm = new StringManipulator();

           assertTrue(sm.containsSubstring("Hello World", "World"));
           assertFalse(sm.containsSubstring("Hello World", "xyz"));
           assertFalse(sm.containsSubstring("Hello World", ""));

       }

}
