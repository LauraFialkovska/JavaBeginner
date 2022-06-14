package lesson_3.myDog;

public class Dog {
    String nickname;
    int age;
    String color;

    public Dog(String nickname, int age, String color) {
        this.nickname = nickname;
        this.age = age;
        this.color = color;
    }

    void changeColor(String color){
        this.color = color;
    }

    void happyBirthday(){
        age += 1;
    }

    void voice(){
        System.out.println("Nickname: " + nickname +
                " Age: " + age +
                " Color: " + color);
    }
}
