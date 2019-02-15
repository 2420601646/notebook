import javax.swing.*;
import java.awt.*;

public class JTextAreaDemo {
    public static void main(String[] args){
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();
        JTextArea jTextArea = new JTextArea("111",10,20);
        jTextArea.setLineWrap(true);
        jTextArea.setBackground(Color.pink);
        jTextArea.setFont(new Font("黑体",Font.BOLD,16));
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        Dimension dimension = jTextArea.getPreferredSize();
        jScrollPane.setBounds(100,200,dimension.width,dimension.height);
        jPanel.add(jScrollPane);
        jFrame.add(jPanel);
        jFrame.setSize(400,200);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
