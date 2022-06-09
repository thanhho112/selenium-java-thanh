package lesson_05;

import java.util.HashMap;
import java.util.Map;

public class HashMapLearning {

    public static void main(String[] args) {
        hm1();
    }

    public static void hm1(){
        Map<Integer, String> emergencyList = new HashMap<>();
        emergencyList.put(113, "CSCD");
        emergencyList.put(114, "Cuu hoa");
        emergencyList.put(115, "Cap Cuu");
        emergencyList.put(116, "Others");

        emergencyList.get(113);
        //emergencyList.get(new Integer(113));

        /* ketSet() - set all keys*/
        for (Integer key : emergencyList.keySet()) {
            System.out.println(emergencyList.get(key));
        }
    }

    public static void hm2Replace(){
        Map<Integer, String> emergencyList = new HashMap<>();
        emergencyList.put(113, "CSCD");
        emergencyList.put(114, "Cuu hoa");
        emergencyList.put(115, "Cap Cuu");
        emergencyList.put(116, "Others");

        emergencyList.replace(116, "116");
        emergencyList.replace(116, "1167", "Something elses");
        emergencyList.remove(116);
    }

}
