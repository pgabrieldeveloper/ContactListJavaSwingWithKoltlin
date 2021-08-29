package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame {
    private JPanel rootPainel;
    private JButton buttonNovoContato;
    private JButton buttonRemoverContato;
    private JTable tabelaDeContatos;

    public MainForm() {
        setContentPane(rootPainel);
        setSize(500,250);
        setVisible(true);

        Dimension din = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(din.width/ 2 - getSize().width / 2,din.height/ 2 - getSize().height / 2);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setListeners();
    }

    private void setListeners() {
        buttonNovoContato.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ContactForm();
                dispose();
            }
        });

        buttonRemoverContato.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }
}
