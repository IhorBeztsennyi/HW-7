package ua.GoIT.HW;

import java.util.Arrays;

public class FigureRepository implements Repository {
    private Shape[] figures;
    private final static int INITIAL_SIZE = 16;
    private final static double INCREASE_FACTOR = 2.5;
    private int count = 0;

    public FigureRepository() {
        this.figures = new Shape[INITIAL_SIZE];
    }

    @Override
    public void add(Shape figure) {
        if (figures.length <= count) {
            figures = Arrays.copyOf(figures, (int) (figures.length * INCREASE_FACTOR));
        }
        figures[count] = figure;
        count++;
    }

    @Override
    public void remove(Shape figure) {
        for (int i = 0; i < figures.length; i++) {
            if (figures[i].equals(figure)) {
                System.out.println("Figure [" + figures[i].getName() + "] was successfully removed.");
                figures[i] = null;
            }
        }
    }


    @Override
    public void repositoryPrint() {
        Shape[] shapes = figures;
        for (Shape shape : shapes) {
            if (shape != null) {
                shape.figuresNamePrint();
            }
        }
    }

    @Override
    public Shape findFigureByName(String name) {
        Shape[] shapes = figures;
        Shape foundFigure = null;
        for (Shape shape : shapes) {
            if (shape != null) {
                if (shape.getName().equals(name)) {
                    foundFigure = shape;
                }
            }
        }
        return foundFigure;
    }
}


