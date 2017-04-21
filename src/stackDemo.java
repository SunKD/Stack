/**
 * Created by SunDa on 4/16/2017.
 */
import java.util.Arrays;

public class stackDemo {
    public static void main(String [] args)
    {
        stack myStack = new stack();

        System.out.println("Is the stack empty? "+myStack.empty());

        myStack.push(1);
        myStack.push(4);
        myStack.push(2);

        System.out.println("Size after push the numbers: " +myStack.size());
        myStack.pop();

        System.out.println("Is the stack empty?: " +myStack.empty());
        System.out.println("The top number of the stack: " +myStack.top());
        System.out.println("Size of the stack: "+myStack.size());
    }
}
