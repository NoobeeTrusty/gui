import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;


public class Person extends Figur{
    private final int mainBodyWidth = 10;
    private final int mainBodyHeight = 10;
    private final int legsWidth = 4;
    private final int legsHeight = 10;
    private final int headRadius = 6;
    private final int neckWidth = 4;
    private final int neckHeight = 4;
    private final int armsHeight = 8;
    private final int armsWidth = 3;

    int getHeight() {
        return (int)(legsHeight+mainBodyHeight+headRadius*0.75+neckHeight)*factor;
    }

    int getWidth() {
        return (armsWidth*2+mainBodyWidth)*factor;
    }

    public void paintOnGraphics(Graphics g) {
        int offsetTop = maxHeightPanel - this.getHeight();
        Random rand = new Random();
        float r = rand.nextFloat();
        float gg = rand.nextFloat();
        float b = rand.nextFloat();
        Color randomColor = new Color(r, gg, b);
        g.setColor(randomColor);
        g.fillOval(offsetLeft+(mainBodyWidth*factor-headRadius*factor)/2, offsetTop, headRadius*factor, headRadius*factor);
        offsetTop += headRadius*factor;
        g.fillRect(offsetLeft+(mainBodyWidth*factor-headRadius*factor)/2+factor, offsetTop-factor, neckWidth*factor, neckHeight*factor);
        offsetTop += neckHeight*factor-factor;
        g.fillRect(offsetLeft-armsWidth*factor, offsetTop, armsWidth*factor, armsHeight*factor);
        g.fillRect(offsetLeft+mainBodyWidth*factor, offsetTop, armsWidth*factor, armsHeight*factor);
        g.fillRect(offsetLeft, offsetTop, mainBodyWidth*factor, mainBodyHeight*factor);
        offsetTop += mainBodyHeight*factor;
        g.fillRect(offsetLeft, offsetTop, legsWidth*factor, legsHeight*factor);
        g.fillRect(offsetLeft+(mainBodyWidth*factor-legsWidth*factor), offsetTop, legsWidth*factor, legsHeight*factor);
    }
    
}
