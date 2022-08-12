public class Main {
    public static void main(String[] args) {


        Circle circle=new Circle("Blue",1.2);
        circle.show();
        circle.getArea();
        System.out.println();
        Cylindr cylindr=new Cylindr("red",1.4,1.0);
        cylindr.show();
        cylindr.getVolume();

    }
}