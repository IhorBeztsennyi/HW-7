package ua.GoIT.HW;

import java.util.Scanner;

public class IsoscelesTriangle extends Shape {
    private int base;
    private int median;

    public IsoscelesTriangle(String name, int base, int median, boolean fill, String colour) {
        super(name, fill, colour);
        this.base = base;
        this.median = median;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getMedian() {
        return median;
    }

    public void setMedian(int median) {
        this.median = median;
    }

    @Override
    public void figuresNamePrint() {
        System.out.println("Isosceles triangle named [" + this.getName() + "]");
    }

    @Override
    public void add() {

    }

    @Override
    public void remove() {

    }

    public static Shape isoRectangleConstructor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter isosceles rectangle name:");
        String isoRectangleName = scanner.nextLine();
        System.out.println("Enter isosceles rectangle base:");
        int baseLength = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter isosceles rectangle median:");
        int median = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter isosceles rectangle is fill? (true or false):");
        boolean isFill = scanner.nextBoolean();
        scanner.nextLine();
        System.out.println("Enter isosceles rectangle colour:");
        String colour = scanner.nextLine();
        Shape isoRectangle = new IsoscelesTriangle(isoRectangleName, baseLength, median, isFill, colour);
        System.out.println("New isosceles rectangle was added.");
        return isoRectangle;
    }
}
