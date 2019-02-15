package basic;

import javax.swing.*;
import java.awt.*;

public class CardLayout {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        JPanel cards = new JPanel();
        cards.setLayout(new java.awt.CardLayout());
        jp1.add(new JButton("1"));
        jp1.add(new JButton("2"));
        jp2.add(new JTextField("name", 20));
        jp2.add(new JTextField("pass", 20));
        cards.add(jp1, "card1");
        cards.add(jp2, "card2");
        java.awt.CardLayout cardLayout = (java.awt.CardLayout) cards.getLayout();
        cardLayout.show(cards,"card2");
        jf.add(cards);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(100,200,300,500);
        jf.setVisible(true);
    }
}
