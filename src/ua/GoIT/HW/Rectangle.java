package ua.GoIT.HW;

import java.util.Scanner;

public class Rectangle extends Shape {

    private int height;
    private int length;

    public Rectangle(String name, int height, int length, boolean fill, String colour) {
        super(name, fill, colour);
        this.height = height;
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void figuresNamePrint() {
        System.out.println("Rectangle named [" + this.getName() + "]");
    }

    @Override
    public void add() {

    }

    @Override
    public void remove() {

    }

    public static Shape rectangleConstructor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rectangle name:");
        String rectangleName = scanner.nextLine();
        System.out.println("Enter rectangle height:");
        int heightLength = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter rectangle length:");
        int length = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter rectangle is fill? (true or false):");
        boolean isFill = scanner.nextBoolean();
        scanner.nextLine();
        System.out.println("Enter rectangle colour:");
        String colour = scanner.nextLine();
        Shape rectangle = new Rectangle(rectangleName, heightLength, length, isFill, colour);
        System.out.println("New rectangle was added.");
        return rectangle;
    }
}
