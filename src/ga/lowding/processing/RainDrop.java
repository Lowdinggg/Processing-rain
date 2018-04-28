package ga.lowding.processing;

/**
 * Created by Lowdingg on 28/04/2018.
 *
 * @link http://lowding.ga/
 */
public class RainDrop {


    private float x,y,z;
    private float lenght;
    private float speed;

    private Sketch applet;

    RainDrop(Sketch applet) {
        this.applet = applet; // Reference to Sketch object, to access all processing functions

        this.x = applet.random(-applet.width, applet.width); // Random x position
        this.y = applet.random(-applet.height,-35); // Random y position
        this.z = applet.random(0, 20); // Random z position
        this.lenght = applet.map(z, 0, 20, 10,33); // Lenght depends on the z position, the further the smaller
        this.speed = applet.map(z, 0,20, 0.7f,2.3f); // Speed depends on the z position, the closer the faster

    }

    void render(){
        applet.stroke(217, 243, 252); // Change lines color
        applet.line(x, y , x, y + lenght); // Draw line on the x and y position and adding the lenght
        y += speed; // Move the line with speed
        if(y > applet.height){ // if the drop hit the bottom
            y = applet.random(-applet.height,-35); // Move it to the top
             if(applet.count < 50) applet.count += 0.015f; // Increment
        }

    }


}
