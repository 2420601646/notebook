import javax.swing.*;

public class JComboBoxDemo {
    public static void main(String[] args){
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();
        JComboBox jComboBox = new JComboBox();
        jComboBox.addItem("1");
        jComboBox.addItem("2");
        jComboBox.addItem("3");
        jPanel.add(jComboBox);
        jFrame.add(jPanel);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setBounds(200,200,200,200);
        jFrame.setVisible(true);
    }
}
