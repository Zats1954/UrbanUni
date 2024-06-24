public class Test1 {
    private static boolean maxInt = false;
    private final double ODIN = 1.0;
    private double i = 1.0;
    private static int j = 0;


    public static void main(String[] args) {
        /* Домашнее задание по теме "Exception"*/
        Test1 test = new Test1();
        boolean repeate = true;
        while (repeate) {
            try {
                test.minDouble();
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                repeate = false;
            } finally {
                if (!maxInt) {
                    try {
                        int m = (int) Math.pow(0.1, j);
                        int l = 1 / m;
                    } catch (ArithmeticException e) {
                        System.out.print("error \"1/(int) Math.pow(0.1, j)\":");
                        System.out.println(e.getMessage());
                        maxInt = true;
                    }
                }
            }
        }
    }

    private void minDouble() throws ArithmeticException {
        j++;
        i = i / 10;
        double k = ODIN / i;
        if (Double.isInfinite(k)) {
            throw new ArithmeticException("minDouble " + Math.pow(0.1, --j));
        }
    }
}
