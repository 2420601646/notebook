import javax.swing.*;
import java.awt.*;

public class ChooseColorDemo {
    public static void main(String[] args){
        JFrame frame=new JFrame("颜色选择器");
        JColorChooser cc=new JColorChooser();
        cc.showDialog(frame,"颜色选择器", Color.white);
        //JColorChooser.showDialog(frame,"颜色选择器",Color.white);
        //设置窗口的关闭动作、标题、大小位置以及可见性等
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,400,200);
        frame.setVisible(true);
    }
}
