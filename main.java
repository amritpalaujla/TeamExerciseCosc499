import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class main{

    public static void main(String[] args){
        System.out.println(multiply(5,3));
    }

    public static int multiply(int a, int b){
        return a*b;
    }

    @Test
    public void testMultiply(){
        assertEquals(144, multiply(12,12));
    }

}