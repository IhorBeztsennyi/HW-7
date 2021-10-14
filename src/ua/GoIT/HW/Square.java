package ua.GoIT.HW;

import java.util.Scanner;

public class Square extends Shape {

    private int sideLength;

    public Square(String name, int sideLength, boolean fill, String colour) {
        super(name, fill, colour);
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public void figuresNamePrint() {
        System.out.println("Square named [" + this.getName() + "]");
    }

    @Override
    public void add() {

    }

    @Override
    public void remove() {

    }

    public static Shape squareConstructor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter square name:");
        String squareName = scanner.nextLine();
        System.out.println("Enter square side length:");
        int sideLength = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter square is fill? (true or false):");
        boolean isFill = scanner.nextBoolean();
        scanner.nextLine();
        System.out.println("Enter square colour:");
        String colour = scanner.nextLine();
        Shape square = new Circle(squareName, sideLength, isFill, colour);
        System.out.println("New square was added.");
        return square;
    }
}
