import java.util.*;

public class Test6 {

    private static TreeMap<Integer, String> example;
    private static Set<Integer> digits;

    public static void main(String[] args) throws Exception {
        /* Домашнее задание по теме "Коллекции. Map.HashMap.TreeMap"*/
        example = new TreeMap<>() {
            {
                put(8, "two");
                put(5, "one");
                put(2, "three");
                put(9, "four");
            }
        };

        System.out.println("keySet");
        Set<Integer> keys =   mapKeys(example);
        for (int key : keys) {
            System.out.print(key + " ");
        }
        System.out.println(" ");

        System.out.println("result (value >3 letters)");
        TreeMap <Integer, String> result = mapThreeLetters(example);
        for (Map.Entry<Integer, String> unit: result.entrySet()) {
            System.out.println(unit.getKey() + " " + unit.getValue());
        }
        System.out.println(" ");
    }

    public static Set<Integer> mapKeys(TreeMap<Integer, String> map){
        return map.keySet( );
    }

    public static TreeMap<Integer, String> mapThreeLetters(TreeMap<Integer, String> map){
        TreeMap<Integer, String> newMap = new TreeMap<>();
        for(Map.Entry<Integer, String> unit: map.entrySet()){
            if(unit.getValue().length() >3 ){
                newMap.put(unit.getKey(), unit.getValue());
            }
        }
        return newMap;
    }
}


