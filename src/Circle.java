public class Circle {

    String color;
    double radius;
    int res=0;
    double p=3.14;
    public Circle(String color,double radius){
        this.radius=radius;
        this.color=color;
    }

    public void getArea(){
        System.out.println("Area: "+(p*(radius*radius)));
    }
    public void show(){
        System.out.println("Color: "+color);
        System.out.println("Radius: "+radius);
    }




}
