class Pen{
    String color;
    String type; // gel or ballpoint

    public void writes(){
        System.out.println("Writing something");
    }
    public void pencolor(){
        System.out.println(this.color);               //this - refer to current object means it tells about which object is calling this attribute or want to access this attribute.
    }
}

public class Basic {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.color="red";
        p1.type="gel";
        p1.writes();

        Pen p2=new Pen();
        p2.color="green";
        p1.pencolor();
        p2.pencolor();

    }
}
