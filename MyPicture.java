
/**
 * Write a description of class MyPicture here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyPicture
{
    private Square wall;
    private Square window;
    private Square ground;
    private Square groundtwo;
    private Triangle roof;
    private Circle sun;
    private boolean drawn;

    /**
     * Constructor for objects of class MyPicture
     */
    public MyPicture()
    {
        wall = new Square();
        window = new Square();
        ground = new Square();
        groundtwo = new Square();
        roof = new Triangle();  
        sun = new Circle();
        drawn = false;
    }
public void draw()
    {
        if(!drawn) {
            wall.moveHorizontal(-400);
            wall.moveVertical(100);
            wall.changeSize(200);
            wall.changeColor("green");
            wall.makeVisible();
            
            ground.moveHorizontal(-50);
            ground.moveVertical(100);
            ground.changeSize(200);
            ground.changeColor("green");
            ground.makeVisible();
            
            window.changeColor("green");
            window.moveHorizontal(-200);
            window.moveVertical(100);
            window.changeSize(200);
            window.makeVisible();
            
            groundtwo.moveHorizontal(20);
            groundtwo.moveVertical(100);
            groundtwo.changeSize(200);
            groundtwo.changeColor("green");
            groundtwo.makeVisible();
    
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(20);
            roof.makeVisible();
            roof.changeColor("red");
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            drawn = true;
        }
    }
    
    public void setColor()
    {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
    }
    
}

