import javax.swing.*;
import java.awt.*;

public class SliderDemo {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,200,400,400);
        JSlider jSlider = new JSlider(0,100);
        jSlider.setMajorTickSpacing(10);
        jSlider.setMinorTickSpacing(5);
        jSlider.setPaintLabels(true);
        jSlider.setPaintTicks(true);
        Container container = frame.getContentPane();
        container.add(jSlider);
        frame.setVisible(true);

    }
}
