package DSA.LinkedLists;

// java has it inbuilt linkedlist class, so no need to write the logic yourself. 
// import java.util.LinkedList;

public class App {
    public static void main(String[] args) {

        Linked nums = new Linked();

        nums.add(6);
        nums.add(5);
        nums.add(9);

        nums.addFirst(10);
        nums.delete(5);

        // nums.addFirst(6);
        // nums.peek();
        nums.printValues();
        // System.out.println(nums);

    }
}
