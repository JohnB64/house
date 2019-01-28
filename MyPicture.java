
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
    
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(20);
            roof.makeVisible();
    
            sun.changeColor("black");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            drawn = true;
        }
    }
    
}

