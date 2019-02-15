import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class SampDemo {
    public static void main(String[] args){
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();
        JComboBox jComboBox = new JComboBox() ;
        JButton add = new JButton("add");
        JButton del = new JButton("del");
        JTextField jTextField = new JTextField(5);
        JLabel jLabel = new JLabel();
        jComboBox.addItem("请选择");
        jComboBox.addItem("狮子座");
        jComboBox.addItem("处女座");

        jComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                jLabel.setText("choose "+jComboBox.getSelectedItem());
            }
        });
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = jTextField.getText();
                jComboBox.addItem(value);
                jLabel.setText("add "+value);
            }
        });
        del.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = jTextField.getText();
                jComboBox.removeItem(value);
                jLabel.setText("del "+value);
            }
        });
        jPanel.add(jComboBox);
        jPanel.add(jTextField);
        jPanel.add(add);
        jPanel.add(del);
        jPanel.add(jLabel);
        jFrame.add(jPanel);
        jFrame.setBounds(200,200,600,200);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

    }
}
