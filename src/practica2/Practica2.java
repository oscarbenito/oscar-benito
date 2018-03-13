package practica2;

public class Practica2 {
    //constantes
    public final int SQUARE = 1;
    public final int CIRCLE = 2;
    public final int RIGHT_TRIANGLE = 3;

    
    //atributos
    
    private int shapeType;
    private double lado;
    
    public Practica2(int shapeType, double size) {
        this.shapeType = shapeType;
        this.lado = size;
    }

    //Getters y Setters
    
    
    public int getShapeType() {
        return shapeType;
    }

    public void setShapeType(int shapeType) {
        this.shapeType = shapeType;
    }

    public double getSize() {
        return lado;
    }

    public void setSize(double size) {
        this.lado = size;
    }

    
    //otros metodos
    
    public double area() {
        switch (shapeType) {
            case SQUARE: 
                return lado*lado;
            case CIRCLE: 
                return Math.PI*lado*lado/4.0;
            case RIGHT_TRIANGLE: 
                return lado*lado/2.0;
        }
    return 0;
    }
}
