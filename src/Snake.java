import javax.swing.*;

public class Snake extends JFrame {
    Snake()
    {
        add(new Board());
        pack();
        setLocationRelativeTo(null);
        setTitle("Snake");
        setResizable(false);
    }


}
