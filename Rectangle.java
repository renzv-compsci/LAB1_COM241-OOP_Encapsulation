/*Write a Java program to create a class called Rectangle with private
 * instance variables length and width. Provide public getter and setter
 * methods to access and modify these variables
 */

public class Rectangle {
    // creating private instance
    private double length;
    private double width;

    // setter methods
    public void setLength(double length){
        this.length = length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    // getter methods
    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public static void main(String[] args) {
        
        Rectangle rectMeasurements = new Rectangle();

        rectMeasurements.setLength(12.5);
        rectMeasurements.setWidth(8);

        System.out.println("Rectangle Measurements: ");
        System.out.println("Length: " + rectMeasurements.getLength());
        System.out.println("Width: " + rectMeasurements.getWidth());
    }
}