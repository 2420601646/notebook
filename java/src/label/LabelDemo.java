package label;

import javax.swing.*;
import java.awt.*;

public class LabelDemo {
    public static void main(String[] args){
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();
        JLabel jLabel = new JLabel("1");
        JLabel jLabel1 = new JLabel();
        jLabel1.setText("2");
        String path = "/Users/xiangchunlin/Documents/notebook/java/src/label";
        ImageIcon imageIcon = new ImageIcon(path+"/xx.jpg");
        JLabel jLabel2 = new JLabel("img",imageIcon,JLabel.RIGHT);
        jPanel.add(jLabel);
        jPanel.add(jLabel1);
        jPanel.add(jLabel2);
        jFrame.add(jPanel);
        jFrame.setBounds(200,200,300,300);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
