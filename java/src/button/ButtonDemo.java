package button;

import javax.swing.*;
import java.awt.*;

public class ButtonDemo {
    public static void main(String[] args){
        JFrame jFrame = new JFrame();
        jFrame.setBounds(200,200,300,300);
        JPanel jPanel = new JPanel();
        JButton jButton1 = new JButton("1");
        JButton jButton2 = new JButton("2");
        JButton jButton3 = new JButton("3");
        JButton jButton4 = new JButton("4");
        jButton1.setBackground(Color.BLUE);
        jPanel.add(jButton1);
        jButton2.setEnabled(false);
        jPanel.add(jButton2);
        Dimension dimension = new Dimension(20,30);
        jButton3.setPreferredSize(dimension);
        jButton3.setVerticalAlignment(JButton.BOTTOM);
        jPanel.add(jButton3);
        jPanel.add(jButton4);
        jFrame.add(jPanel);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
