package OOP;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle(){
        this.length = 1.0f;
        this.width = 1.0f;
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }
    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }
    public float getWidth() {
        return width;
    }
    public void setWidth(float width) {
        this.width = width;
    }
    public float calculateArea(){
        return width * length;
    }
    public float calculatePerimeter(){
        return 2 * (width + length);
    }
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
