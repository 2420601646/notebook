package basic;

import javax.swing.*;
import java.awt.*;

public class Hello extends JFrame {

    private Hello(){
        setTitle("this is title");
        setSize(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("this is content");
        Container container = getContentPane();
        container.add(label);
        setVisible(true);
    }

    public static void main(String[] args){
       JFrame jf = new JFrame("this is title2");
       JPanel jl = new JPanel();
       jf.setBounds(300,100,400,200);
       JLabel jLabel = new JLabel("this is Jlabel");
       jl.add(jLabel);
       jf.add(jl);
       jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       jf.setVisible(true);
    }
}