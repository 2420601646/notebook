package basic;

import javax.swing.*;
import java.awt.*;

public class Flow {
    public static void main(String[] args){
        JFrame jf = new JFrame();
        JPanel jp = new JPanel();
        jp.setLayout(new FlowLayout(FlowLayout.LEFT,20,30));
        JButton jb1 = new JButton("1");
        JButton jb2 = new JButton("2");
        JButton jb3 = new JButton("3");
        JButton jb4 = new JButton("4");
        jp.add(jb1);
        jp.add(jb2);
        jp.add(jb3);
        jp.add(jb4);
        jf.add(jp);
        jp.setBackground(Color.gray);
        jf.setBounds(100,200,300,400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
}
