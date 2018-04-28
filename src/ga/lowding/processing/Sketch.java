package ga.lowding.processing;

import processing.core.PApplet;

/**
 * Created by Lowdingg on 28/04/2018.
 *
 * @link http://lowding.ga/
 */
public class Sketch extends PApplet {

    float count = 0;

    private RainDrop[] dropTop = new RainDrop[700];

    @Override
    public void settings() {
       fullScreen();
    }


    @Override
    public void setup() {
        for(int i = 0;i<dropTop.length;i++)
            dropTop[i] = new RainDrop(this); // Init all rain drops
    }

    @Override
    public void draw() {
        background(8, 17, 20); // Draw background each time
        for(RainDrop drop : dropTop) drop.render(); // Render each rain drop

        rectMode(CENTER); // Change rect mode to center so the rectangle is drawn from the center
        noStroke(); // No stroke
        fill(217, 243, 252); // Change color
        rect(width, height, width*2,count); // Draw the rectangle
    }
}
