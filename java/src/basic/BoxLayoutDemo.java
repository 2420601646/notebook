package basic;

import javax.swing.*;

public class BoxLayoutDemo {
    public static void main(String[] args){
        JFrame jFrame = new JFrame();
        Box box1 = Box.createHorizontalBox();
        Box box2 = Box.createVerticalBox();
        jFrame.add(box1);
        JButton jButton1 = new JButton("1");
        JButton jButton2 = new JButton("2");
        JButton jButton3 = new JButton("3");
        JButton jButton4 = new JButton("4");
        box1.add(jButton1);
        box1.add(jButton2);
        box1.add(Box.createHorizontalGlue());
        box1.add(box2);
        box2.add(jButton3);
        box2.add(jButton4);

        jFrame.setBounds(200,300,400,500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
