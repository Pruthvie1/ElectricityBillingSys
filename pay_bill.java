import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.IOException;
import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;

public class pay_bill extends JFrame {
    private static final long serialVersionUID = -4686161321961915479L;

    pay_bill() {
        JButton payButton = new JButton("Pay Bill Online");
        payButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openWebpage("https://paytm.com/electricity-bill-payment");
            }
        });

        JPanel panel = new JPanel();
        panel.add(payButton);
        add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(800, 600));
        setSize(800, 800);
        setLocation(250, 120);
        setVisible(true);
    }

    public static void main(String[] args) {
        new pay_bill().setVisible(true);
    }

    // Method to open the specified URL in the default web browser
    private void openWebpage(String urlString) {
        try {
            Desktop.getDesktop().browse(new URI(urlString));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to open the link", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
