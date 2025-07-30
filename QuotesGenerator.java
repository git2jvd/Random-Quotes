import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class QuotesGenerator {
    private static final String[] compliments = {
         "Grow through what you go through.",
    "The best way out is always through.",
    "Keep going. Everything you need will come to you.",
    "You are a sky full of stars.",
    "You are stronger than you think.",
    "Own who you are.",
    "You are your only limit.",
    "Darling, you are a work of art.",
    "Choose kindness and laugh often.",
    "Kindness is free, sprinkle it everywhere.",
    "Some days you just have to create your own sunshine.",
    "Shine like the whole universe is yours.",
    "Take time to do what makes your soul happy.",
    "Enjoy the little things.",
    "You were born to be real, not perfect.",
    "Pause and appreciate.",
    "There is beauty in simplicity.",
    "Stay close to what makes you feel alive.",
    "Be gentle with yourself.",
    "Feel the fear and do it anyway.",
    "Every flower must grow through dirt.",
    "Do more things that make you forget to check your phone.",
    "Let your dreams be bigger than your fears.",
    "Believe in the power of yet.",
    "Follow your bliss.",
    "The comeback is always stronger than the setback.",
    "Be the reason someone smiles today.",
    "Don't be afraid to sparkle a little brighter.",
    "Do it with passion or not at all.",
    "Believe you can and you're halfway there.",
    "One day at a time.",
    "The best is yet to come.",
    "Throw kindness around like confetti.",
    "Kind hearts are the gardens. Kind thoughts are the roots.",
    "Live more, worry less.",
    "You are worthy of all things beautiful.",
    "Celebrate every tiny victory.",
    "Stay curious.",
    "Be yourself; everyone else is already taken.",
    "You’re doing better than you think.",
    "You define your own worth.",
    "Joy is now.",
    "Your vibe attracts your tribe.",
    "Doubt kills more dreams than failure ever will.",
    "Don’t count the days. Make the days count.",
    "Progress, not perfection.",
    "You are more than enough.",
    "Smile. It’s free therapy.",
    "Rise and shine.",
    "Nothing changes if nothing changes.",
    "Embrace the glorious mess that you are.",
    "You are capable of amazing things.",
    "Don’t just exist. Live.",
    "Leave a little sparkle wherever you go.",
    "Make peace with your past.",
    "Slay the day.",
    "Be a voice, not an echo.",
    "Trust the process.",
    "Stars can’t shine without darkness.",
    "Let it go, let it flow.",
    "Your pace is the right pace.",
    "Don’t dim your light for others.",
    "Life is tough but so are you.",
    "Let your light shine.",
    "Create your own sunshine.",
    "Happiness depends upon ourselves.",
    "You matter.",
    "Stay golden.",
    "Be fearless in the pursuit of what sets your soul on fire.",
    "Create the life you can’t wait to wake up to.",
    "Take the risk or lose the chance.",
    "Be proud of how far you’ve come.",
    "Small steps every day.",
    "Live your truth.",
    "Radiate positivity.",
    "Never stop dreaming.",
    "Wander often, wonder always.",
    "No rain, no flowers.",
    "Your only limit is your mind.",
    "You’re a limited edition.",
    "In the middle of every difficulty lies opportunity.",
    "Storms don’t last forever.",
    "Collect moments, not things.",
    "Live with intention.",
    "You are magic.",
    "You’ve got this.",
    "Shine bright, even on your dull days.",
    "Make your heart the most beautiful thing about you.",
    "Grow positive thoughts.",
    "Breathe. You’re going to be okay.",
    "Life is better when you’re laughing.",
    "Be so good they can’t ignore you.",
    "Bloom where you are planted.",
    "Keep blooming.",
    "You were born to stand out.",
    "Make today so awesome yesterday gets jealous.",
    "Dream big. Work hard. Stay focused.",
    "Make yourself a priority.",
    "Start where you are. Use what you have. Do what you can.",
    "Just keep swimming."
    };

    public static void main(String[] args) {
        JFrame frame = new JFrame("💖 Quotes Generator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        frame.setLayout(new BorderLayout());

        JLabel label = new JLabel("Click the button to get a quote!", SwingConstants.CENTER);
        label.setFont(new Font("Segoe UI", Font.PLAIN, 16));

        JButton button = new JButton("✨ Give me a quote");
        button.setFont(new Font("Segoe UI", Font.BOLD, 14));
        button.setFocusPainted(false);

        button.addActionListener(e -> {
            int index = new Random().nextInt(compliments.length);
            label.setText("<html><center>" + compliments[index] + "</center></html>");
        });

        frame.add(label, BorderLayout.CENTER);
        frame.add(button, BorderLayout.SOUTH);

        frame.setLocationRelativeTo(null); // Center the window
        frame.setVisible(true);
    }
}
