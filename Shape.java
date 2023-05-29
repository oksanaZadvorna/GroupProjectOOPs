package GroupProjectOOPs;
/*
6. Create an Interface 'Shape' with undefined methods as calculateArea
and calculatePerimiter. Create 2 classes Circle & Square that
implements functionality defined in the Shape Interface. Test your
code.

 */
public interface Shape {
    void calculateArea();
    void calculatePerimiter();

}
class Circle implements Shape{
    double radius=3.5;


    @Override
    public void calculateArea() {
        System.out.println("The area of circle is: "+ Math.PI*radius*radius);
    }

    @Override
    public void calculatePerimiter() {
        System.out.println("The perimiter of circle is: "+ 2*Math.PI*radius);
    }
}
class Square implements Shape{
int side1=5;
int side2=5;
int side3=5;
int side4=5;
    @Override
    public void calculateArea() {
        System.out.println("The area of the square is: "+side1*side2);
    }
int per=side1+side2+side3+side4;
    @Override
    public void calculatePerimiter() {
        System.out.println("The perimiter of the square is: "+per);
    }
}
class Tester{
    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.calculateArea();
        circle.calculatePerimiter();

        Square square=new Square();
        square.calculateArea();
        square.calculatePerimiter();

    }
}


