import java.awt.Graphics;

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
        return (int)(mainBodyWidth+headRadius*0.75+tailWidth)*factor;
    }

    void paintOnGraphics(Graphics g) {
        
    }
}
