import javax.swing.*;
import java.awt.*;

public class JTextFieldDemo {
    public static void main(String[] args){
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();
        JTextField jTextField = new JTextField();
        jTextField.setFont(new Font("楷体",Font.BOLD,22));
        jTextField.setText("1");
        jPanel.add(jTextField);
        JTextField jTextField1 = new JTextField();
        jTextField1.setHorizontalAlignment(JTextField.CENTER);
        jTextField1.setText("2");
        jPanel.add(jTextField);
        jPanel.add(jTextField1);
        jFrame.add(jPanel);
        jFrame.setBounds(200,200,300,300);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
