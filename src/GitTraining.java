public class GitTraining {
    public static void main(String[] args) {
        int heltal = 13;
        int nyttTal = increment(heltal);
        System.out.println(nyttTal);
        nyttTal = decrement(heltal);
        System.out.println(nyttTal);

        int product = multiply(3, 5);
        System.out.println(product);

    }

    public static int increment(int input) {
        return input + 1;
    }

   public static int decrement(int input) {
        return input - 1;
    }

    public static int multiply(int factor1, int factor2) {
        return factor1*factor2;
    }
}
