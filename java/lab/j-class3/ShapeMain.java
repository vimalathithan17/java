
/*
 *Create a base class called `Shape` with an abstract method `calculateArea()`. Define
subclasses like `Circle`, `Rectangle`, and `Triangle`, which inherit from the `Shape` class.
Implement the `calculateArea()` method in each subclass to calculate the area of the respective
shape. Demonstrate polymorphism by creating an array of `Shape` objects, including instances of
each subclass, and calculate and display their areas
 */
import java.util.*;

public class ShapeMain {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        B bb=new B();
        A a=bb;
        System.out.printf("%d %d %d",a.ind,bb.ind,bb.bi);
        a.ameth();
       // a.bmeth();
        bb.ameth();
        bb.bmeth();
        System.out.println(a);
        System.out.println(bb);
        List<Shape> shapes = new ArrayList<Shape>();
        while (true) {
            System.out.println("Enter");
            System.out.println("1 to display all shapes");
            System.out.println("2 to add a shape");
            System.out.println("3 to calculate area of a shape");
            System.out.println("4 to exit");
            int choice;
            boolean exit=false;
            while (true) {
                System.out.print("enter your choice:");
                choice = scanner.nextInt();

                if (choice > 0 && choice < 5) {
                    break;
                }
                System.out.println("!! Enter a valid choice !!");
            }
            switch (choice) {
                case 1:
                    if (shapes.isEmpty()) {
                        System.out.println("!! there are no shapes added yet !!");
                    } else {
                        int i = 0;
                        for (Shape s : shapes) {
                            System.out.println("at index " + i + " " + s);
                            i++;
                        }
                    }
                    break;
                case 2:
                    while (true) {
                        System.out.println("ADD SHAPES");
                        System.out.println("Enter");
                        System.out.println("1 to add a rectangle");
                        System.out.println("2 to add a triange");
                        System.out.println("3 to add a circle");
                        System.out.println("4 to stop adding shapes");
                        while (true) {
                            System.out.print("enter your choice:");
                            choice = scanner.nextInt();

                            if (choice > 0 && choice < 5) {
                                break;
                            }
                            System.out.println("!! Enter a valid choice !!");
                        }
                        boolean exitadd=false;
                        switch (choice) {
                            case 1:
                                System.out.println("!! creating a rectangle !!");
                                float b, l;
                                System.out.print("enter the breadth:");
                                b = scanner.nextFloat();
                                System.out.print("enter the length:");
                                l = scanner.nextFloat();
                                shapes.add(new Rectangle(b, l));
                                break;
                            case 2:
                                System.out.println("!! creating a triangle !!");
                                float base, height;
                                System.out.print("enter the base length:");
                                base = scanner.nextFloat();
                                System.out.print("enter the height:");
                                height = scanner.nextFloat();
                                shapes.add(new Triangle(base, height));

                                break;
                            case 3:
                                System.out.println("!! creating a circle !!");
                                float radius;
                                System.out.print("enter the radius:");
                                radius = scanner.nextFloat();
                                shapes.add(new Circle(radius));
                                break;
                            case 4:
                                exitadd = true;
                        }
                        if (exitadd) {
                            break;
                        }
                    }
                    break;
                case 3:
                    if (shapes.isEmpty()) {
                        System.out.println("!! there are no shapes added yet !!");
                    } else {
                        int index;
                        while (true) {
                            System.out.print("Enter the index of the shape whose area is to be found:");
                            index = scanner.nextInt();
                            if (index < shapes.size()) {
                                break;
                            }
                            System.out.printf("!! enter a valid index (less than %d) .Try again!!\n", shapes.size());
                        }
                        Shape s = shapes.get(index);
                        System.out.println(s);
                        s.calculateArea();
                    }
                    break;
                case 4:
                    exit = true;
            }
            if (exit) {
                break;
            }
        }
    }

}

abstract class Shape {
    abstract void calculateArea();
}

class Circle extends Shape {
    static final float PI = 3.14f;
    float radius;

    Circle(float radius) {
        this.radius = radius;
    }

    void calculateArea() {
        System.out.println("the area of the circle is " + (2 * PI * radius) + " sq units");
    }

    public String toString() {
        return "circle of radius " + radius + " units";
    }
}

class Rectangle extends Shape {

    float b, l;

    Rectangle(float b, float l) {
        this.b = b;
        this.l = l;
    }

    void calculateArea() {
        System.out.println("the area of the rectangle is " + (l * b) + " sq units");
    }

    public String toString() {
        return "rectange of length " + l + " and breadth " + b + " units";
    }
}

class Triangle extends Shape {

    float base, height;

    Triangle(float base, float height) {
        this.base = base;
        this.height = height;
    }

    void calculateArea() {
        System.out.println("the area of the triangle is " + (height * base / 2) + " sq units");
    }

    public String toString() {
        return "triangle od base length " + base + " and height " + height + " units";
    }
}
class A{
    int ind=1;
    void ameth(){
        return;
    }
}
class B extends A{
    int ind=7;
    int bi=4;
    void bmeth()
    {
        
    }
    public String toString(){
        return "aa";
    }
}