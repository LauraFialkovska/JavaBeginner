package lesson_5.level_5;

public class ArrayDemo {
    public static void main(String[] args) {
        Array array = new Array();

        int arrayLength = array.askForNewArrayLength();
        int[] myArray = array.create(arrayLength);

        array.print(myArray);

        array.fillRandomly(myArray);
        array.print(myArray);
        array.findMax(myArray);
    }
}
