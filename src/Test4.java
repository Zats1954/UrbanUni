import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test4 {

    private static  List<String> colors;
    private static LinkedList<Integer> digits;

    public static void main(String[] args) throws Exception {
        /* Домашнее задание по теме "Collection List ArrayList LinkedList"*/
        colors = new ArrayList<>() {
            {
                add("black");
                add("white");
                add("red");
            }
        };
        colors.add("yellow");
        String myColor = "red";
        System.out.println("is " +myColor + " in List colors? " + haveColor(myColor));
        myColor = "green";
        System.out.println("is " +myColor + " in List colors? " + haveColor(myColor));
//------------------------------------------------------------------------
        digits = new LinkedList<>(){{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
        }};
        for(int j : digits) {
            System.out.print(j + " ");
        }
        System.out.println("    ");
        changeBorderDigits(digits);
        for(int j : digits) {
            System.out.print(j + " ");
        }
        System.out.println("    ");
    }

    public static boolean haveColor (String newColor){
        for(String color : colors){
            if(newColor.equals(color)){
                return true;
            }
        }
        return false;
    }

    public static void changeBorderDigits (LinkedList <Integer> arrayInts){
        int tmp = arrayInts.get(0);
        int lastIndex = arrayInts.size() -1;
        arrayInts.set(0, arrayInts.get(lastIndex));
        arrayInts.set(lastIndex, tmp);
    }
}

