package basic;

import javax.swing.*;
import java.awt.*;

public class Border {
    public static void main(String[] args){
        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.setBounds(300,200,600,300);
        jFrame.setLayout(new BorderLayout());
        JButton jButton1 = new JButton("jButton1");
        JButton jButton2 = new JButton("jButton2");
        JButton jButton3 = new JButton("jButton3");
        JButton jButton4 = new JButton("jButton4");
        JButton jButton5 = new JButton("jButton5");
        //jFrame.add(jButton1,BorderLayout.NORTH);
        jFrame.add(jButton2,BorderLayout.WEST);
        jFrame.add(jButton3,BorderLayout.CENTER);
        jFrame.add(jButton4,BorderLayout.EAST);
        jFrame.add(jButton5,BorderLayout.SOUTH);
    }
}
