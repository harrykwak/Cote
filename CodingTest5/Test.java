package CodingTest5;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;




public class Test{
    public static void main(String[] args) {

        
        HashMap<Integer, Integer[]> map = new HashMap<Integer, Integer[]>();
        
        map.put(1, new Integer[]{100, 87, 66});
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(map.get(1)));
        System.out.println(Collections.max(list));
        
    }
}