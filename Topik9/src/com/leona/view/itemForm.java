package com.leona.view;
/**
 * @author Leona Rose (1972034)
 */

import com.leona.entity.Category;
import com.leona.entity.Item;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.AbstractTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class itemForm extends JFrame {
    private JTextField txtID;
    private JTextField txtName;
    private JTextField txtPrice;
    private JComboBox<Category> comboCategory;
    private JButton btnSave;
    private JButton btnReset;
    private JButton btnUpdate;
    private JSplitPane rootPanel;
    private JTable table1;
    private JPanel itemPanel;
    private Item selectedItem;
    private int selectedIdx;


    public itemForm() {
        setContentPane(rootPanel);

        List<Category> categories = new ArrayList<>();
        List<Item> items = new ArrayList<>();

        ItemTableModel itemTableModel= new ItemTableModel(items);
        table1.setModel(itemTableModel);
        table1.setAutoCreateRowSorter(true);

        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Item i = new Item();
                i.setId(Integer.parseInt(txtID.getText()));
                i.setName(txtName.getText());
                i.setPrice(Integer.parseInt(txtPrice.getText()));
                i.setCategory((Category) comboCategory.getSelectedItem());

                items.add(i);
                itemTableModel.fireTableDataChanged();
                reset();

            }
        });

        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedItem.setId(Integer.parseInt(txtID.getText()));
                selectedItem.setName(txtName.getText());
                selectedItem.setPrice(Integer.parseInt(txtPrice.getText()));
                selectedItem.setCategory((Category) comboCategory.getSelectedItem());

                items.set(selectedIdx, selectedItem);
                itemTableModel.fireTableDataChanged();
                reset();
            }
        });

        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reset();
            }
        });


        table1.getSelectionModel().addListSelectionListener(e -> {
            if(!table1.getSelectionModel().isSelectionEmpty()){
                selectedIdx = table1.convertRowIndexToModel(table1.getSelectedRow());
                selectedItem = items.get(selectedIdx);
                if(selectedItem != null){
                    txtID.setText(String.valueOf(selectedItem.getId()));
                    txtName.setText(selectedItem.getName());
                    txtPrice.setText(String.valueOf(selectedItem.getPrice()));
                    comboCategory.setSelectedItem(selectedItem.getCategory());
                    btnSave.setEnabled(false);
                    btnUpdate.setEnabled(true);
                }
            }
        });


        // JMenuBar, etc.
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menu = new JMenu("File");
        JMenu menu2 = new JMenu("Help");
        menuBar.add(menu);
        menuBar.add(menu2);

        JMenuItem about = new JMenuItem("About");
        menu2.add(about);
        JMenuItem addCat = new JMenuItem("Add Category");
        JMenuItem keluar = new JMenuItem("Exit");
        menu.add(addCat);
        menu.add(keluar);

        //set shortcut About (F1)
        KeyStroke aboutF1 = KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0); //Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()

        //key stroke below doesnt work
        KeyStroke ctrlF1 = KeyStroke.getKeyStroke(KeyEvent.VK_F1, KeyEvent.CTRL_DOWN_MASK);
        KeyStroke ctrlShiftQ = KeyStroke.getKeyStroke(KeyEvent.CTRL_DOWN_MASK, KeyEvent.SHIFT_DOWN_MASK+KeyEvent.SHIFT_DOWN_MASK);

        //set accelerator
        about.setAccelerator(aboutF1);
        addCat.setAccelerator(ctrlF1);
        keluar.setAccelerator(ctrlShiftQ);

        //add listener
        about.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(rootPanel, "Created By: Leona Rose (1972034)", "Creator", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        addCat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cat = JOptionPane.showInputDialog("New Category Name");
                Category c = new Category();
                c.setName(cat);
                categories.add(c);
                DefaultComboBoxModel<Category> categoryComboModel = new DefaultComboBoxModel<>(categories.toArray(new Category[0]));
                comboCategory.setModel(categoryComboModel);
            }
        });

        keluar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });


        menu2.add(about);
        menu.add(addCat);
        menu.add(keluar);
    }

    private void reset() {
        txtID.setText("");
        txtName.setText("");
        txtPrice.setText("");
        table1.clearSelection();
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
        selectedItem = null;
        selectedIdx = -1;
    }

    public static void main(String[] args) {
        itemForm frame = new itemForm();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

    }

    private static class ItemTableModel extends AbstractTableModel{
        private List<Item> items;
        private final String[] COLUMNS = {"ID", "NAME", "PRICE", "CATEGORY"};
        private Category category;

        public ItemTableModel(List<Item> items){
            this.items = items;
        }

        @Override
        public int getRowCount() {
            return items.size();
        }

        @Override
        public int getColumnCount() {
            return COLUMNS.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return switch (columnIndex){
                case 0 -> items.get(rowIndex).getId();
                case 1 -> items.get(rowIndex).getName();
                case 2 -> items.get(rowIndex).getPrice();
                case 3 -> items.get(rowIndex).getCategory();
                default -> "-";
            };
        }

        @Override
        public String getColumnName(int column) {
            return COLUMNS[column];
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            if(getValueAt(0, columnIndex) != null){
                return getValueAt(0, columnIndex).getClass();
            }
            else{
                return Object.class;
            }
        }
    }
}
