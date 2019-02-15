import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusListener;

public class FocusEvent {
    public static void main(String[] args){
        JFrame jFrame = new JFrame();
        jFrame.setLayout(new BorderLayout());
        Container container = jFrame.getContentPane();
        JPanel jPanel = new JPanel();
        JTextField jTextField = new JTextField(12);
        jTextField.setText("..");
        jPanel.add(jTextField);
        container.add(jPanel,BorderLayout.NORTH);
        JLabel jLabel = new JLabel();
        jTextField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                jLabel.setText("get focus.....");
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                jLabel.setText("lost focus.....");
            }
        });
        JTextField jTextField1 = new JTextField();
        container.add(jTextField1,BorderLayout.SOUTH);
        container.add(jLabel, BorderLayout.CENTER);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setBounds(200,200,200,200);
        jFrame.setVisible(true);
    }
}