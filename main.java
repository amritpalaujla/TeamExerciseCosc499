
import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertArrayEquals;



import org.junit.Test;

public class main{

    public static void main(String[] args){
        
        //calling and printing add method results
        int addAns = add(5,3);
        System.out.println(addAns);
        System.out.println(multiply(5,3));
        //calling and printing sub method results
        System.out.println(sub(5,3));
        System.out.println(divide(36,6));
        

    }

    public static int multiply(int a, int b){
        return a*b;
    }

    public static int sub(int a, int b){
        return a-b;
    }
 
    // add method
    public static int add(int a, int b){
        return a+b;
    }
    // division method. Takes two integers as input and returns the quotient of a/b.
    public static int divide(int a, int b){
        return a/b;
    }

    //Testing
    @Test
    public void testAdd(){
        assertEquals(10, add(6,4));
    }
    @Test
    public void testMultiply(){
        assertEquals(144, multiply(12,12));
    }
    @Test
    public void testSub(){
        assertEquals(8, sub(15,7));
    }
    @Test
    public void testDivision(){
        assertEquals(3, divide(15,5));
    }
}
