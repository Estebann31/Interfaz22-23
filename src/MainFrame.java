import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    private JButton mostrarHubButton;
    private JButton apilarButton;
    private JButton desapilarButton;
    private JButton mostrarDatosButton;
    private JButton procedenciaPorPaísButton;
    private JTextField introduceInformaciónTextField;
    private JPanel main_panel;
    private JTextArea print;
    private pais

    public MainFrame ()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Ejemplo de ventana");
        this.setSize(700, 500);
        this.setVisible(true);
        this.add(main_panel);

        mostrarDatosButton.setVisible(false);
        mostrarHubButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Barco barco1 = new Barco();
                print.setText(barco1.toString());
                mostrarDatosButton.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        MainFrame ventana = new MainFrame();

    }

}
