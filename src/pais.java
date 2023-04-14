import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class pais extends JFrame {
    private JTextArea pais;
    private JPanel titulo;

    public pais() {
        pais.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
            }
        });
    }

    public static void main(String[] args) {

    }
}
