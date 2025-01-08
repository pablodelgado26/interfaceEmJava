import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen extends JFrame {

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


        JButton jButton2 = new JButton("Clique aqui");
        jButton2.setBounds(0, 0, 150, 70);
        jButton2.setFont(new Font("Arial", Font.ITALIC,20));
        jButton2.setForeground(new Color(255, 0, 0));
        jButton2.setBackground(new Color(0, 182, 0));

        add(jButton);
        add(jButton2);

        jButton.addActionListener(this::outroteste);
        jButton2.addActionListener(this::teste);

    }

    private void teste(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(null,
                "Metodo", "teste", JOptionPane.WARNING_MESSAGE);
    }

    private void outroteste(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(null,
                "Metodo com dois botões", "teste", JOptionPane.WARNING_MESSAGE);
    }


}
