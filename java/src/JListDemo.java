import javax.swing.*;

public class JListDemo {
    public static void main(String[] args){
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();
        String items[] = new String[]{"1","2","3","4"};
        JList jList = new JList(items);
        jList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jPanel.add(jList);
        jFrame.add(jPanel);
        jFrame.setBounds(200,200,200,200);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
