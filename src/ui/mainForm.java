package ui;

import javax.swing.*;
import java.awt.*;

public class mainForm extends JFrame {
    private JPanel rootPainel;
    private JButton buttonNovoContato;
    private JButton ButtonRemoverContato;
    private JTable TabelaDeContatos;

    public  mainForm() {
        setContentPane(rootPainel);
        setSize(500,250);
        setVisible(true);

        Dimension din = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(din.width/ 2 - getSize().width / 2,din.height/ 2 - getSize().height / 2);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
