import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame {
    private JFrame frame;
    private JPanel panel;
    private JLabel imageLabel;
    private ButtonGroup petGroup;

    public MainFrame() {
        frame = new JFrame("RadioButtonDemo");
        panel = new JPanel();
        imageLabel = new JLabel();
        petGroup = new ButtonGroup();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setMinimumSize(new Dimension(600, 600)); // Set minimum size
        frame.setLayout(new BorderLayout());

        panel.setLayout(new FlowLayout());
        frame.add(panel, BorderLayout.NORTH);
        frame.add(imageLabel, BorderLayout.CENTER);

        addRadioButton("Cat", "Images/cat.png");
        addRadioButton("Dog", "Images/dog.png");
        addRadioButton("Fish", "Images/fish.png");
        addRadioButton("Bird", "Images/bird.png");
        addRadioButton("Pig", "Images/pig.png");
        addRadioButton("Rabbit", "Images/rabbit.png");

        frame.setVisible(true);
    }

    private void addRadioButton(String petName, final String imageName) {
        JRadioButton radioButton = new JRadioButton(petName);
        radioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon imageIcon = new ImageIcon(imageName);
                imageLabel.setIcon(imageIcon);
            }
        });
        petGroup.add(radioButton);
        panel.add(radioButton);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainFrame();
            }
        });
    }
}
