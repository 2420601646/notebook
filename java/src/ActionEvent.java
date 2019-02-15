import javax.swing.*;
import java.awt.event.ActionListener;

public class ActionEvent {
    static private int click = 0;

    public static void main(String[] args){
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();
        JButton jButton = new JButton("click");
        JLabel jLabel = new JLabel();
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                jLabel.setText("**click"+(click++)+"**");
            }
        });
        jPanel.add(jButton);
        jPanel.add(jLabel);
        jFrame.add(jPanel);
        jFrame.setBounds(200,200,200,200);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
