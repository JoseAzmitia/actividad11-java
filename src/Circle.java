public class Circle implements Shape{
    private double radio;

    public Circle(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double getPerimeter() {
        return (2 * Math.PI) * radio;
    }

    @Override
    public double getArea() {
        return Math.PI * (radio * radio);
    }
}
