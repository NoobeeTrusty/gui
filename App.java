import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class App {
    final int spaceBetweenFigurs = (int)((Math.random() * (15 - 5)) + 5);
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2 = new Cat();
        Cat c3 = new Cat();
        Cat c4 = new Cat();
        Cat c5 = new Cat();

        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        Person p5 = new Person();

        ArrayList<Figur> figuren = new ArrayList<Figur>();
        figuren.add(c1);
        figuren.add(c2);
        figuren.add(c3);
        figuren.add(c4);
        figuren.add(c5);
        figuren.add(p1);
        figuren.add(p2);
        figuren.add(p3);
        figuren.add(p4);
        figuren.add(p5);
        
        int pivot = 1;
        for(int j = 1; j <= figuren.size()-1;) {
            if(figuren.get(j).getHeight() < figuren.get(j-1).getHeight()) {
                Figur x = figuren.get(j-1);
                figuren.set(j-1, figuren.get(j));
                figuren.set(j, x);
                if(j > 1) {
                    j--;
                }
            } else {
                j = pivot;
                pivot++;
            }
        }
        
        final int spaceBetweenFigurs = (int)((Math.random() * (15 - 5)) + 5);
        final int totalWidthPanel = spaceBetweenFigurs + c1.getWidth() + spaceBetweenFigurs + c2.getWidth() + spaceBetweenFigurs+ c3.getWidth() + spaceBetweenFigurs+ c4.getWidth() + spaceBetweenFigurs+ c5.getWidth() + spaceBetweenFigurs+ p1.getWidth() + spaceBetweenFigurs+ p2.getWidth() + spaceBetweenFigurs+ p3.getWidth() + spaceBetweenFigurs+ p4.getWidth() + spaceBetweenFigurs+ p5.getWidth() + spaceBetweenFigurs;
        final int maxHeightPanel = figuren.getLast().getHeight();
        JFrame frame;
        JPanel panel;
        frame = new JFrame("GUI");
        frame.setSize(totalWidthPanel, maxHeightPanel);
        panel = new JPanel() {

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int offsetLeft = spaceBetweenFigurs;
                for(Figur f : figuren) {
                    f.paintOnGraphics(g, offsetLeft, maxHeightPanel);
                    offsetLeft += f.getWidth() + spaceBetweenFigurs;
                }
            }
        };

        panel.setBackground(new Color(0, 0, 0));
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
