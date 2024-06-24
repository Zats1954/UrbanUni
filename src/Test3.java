public class Test3 {

    public static void main(String[] args) throws Exception {
        /* Домашнее задание по теме "Exception"*/
        String[] oneString = {"one", "two", "three", "four", "five"};
        String[] nextString = {"one", "two", "three", "four", "five"};
        System.out.println("arrays oneString and nextString");
        testArrays(oneString, nextString);
        nextString = swap(oneString, 2, 4);
        System.out.println("arrays oneString and nextString");
        testArrays(oneString, nextString);
        nextString = new String[]{"one", "two", "five", "four"};
        try {
            testArrays(oneString, nextString);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Double[] oneDouble = {25.0, 15.5, 68.3, 32.4, 7.6};
        Double[] nextDouble = oneDouble.clone();

        System.out.println("initial nextDouble:");
        for(Double item: nextDouble){
            System.out.print(item + " ");
        }
        System.out.println("");

        System.out.println("arrays oneDouble and nextDouble");
        testArrays(oneDouble, nextDouble);
        nextDouble = swap(oneDouble, 2, 4);
        System.out.println("arrays oneDouble and nextDouble");
        testArrays(oneDouble, nextDouble);

        System.out.println("nextDouble after swap:");
        for(Double item: nextDouble){
            System.out.print(item + " ");
        }
        System.out.println("");
        nextDouble = new Double[]{25.0, 15.5, 68.3};
        try {
            testArrays(oneDouble, nextDouble);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static <T> void testArrays(T[] oneArray, T[] nextArray) throws Exception {
        if (sravnenie(oneArray, nextArray)) {
            System.out.println("arrays are equal");
        } else {
            System.out.println("arrays are different");
        }
    }

    public static <T> boolean sravnenie(T[] str1, T[] str2) throws Exception {
        if (str1.length != str2.length) {
            throw new IndexOutOfBoundsException("sravnenie() - arrays with different length");
        }
        for (int i = 0; i < str1.length; i++) {
            if (str1[i] != str2[i])
                return false;
        }
        return true;
    }

    public static <T> T[] swap(T[] str, int first, int second) throws IndexOutOfBoundsException {
        if (first >= str.length || second >= str.length) {
            throw new IndexOutOfBoundsException("swap() - IndexOutOfBounds");
        }
        T[] str0 = str.clone();
        T tmp = str0[first];
        str0[first] = str0[second];
        str0[second] = tmp;
        return str0;
    }
}

