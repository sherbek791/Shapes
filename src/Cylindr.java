public class Cylindr  extends Circle{


    double height;

    public Cylindr(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }

    public void getVolume(){
        System.out.println("Volume: "+((p*(radius*radius)*2*height)/4));
    }
    public void show(){
        System.out.println("Color: "+color);
        System.out.println("Radius: "+radius);
        System.out.println("Height: "+height);
    }
}
