package test;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CacualaterTest {
@Test

    public void testCacualator(){
       int num1 =1;
       int num2 =2;
       // gi tri mong muoon nhan dudowjc
        int expected = 2;

        int result = num1+num2;
        assertEquals(expected, result);


    }
}
