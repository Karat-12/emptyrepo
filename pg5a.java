//hi
//i m k
class shapes{
    public void erase(){
        System.out.println("Erasing shapes...");
    }
    public void draw(){
        System.out.println("Drawing shapes...");
    }
}
class circle extends shapes{
    public void drawc(){
        System.out.println("Drawing a circle");
    }
    public void erasec(){
        System.out.println("Erasing a Circle");
    }
}
class square extends shapes{
    public void draw(){
        System.out.println("Drawing a square");
    }
    public void erase(){
        System.out.println("Erasing a square");
    }
}
class triangle extends shapes{
    public void draw(){
        System.out.println("Drawing a Triangle");
    }
    public void erase(){
        System.out.println("Erasing a Triangle");
    }
}
class pg5a{
    public static void main(String[] args) {
        circle c=new circle();
        square s=new square();
        triangle t=new triangle();
        System.out.println("Creating a triangle:");
        t.draw();
        t.erase();
        System.out.println("Creating a Square:");
        s.draw();
        s.erase();
        System.out.println("Creating a Circle:");
        c.drawc();
        c.erasec();
    }
}
