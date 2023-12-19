import javax.swing.*;
import java.awt.*;
public class Gui_Form {
    public static void main(String[] args) {
        JFrame frame1 = new JFrame("input");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(500,500);

        JMenuBar menubar1 = new JMenuBar();
        frame1.setJMenuBar(menubar1);
        JMenu file = new JMenu("File");
        menubar1.add(file);
        JMenu exit = new JMenu("Exit");
        exit.addActionListener(e->{
            frame1.dispose();
        });
        file.add(exit);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(10,2));
        JLabel label1 = new JLabel("username: ");
        JTextField textfield1 = new JTextField(10);
        panel1.add(label1);
        panel1.add(textfield1);

        JPasswordField password1 = new JPasswordField(10);
        JLabel label2 = new JLabel("password: ");
        panel1.add(label2);
        panel1.add(password1);

        String[] genderOptions = {"Male","Female"};
        JComboBox <String> genderComboBox = new JComboBox<>(genderOptions);
        JLabel label3 = new JLabel("Gender: ");
        panel1.add(label3);
        panel1.add(genderComboBox);

        JCheckBox checkbox1 = new JCheckBox("option 1");
        JCheckBox checkbox2 = new JCheckBox("option 2");
        panel1.add(checkbox1);
        panel1.add(checkbox2);

        JRadioButton radioButton1 = new JRadioButton("Radio 1");
        JRadioButton radioButton2 = new JRadioButton("Radio 2");
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(radioButton1);
        buttonGroup1.add(radioButton2);
        panel1.add(radioButton1);
        panel1.add(radioButton2);

        JSlider slider1 = new JSlider(JSlider.HORIZONTAL,0,100,50);
        slider1.setMajorTickSpacing(20);
        slider1.setMinorTickSpacing(5);
        slider1.setPaintTicks(true);
        slider1.setPaintLabels(true);
        panel1.add(slider1);

        SpinnerNumberModel spinnerModel = new SpinnerNumberModel(50, 0, 100, 1);
        JSpinner spinner1 = new JSpinner(spinnerModel);
        panel1.add(spinner1);


        JButton btnPrint = new JButton("Print");
        btnPrint.addActionListener(e -> {
            String username = textfield1.getText();
            String password = new String(password1.getPassword());
            String selectedGender = (String) genderComboBox.getSelectedItem();

            JFrame frame2 = new JFrame("output");
            frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame2.setSize(500,500);

            JTextArea area1 = new JTextArea();
            area1.append("Username: "+username+"\n");
            area1.append("Password: "+password+"\n");
            area1.append("Gender: "+selectedGender+"\n");

            if (checkbox1.isSelected()){
                area1.append("option 1 selected\n");
            } else {
                area1.append("option 1 is not selected\n");
            }
            if (checkbox2.isSelected()){
                area1.append("option 2 is selected\n");
            } else {
                area1.append("option 2 is not selected\n");
            }

            if (radioButton1.isSelected()){
                area1.append("radio button 1 selected\n");
            } else if (radioButton2.isSelected()){
                area1.append("radio button 2 selected\n");
            } else {
                area1.append("no radio button selected\n");
            }

            area1.append("Slider value: " + slider1.getValue() + "\n");
            area1.append("Spinner value: " + spinner1.getValue() + "\n");
            JOptionPane.showConfirmDialog(null,"information saved","information",JOptionPane.PLAIN_MESSAGE);

            JScrollPane scrollbar1 = new JScrollPane(area1);
            panel1.add(scrollbar1);

            frame2.add(area1);
            frame2.setVisible(true);
            frame1.dispose();
        });
        panel1.add(btnPrint);

        frame1.add(panel1);
        frame1.setVisible(true);
    }
}
