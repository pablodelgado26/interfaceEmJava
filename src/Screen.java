import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen extends JFrame {
    JTextField num1;
    JTextField num2;


    public Screen() {

        setTitle("interface");
        setVisible(true);
        setSize(800,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        JButton jButton = new JButton("Clique aqui");
        jButton.setBounds(200, 300, 250, 70);
        jButton.setFont(new Font("Arial", Font.BOLD,40));
        jButton.setForeground(new Color(255, 255, 255));
        jButton.setBackground(new Color(9, 10, 9));

        add(jButton);
        jButton.addActionListener(this::actionButton);

        num1 = new JTextField();
        num1.setBounds(100,100,100,100);
        num1.setFont(new Font("Arial", Font.ITALIC,40));

        add(num1);

        num2 = new JTextField();
        num2.setBounds(300,100,100,100);
        num2.setFont(new Font("Arial", Font.ITALIC,40));

        add(num2);


    }


    private void actionButton(ActionEvent actionEvent) {

        Integer numero1 = Integer.parseInt(num1.getText());
        Integer numero2 = Integer.parseInt(num2.getText());

        Integer soma = numero1 + numero2;

        JOptionPane.showMessageDialog(null,
                "A soma é: " + soma, "teste", JOptionPane.WARNING_MESSAGE);
    }


}
