import java.util.*;

public class App {
    //Write code that will:
    //1. Store the following values in an ArrayList: 6, 3, 1, 2
    //   The name of the ArrayList is up to you.
    //2. Print the contents of your ArrayList using loops. This should work even if 
    //   I add more elements to your ArrayList. For example, I might add 7 to the
    //   ArrayList and this should still work.
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);    
    ArrayList<Integer> list = new ArrayList<>();
    list.add(6);
    list.add(3);
    list.add(1);
    list.add(2);
    list.add(7);
    for (int i = 0; i < list.size(); i++) {
        
        System.out.println(list.get(i));
    }
    }
}
