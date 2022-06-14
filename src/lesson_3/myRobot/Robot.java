package lesson_3.myRobot;

public class Robot {
    String name;

    public Robot(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Robot " + name + " says hello!");
    }

    public void sayYourName(){
        System.out.println("My name is " + name + "!");
    }
}
