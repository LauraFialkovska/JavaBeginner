package lesson_3.myDog;

public class DogDemo {
    public static void main(String[] args) {
        Dog dogi = new Dog("Dendjuk", 5, "Light green");
        dogi.voice();

        dogi.changeColor("Pink");
        dogi.happyBirthday();
        dogi.voice();
    }
}
