
/** draws a picture of a house
 * house made with shapes.
 * 
 * @author (Kush Kalra) 
 * @version (October 13,2014)
 */
public class house
{
    
    public house()
    {
        Circle sun = new Circle();
        sun.makeVisible();
        sun.moveHorizontal(+200);
        sun.moveVertical(-40);
        sun.changeColor("yellow");
        sun.changeSize(60);
        
        Square house= new Square();
        house.makeVisible();
        house.moveHorizontal(+40);
        house.moveVertical(100);
        house.changeSize(100);
        
        Triangle roof= new Triangle();
        roof.makeVisible();
        roof.moveHorizontal(+100);
        roof.moveVertical(65);
        roof.changeSize(70,100);
        roof.changeColor("purple");
        
        Square windowa= new Square();
        windowa.makeVisible();
        windowa.moveHorizontal(+50);
        windowa.moveVertical(120);
        windowa.changeSize(30);
        windowa.changeColor("blue");
        
        Square windowb= new Square();
        windowb.makeVisible();
        windowb.moveHorizontal(+100);
        windowb.moveVertical(120);
        windowb.changeSize(30);
        windowb.changeColor("blue");
    
        Square door=new Square();
        door.makeVisible();
        door.changeColor("magenta");
        door.moveHorizontal(+71);
        door.moveVertical(170);
        door.changeSize(40);
        
        Square grass= new Square();
        grass.makeVisible();
        grass.moveVertical(200);
        grass.changeColor("green");
        grass.moveHorizontal(-70);
        grass.changeSize(310);
        
        Circle doorhandle= new Circle();
        doorhandle.makeVisible();
        doorhandle.changeColor("blue");
        doorhandle.moveHorizontal(+140);
        doorhandle.moveVertical(170);
        doorhandle.changeSize(10);
        
        
        
        
        
        

        

    }
}
    