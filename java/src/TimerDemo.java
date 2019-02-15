import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimerDemo {
    public static void main(String[] args){
        JFrame jFrame = new JFrame();
        jFrame.setBounds(200,200,500,100);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(new BorderLayout());
        Container container = jFrame.getContentPane();
        JButton jButton = new JButton("install");
        JProgressBar jProgressBar = new JProgressBar();
        jProgressBar.setStringPainted(true);
        JPanel jPanel = new JPanel();
        Timer timer = new Timer(200, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jProgressBar.getValue() < 100){
                    jProgressBar.setValue(jProgressBar.getValue()+1);
                }else{
                    jButton.setText("over");
                    jButton.setEnabled(true);
                }
            }
        });
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("install")){
                    timer.start();
                    System.out.println("install...");
                }
                if (e.getActionCommand().equals("over")){
                    System.exit(0);
                }
            }
        });
        jPanel.add(jButton);
        container.add(jPanel, BorderLayout.NORTH);
        container.add(jProgressBar, BorderLayout.CENTER);
        jFrame.setVisible(true);
    }
}


