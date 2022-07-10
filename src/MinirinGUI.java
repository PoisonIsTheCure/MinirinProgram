import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinirinGUI extends JFrame{

    private JPanel form1;
    private JButton exitButton;
    private JButton dose120B;
    private JButton dose60B;
    private JButton old120B;
    private JButton old60B;
    private JFormattedTextField dt120B;
    private JFormattedTextField dt60B;

    public MinirinGUI(){
        setContentPane(form1);
        setTitle("Minirin Program");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        // Exit button action :
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


    }
}
