import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Cat extends Figur{
    private final int mainBodyWidth = 10;
    private final int mainBodyHeight = 4;
    private final int legsWidth = 2;
    private final int legsHeight = 4;
    private final int headRadius = 4;
    private final int earsHeight = 2;
    private final int earsWidth = 2;
    private final int tailWidth = 1;
    private final int tailHeight = 4;

    int getHeight() {
        return (legsHeight+mainBodyHeight+tailHeight)*factor;
    }

    int getWidth() {
        return (int)(mainBodyWidth+headRadius*0.75)*factor;
    }

    void paintOnGraphics(Graphics g) {
        int offsetTop = maxHeightPanel - this.getHeight(); 
        Random rand = new Random();
        float r = rand.nextFloat();
        float gg = rand.nextFloat();
        float b = rand.nextFloat();
        Color randomColor = new Color(r, gg, b);
        g.setColor(randomColor);
        g.fillRect(offsetLeft, offsetTop, tailWidth*factor, tailHeight*factor);
        offsetTop += tailHeight*factor-headRadius*0.75*factor;
        g.fillRect((int) (offsetLeft+(mainBodyWidth-headRadius*0.25)*factor), offsetTop, headRadius*factor/2, headRadius*factor/2);
        g.fillOval((int) (offsetLeft+(mainBodyWidth-headRadius*0.25)*factor), offsetTop, headRadius*factor, headRadius*factor);
        offsetTop += tailHeight*factor-headRadius*0.25*factor;
        g.fillRect(offsetLeft, offsetTop, mainBodyWidth*factor, mainBodyHeight*factor);
        offsetTop += mainBodyHeight*factor;
        g.fillRect(offsetLeft+tailWidth*factor, offsetTop, legsWidth*factor, legsHeight*factor);
        g.fillRect(offsetLeft+mainBodyWidth*factor-legsWidth*factor, offsetTop, legsWidth*factor, legsHeight*factor);
    }   
}
