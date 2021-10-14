package ua.GoIT.HW;

public interface Repository {
    void add(Shape figure);

    void remove(Shape figure);

    void repositoryPrint();

    Shape findFigureByName(String name);
}
