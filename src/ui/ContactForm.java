package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactForm extends JFrame {
    private JPanel rootPainel;
    private JPanel panel1;
    private JTextField textNome;
    private JTextField textTelefone;
    private JButton buttonSalvar;
    private JButton buttonCancelar;

    public  ContactForm() {
        setContentPane(rootPainel);
        setSize(500,250);
        setVisible(true);

        Dimension din = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(din.width/ 2 - getSize().width / 2,din.height/ 2 - getSize().height / 2);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setListeners();
    }

    private void setListeners(){
        buttonCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainForm();
                dispose();
            }
        });

        buttonSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

}
