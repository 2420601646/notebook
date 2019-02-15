import javax.swing.*;

public class JCheckBoxDemo {
    public static void main(String[] args){
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();
        JLabel jLabel = new JLabel("label");
        JCheckBox jCheckBox = new JCheckBox("java",true);
        JCheckBox jCheckBox1 = new JCheckBox("php");
        jPanel.add(jCheckBox);
        jPanel.add(jCheckBox1);
        jFrame.add(jPanel);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setBounds(100,200,200,200);
        jFrame.setVisible(true);
    }
}
