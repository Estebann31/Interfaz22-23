import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    private JButton mostrarHubButton;
    private JButton apilarButton;
    private JButton desapilarButton;
    private JButton mostrarDatosButton;
    private JButton procedenciaPorPaísButton;
    private JTextField campoID;
    private JPanel main_panel;
    private JTextArea print;
    private JTextField campoPrioridad;
    private JTextField campoEenvia;
    private JTextField campoDesc;
    private JTextField campoPeso;
    private JTextField campoPais;
    private JTextField campoErecibe;
    private JCheckBox checkaduanas;


    public MainFrame ()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Ejemplo de ventana");
        this.setSize(700, 500);
        this.setVisible(true);
        this.add(main_panel);
        Barco barco1 = new Barco();


        mostrarDatosButton.setVisible(true);
        campoID.setVisible(false);
        campoPrioridad.setVisible(false);
        campoPeso.setVisible(false);
        campoErecibe.setVisible(false);
        campoEenvia.setVisible(false);
        campoPais.setVisible(false);
        campoDesc.setVisible(false);
        checkaduanas.setVisible(false);

        mostrarHubButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                print.setText(barco1.toString());
                mostrarDatosButton.setVisible(true);
            }
        });
        apilarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                campoID.setVisible(true);
                campoPrioridad.setVisible(true);
                campoPeso.setVisible(true);
                campoErecibe.setVisible(true);
                campoEenvia.setVisible(true);
                campoPais.setVisible(true);
                campoDesc.setVisible(true);
                checkaduanas.setVisible(true);

                int id= Integer.parseInt(campoID.getText());
                int peso = Integer.parseInt(campoPeso.getText());
                String pais = campoPais.getText();
                String desc = campoDesc.getText();
                String emp_envia = campoEenvia.getText();
                String emp_recibe = campoErecibe.getText();
                int prioridad = Integer.parseInt(campoPrioridad.getText());
                boolean aduanas = checkaduanas.isBorderPainted();

                Contenedor contenedor = new Contenedor(id, peso, pais, aduanas,prioridad, desc, emp_envia, emp_recibe );
                barco1.apila(contenedor);
            }
        });

        desapilarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                campoPrioridad.setVisible(false);
                campoPeso.setVisible(false);
                campoErecibe.setVisible(false);
                campoEenvia.setVisible(false);
                campoPais.setVisible(false);
                campoDesc.setVisible(false);
                checkaduanas.setVisible(false);

                campoID.setVisible(true);
                int columna = Integer.parseInt(campoID.getText());
                barco1.desapila(columna);
            }
        });
    }

    public static void main(String[] args) {
        MainFrame ventana = new MainFrame();

    }

}