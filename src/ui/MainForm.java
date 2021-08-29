package ui;

import Entity.ContactEntity;
import business.ContactBusiness;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class MainForm extends JFrame {
    private JPanel rootPainel;
    private JButton buttonNovoContato;
    private JButton buttonRemoverContato;
    private JTable tabelaDeContatos;
    private JLabel contactSize;
    private ContactBusiness mContactBusiness = new ContactBusiness();

    public MainForm() {
        setContentPane(rootPainel);
        setSize(500,250);
        setVisible(true);

        Dimension din = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(din.width/ 2 - getSize().width / 2,din.height/ 2 - getSize().height / 2);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setListeners();
        loadContacts();
    }

    private void loadContacts() {
        List<ContactEntity> contactList = mContactBusiness.getList();
        String[]  columnNames = {"Nome", "Telefone"};
        DefaultTableModel model = new DefaultTableModel(new Object[0][0], columnNames);
        for(ContactEntity c : contactList){
            Object[] o = new Object[2];
            o[0] = c.getNome();
            o[2] = c.getTelefone();
            model.addRow(o);

        }
        contactSize.setText(mContactBusiness.countContatsSize());
        tabelaDeContatos.clearSelection();
        tabelaDeContatos.setModel(model);
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
