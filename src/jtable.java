import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
public class jtable {
    public static void main(String[] args) {
        JFrame frame1 = new JFrame("input");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(500,500);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(4,2));
        JLabel label1 = new JLabel("Name");
        JTextField textField1 = new JTextField(10);
        JLabel label2 = new JLabel("Age");
        JTextField textField2 = new JTextField(10);
        JLabel label3 = new JLabel("Gender");
        JTextField textField3 = new JTextField(10);
        JButton btnSubmit = new JButton("Submit");

        JPanel panel2 = new JPanel();
        DefaultTableModel model = new DefaultTableModel(null, new String[]{"Name","Age","Gender"});
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        panel2.add(scrollPane);

        btnSubmit.addActionListener(e->{
            String name = textField1.getText();
            String age = textField2.getText();
            String gender = textField3.getText();

            if (name.isEmpty() || age.isEmpty() || gender.isEmpty()){
                JOptionPane.showMessageDialog(frame1,"Please fill in the blank","Error",JOptionPane.ERROR_MESSAGE);
            } else {
                model.addRow(new Object[]{name,age,gender});
            }
        });
        panel1.add(label1);
        panel1.add(textField1);
        panel1.add(label2);
        panel1.add(textField2);
        panel1.add(label3);
        panel1.add(textField3);
        panel1.add(btnSubmit);

        frame1.setLayout(new BorderLayout());
        frame1.add(panel1,BorderLayout.NORTH);
        frame1.add(panel2,BorderLayout.CENTER);
        frame1.setVisible(true);
    }
}
