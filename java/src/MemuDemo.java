import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class MemuDemo {
    public static void main(String[] args){
        JFrame jFrame = new JFrame();
        jFrame.setJMenuBar(new MenuBarDemo());
        jFrame.setBounds(200,200,500,500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}

class MenuBarDemo extends JMenuBar {
    public MenuBarDemo(){
        add(this.addMenu());
        add(this.addMenu1());
        setVisible(true);
    }

    public JMenu addMenu(){
        JMenu jMenu = new JMenu();
        jMenu.setText("file(F)");
        jMenu.setMnemonic(KeyEvent.VK_F);
        JMenuItem jMenuItem = new JMenuItem("add(C)", KeyEvent.VK_C);
        jMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        jMenu.add(jMenuItem);
        jMenu.addSeparator();
        return jMenu;
    }

    public JMenu addMenu1(){
        JMenu jMenu = new JMenu();
        jMenu.setText("img(I)");
        jMenu.setMnemonic(KeyEvent.VK_I);
        JMenuItem jMenuItem = new JMenuItem("add(V)",KeyEvent.VK_I);
        jMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.CTRL_MASK));
        jMenu.add(jMenuItem);
        return jMenu;
    }
}
