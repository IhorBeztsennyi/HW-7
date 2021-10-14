package ua.GoIT.HW;

import java.util.Scanner;

public class Arc extends Shape {

    private int lengthBetweenPoints;
    private int radius;

    public Arc(String name, int lengthBetweenPoints, int radius, String colour) {
        super(name, false, colour);
        this.lengthBetweenPoints = lengthBetweenPoints;
        this.radius = radius;
    }

    public int getLengthBetweenPoints() {
        return lengthBetweenPoints;
    }

    public void setLengthBetweenPoints(int lengthBetweenPoints) {
        this.lengthBetweenPoints = lengthBetweenPoints;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void figuresNamePrint() {
        System.out.println("Arc named [" + this.getName() + "]");
    }

    @Override
    public void add() {

    }

    @Override
    public void remove() {

    }

    public static Shape arcConstructor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter arc name:");
        String arcName = scanner.nextLine();
        System.out.println("Enter arc length between points:");
        int lengthBetweenPoints = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter arc radius:");
        int radius = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter arc colour:");
        String colour = scanner.nextLine();
        Shape arc = new Arc(arcName, lengthBetweenPoints, radius, colour);
        System.out.println("New arc was added.");
        return arc;
    }
}
