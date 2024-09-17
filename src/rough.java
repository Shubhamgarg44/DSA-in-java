public class rough {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8, -1, 4, 10, 12};
        int maxlearn = Integer.MIN_VALUE;

        for (int number : numbers) {
            System.out.println(numbers[number]);
            if (number > maxlearn) {
                maxlearn = number;
            }
        }

     System.out.println("The maximum value is: " + maxlearn);
    }
}
