package Abstraction;

public abstract class GraphicalObject {
    int x, y;
    void moveTo(int x, int y){
        System.out.println("move to x: "+ x + ", and y: " + y);
    }
    abstract void draw();
    abstract void resize();
}
