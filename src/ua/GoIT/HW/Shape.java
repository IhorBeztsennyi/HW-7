package ua.GoIT.HW;

public abstract class Shape {
    private String name;
    private boolean fill;
    private String colour;


    public Shape(String name, boolean fill, String colour) {
        this.name = name;
        this.fill = fill;
        this.colour = colour;

    }

    public abstract void add();

    public abstract void remove();

    public void figuresNamePrint() {
        System.out.println("Shape named [" + this.getName() + "]");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}

