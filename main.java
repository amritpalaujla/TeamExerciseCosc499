
import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertArrayEquals;



import org.junit.Test;

public class main{

    public static void main(String[] args){

        System.out.println(multiply(5,3));
    }

    public static int multiply(int a, int b){
        return a*b;
    }

 


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
    public void testMultiply(){
        assertEquals(144, multiply(12,12));
    }




}