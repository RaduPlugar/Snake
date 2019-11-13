import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[]args){

        JFrame obj=new JFrame();
        GamePlay gamePlay=new GamePlay();

        obj.setBounds(10,10,905,700);
        obj.setBackground(Color.DARK_GRAY);
        obj.setVisible(true);
        obj.setResizable(false);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);

    }

}
