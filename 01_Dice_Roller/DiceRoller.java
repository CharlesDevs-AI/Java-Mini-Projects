import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class DiceRoller extends JFrame {

    private JLabel diceLabel;
    private JButton rollButton;
    private Random random;

    public DiceRoller() {

        random = new Random();

        setTitle("Dice Roller");
        setSize(350, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel title = new JLabel("🎲 Dice Roller", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 24));

        diceLabel = new JLabel("🎲", SwingConstants.CENTER);
        diceLabel.setFont(new Font("Arial", Font.PLAIN, 80));

        rollButton = new JButton("Roll Dice");
        rollButton.setFont(new Font("Arial", Font.BOLD, 18));

        rollButton.addActionListener((ActionEvent e) -> {
            int number = random.nextInt(6) + 1;
            diceLabel.setText(String.valueOf(number));
        });

        add(title, BorderLayout.NORTH);
        add(diceLabel, BorderLayout.CENTER);
        add(rollButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DiceRoller::new);
    }
}