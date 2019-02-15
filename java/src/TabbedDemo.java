import javax.swing.*;
import java.awt.*;

public class TabbedDemo {
    public static void main(String[] args){
        JFrame jFrame = new JFrame();
        JTabbedPane jTabbedPane = new JTabbedPane();
        JPanel panel=new JPanel();
        JLabel filler=new JLabel("computer");
        filler.setHorizontalAlignment(JLabel.CENTER);
        panel.setLayout(new GridLayout(1,1));
        panel.add(filler);
        jTabbedPane.addTab("计算机",panel);
        JPanel panel1=new JPanel();
        JLabel filler1=new JLabel("computer2");
        filler1.setHorizontalAlignment(JLabel.CENTER);
        panel1.setLayout(new GridLayout(1,1));
        panel1.add(filler1);
        jTabbedPane.addTab("计算机2",panel1);
        jFrame.add(jTabbedPane);
        jFrame.setBounds(200,200,300,300);
        jFrame.setVisible(true);
    }
}
