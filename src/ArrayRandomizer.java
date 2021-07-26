import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayRandomizer {
    public static void main(String[] args) {
        int [] a= new int[5];
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int counter=1; counter<6; counter++) {
                list.add(counter);
            }
            Collections.shuffle(list);
            for (int counter=0; counter<5 ;counter++) {
                a[counter]=list.get(counter);
            }

        }
}
