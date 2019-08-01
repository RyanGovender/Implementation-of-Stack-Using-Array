/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraystack;

/**
 *
 * @author 21614
 */
public class ArrayStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StackInterface<Integer> s = new Stack<Integer>();
        s.push(45);
        s.push(98);
        s.push(73);
        
        System.out.println("The size of the stack: "+ s.Size());
        System.out.println("The top value is:  "+s.peek());
        System.out.println("The top value on the stack: "+ s.pop());
        System.out.println("The size of the stack: "+ s.Size());
        System.out.println("The top value on the stack: "+ s.pop());
    }
    
}
