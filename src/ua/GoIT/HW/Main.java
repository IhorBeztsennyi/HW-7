package ua.GoIT.HW;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FigureRepository figures = new FigureRepository();
        Shape smallCircle = new Circle("Small circle", 20, true, "black");
        Shape blackSquare = new Square("Black square", 15, true, "black");
        Shape rectangle = new Rectangle("Yellow rectangle", 30, 40, false, "yellow");
        Shape triangle = new IsoscelesTriangle("Tall triangle", 10, 40, false, "red");
        Shape line = new Line("Long line", 50, "black");
        Shape arc = new Arc("Semicircle", 30, 60, "black");
        figures.add(smallCircle);
        figures.add(blackSquare);
        figures.add(rectangle);
        figures.add(triangle);
        figures.add(line);
        figures.add(arc);
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        startGraphicEditor();
        printActions();
        while (!quit) {
            System.out.println("\nEnter action: ");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Shutting down...");
                    quit = true;
                    break;
                case 1:
                    figures.repositoryPrint();
                    break;
                case 2:
                    System.out.println("\nYou can add new:");
                    System.out.println(
                            "0 - circle\n" +
                                    "1 - square\n" +
                                    "2 - rectangle\n" +
                                    "3 - isosceles rectangle\n" +
                                    "4 - line\n" +
                                    "5 - arc");
                    int addAction = scanner.nextInt();
                    scanner.nextLine();
                    switch (addAction) {
                        case 0:
                            figures.add(Circle.circleConstructor());
                            break;
                        case 1:
                            figures.add(Square.squareConstructor());
                            break;
                        case 2:
                            figures.add(Rectangle.rectangleConstructor());
                            break;
                        case 3:
                            figures.add(IsoscelesTriangle.isoRectangleConstructor());
                            break;
                        case 4:
                            figures.add(Line.lineConstructor());
                            break;
                        case 5:
                            figures.add(Arc.arcConstructor());
                            break;
                        default:
                            System.out.println("Wrong number");
                    }
                    break;
                case 3:
                    System.out.println("Enter name of figure you want to remove:");
                    String nameRemove = scanner.nextLine();
                    figures.remove(figures.findFigureByName(nameRemove));
                    break;
                case 4:
                    printActions();
                    break;
            }
        }
    }

    private static void startGraphicEditor() {
        System.out.println("Graphic editor is started.");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shutdown the graphic editor\n" +
                "1 - to print figure's names\n" +
                "2 - to add a new figure\n" +
                "3 - to remove figure by name\n" +
                "4 - to print a list of available actions");

    }
}
