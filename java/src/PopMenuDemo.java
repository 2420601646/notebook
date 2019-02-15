import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PopMenuDemo {
    public static void main(String[] args){
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();
        JPopupMenu jPopupMenu = new JPopupMenu("file");
        JMenuItem jMenuItem = new JMenuItem("add");
        JMenuItem jMenuItem1 = new JMenuItem("del");
        jPopupMenu.add(jMenuItem);
        jPopupMenu.add(jMenuItem1);
        jFrame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jPopupMenu.show(e.getComponent(),20,30);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        jPanel.add(jPopupMenu);
        jFrame.add(jPanel);
        jFrame.setBounds(200,200,300,300);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
