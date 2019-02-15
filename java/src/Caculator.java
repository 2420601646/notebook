import javax.swing.*;
import java.awt.*;

public class Caculator {
    public static void main(String[] args){
        JFrame jFrame = new JFrame();
        jFrame.setLayout(new BorderLayout());
        Container container = jFrame.getContentPane();
        JPanel jPanel = new JPanel();
        JTextField jTextField = new JTextField(10);
        jPanel.add(jTextField);
        container.add(jPanel,BorderLayout.NORTH);

        JPanel jPanel1 = new JPanel();
        jPanel1.setLayout(new GridLayout(2,2));
        JButton jButton1 = new JButton("1");
        JButton jButton2 = new JButton("2");
        JButton jButton3 = new JButton("3");
        JButton jButton4 = new JButton("4");
        jPanel1.add(jButton1);
        jPanel1.add(jButton2);
        jPanel1.add(jButton3);
        jPanel1.add(jButton4);
        container.add(jPanel1,BorderLayout.CENTER);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setBounds(200,200,200,200);
        jFrame.setVisible(true);
    }
}
