package ui;

import javax.swing.*;

public class mainForm extends JFrame {
    private JPanel rootPainel;
    private JButton buttonNovoContato;
    private JButton ButtonRemoverContato;
    private JTable TabelaDeContatos;

    public  mainForm() {
        setContentPane(rootPainel);
        setSize(500,250);
        setVisible(true);
    }
}
