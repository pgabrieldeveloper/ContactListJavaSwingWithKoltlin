package ui;

import javax.swing.*;

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
    }


}
