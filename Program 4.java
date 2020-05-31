import java.util.*;
class test{
    int x;
    test(int z){
        x = z;
        System.out.println(x);
    }
}

public class Main{
  public static void main (String[] args) {
        test obj = new test(10);
        obj = new test(20);
    }
}
