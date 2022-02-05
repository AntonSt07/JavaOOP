package Abstraction;

public class AbstractionDemo {
    public static void main(String[] args){
        GraphicalObject circle = new Circle();
        circle.draw();
        circle.resize();

        GraphicalObject rectangle = new Rectangle();
        rectangle.draw();
        rectangle.resize();
    }

}
