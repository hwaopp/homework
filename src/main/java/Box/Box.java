package Box;

public class Box {

    float length, width;
    int height;

    public Box(float length, float width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public boolean validate(float length, float width, int height) {
        return length <= this.length && width <= this.width && height <= this.height;
    }
}
