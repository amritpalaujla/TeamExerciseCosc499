import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class main{

    public static void main(String[] args){
        // calling and printing add method results
        int addAns = add(5,3);
        System.out.println(addAns);
    }

    // add method
    public static int add(int a, int b){
        return a+b;
    }

    //Testing
    @Test
    public void testAdd(){
        assertEquals(10, add(6,4));
    }



}