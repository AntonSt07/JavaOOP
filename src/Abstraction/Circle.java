package Abstraction;

public class Circle extends GraphicalObject{

    @Override
    void draw() {
        System.out.println("Drawing a circle!");
    }

    @Override
    void resize() {
        System.out.println("Resizing the circle!");
    }
}
