package basic;

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo {
    public static void main(String[] args){
        JFrame jf = new JFrame();
        JPanel jl = new JPanel(new GridLayout(2,2,5,5));
        jl.add(new JButton("1"));
        jl.add(new JButton("2"));
        jl.add(new JButton("+"));
        jl.add(new JButton("-"));
        jf.add(jl);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(100,200,300,500);
        jf.setVisible(true);
    }
}
