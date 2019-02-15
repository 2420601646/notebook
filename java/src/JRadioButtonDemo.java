import javax.swing.*;

public class JRadioButtonDemo {
    public static void main(String[] args){
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();
        JRadioButton jRadioButton = new JRadioButton("php");
        JRadioButton jRadioButton2 = new JRadioButton("c");
        JRadioButton jRadioButton1 = new JRadioButton("java",true);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButton);
        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);
        jPanel.add(jRadioButton);
        jPanel.add(jRadioButton1);
        jPanel.add(jRadioButton2);
        jFrame.add(jPanel);
        jFrame.setBounds(200,200,200,200);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
