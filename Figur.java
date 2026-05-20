import java.awt.Graphics;

abstract class Figur {
    final int factor = (int) ((Math.random() * (16 - 7)) + 7);
    protected int offsetLeft;
    protected int maxHeightPanel;

    abstract int getHeight();
    abstract int getWidth();
    abstract void paintOnGraphics(Graphics g);

    public void paintOnGraphics(Graphics g, int offsetLeft, int maxHeightPanel) {
        this.offsetLeft = offsetLeft;
        this.maxHeightPanel = maxHeightPanel;
        paintOnGraphics(g);
    }
}