package lec_11.ex;

/*
Реалізуйте клас Rectangle з полями width та height. Напишіть методи calculateArea() і calculatePerimeter().
 */
public class Rectangle {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int calculateArea(){
        return width * height;
    }

    public int calculatePerimeter(){
        return 2 * (width + height);
    }
}
