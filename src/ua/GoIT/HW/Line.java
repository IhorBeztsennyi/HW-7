package ua.GoIT.HW;

import java.util.Scanner;

public class Line extends Shape {

    private int length;

    public Line(String name, int length, String colour) {
        super(name, false, colour);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void figuresNamePrint() {
        System.out.println("Line named [" + this.getName() + "]");
    }

    @Override
    public void add() {

    }

    @Override
    public void remove() {

    }

    public static Shape lineConstructor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter line name:");
        String lineName = scanner.nextLine();
        System.out.println("Enter line length:");
        int length = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter line colour:");
        String colour = scanner.nextLine();
        Shape line = new Line(lineName, length, colour);
        System.out.println("New line was added.");
        return line;
    }

}
