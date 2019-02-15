import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JProgressBarDemo {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setBounds(200,200,500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jLabel = new JLabel("欢迎使用在线升级功能");
        JButton jButton = new JButton("完成");
        jButton.setEnabled(false);
        JProgressBar jProgressBar = new JProgressBar();
        jProgressBar.setStringPainted(true);
        Container container = frame.getContentPane();
        container.setLayout(new GridLayout(3,1));
        JPanel left = new JPanel();
        left.setLayout(new FlowLayout(FlowLayout.LEFT));
        JPanel center = new JPanel();
        center.setLayout(new FlowLayout(FlowLayout.CENTER));
        JPanel right = new JPanel();
        right.setLayout(new FlowLayout(FlowLayout.RIGHT));
        new process(jProgressBar,jButton).start();
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        left.add(jLabel);
        container.add(left);
        center.add(jProgressBar);
        container.add(center);
        right.add(jButton);
        container.add(right);
        frame.setVisible(true);
    }
}

class process extends Thread{
    JProgressBar jProgressBar;
    JButton jButton;

    public process(JProgressBar jProgressBar,JButton jButton){
        this.jProgressBar = jProgressBar;
        this.jButton = jButton;
    }

    @Override
    public void run() {
        int[] processValue = new int[]{10,40,60,80,90,100};
        for (int i= 0;i<processValue.length;i++){
            try{
                Thread.sleep(3000);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            this.jProgressBar.setValue(processValue[i]);
        }
        this.jButton.setEnabled(true);
        this.jButton.setText("over");
    }
}



