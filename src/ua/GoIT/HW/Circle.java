package ua.GoIT.HW;

import java.util.Scanner;

public class Circle extends Shape {
    private int radius;

    public Circle(String name, int radius, boolean fill, String colour) {
        super(name, fill, colour);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void figuresNamePrint() {
        System.out.println("Circle named [" + this.getName() + "]");
    }

    @Override
    public void add() {

    }

    @Override
    public void remove() {

    }

    public static Shape circleConstructor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter circle name:");
        String circleName = scanner.nextLine();
        System.out.println("Enter circle radius:");
        int radius = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter circle is fill? (true or false):");
        boolean isFill = scanner.nextBoolean();
        scanner.nextLine();
        System.out.println("Enter circle colour:");
        String colour = scanner.nextLine();
        Shape circle = new Circle(circleName, radius, isFill, colour);
        System.out.println("New circle was added.");
        return circle;
    }

}
