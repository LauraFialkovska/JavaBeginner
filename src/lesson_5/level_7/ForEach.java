package lesson_5.level_7;

public class ForEach {
    public static void main(String[] args) {
        int[] array = {5, 1, 78, 0, 123};
        int sum = 0;

        System.out.println("'For each' loop - array visualization:");

        for (int element : array) {
            if (element % 2 == 0) {
                System.out.println(element + " // Even");
            } else {
                System.out.println(element + 2 + " // Changed (+2)");
            }

            sum += element;
        }

        System.out.print("\n" + "Sum: " + sum);
    }
}
