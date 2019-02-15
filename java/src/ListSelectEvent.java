import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListSelectEvent {
    public static void main(String[] args){
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();
        String[] items = new String[]{"php","java"};
        JLabel jLabel = new JLabel();
        JList jList = new JList(items);
        jList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                jLabel.setText("choose "+jList.getSelectedValue());
            }
        });
        jPanel.add(jLabel);
        jPanel.add(jList);
        jFrame.add(jPanel);
        jFrame.setBounds(200,200,200,200);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
