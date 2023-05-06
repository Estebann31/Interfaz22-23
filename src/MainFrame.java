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
    private JLabel textoid;
    private JLabel textopeso;
    private JLabel textopais;
    private JLabel textoprioridad;
    private JLabel textodescripicion;
    private JLabel textoempresaenv;
    private JLabel textoempresarec;
    private JLabel textocolumna;
    private JTextField campocolumna;
    private JButton botonok;
    private JTextArea printder;
    private JRadioButton botonPrioridad1;
    private JRadioButton botonPrioridad3;
    private JRadioButton botonPrioridad2;


    public MainFrame ()
    {
        final int[] confirmar_boton = new int[1];
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Ejemplo de ventana");
        this.setSize(700, 500);
        this.setVisible(true);
        this.add(main_panel);
        Barco barco1 = new Barco();


        campoID.setVisible(false);
        textoid.setVisible(false);
        textoprioridad.setVisible(false);
        botonPrioridad1.setVisible(false);
        botonPrioridad2.setVisible(false);
        botonPrioridad3.setVisible(false);
        campoPeso.setVisible(false);
        textopeso.setVisible(false);
        campoErecibe.setVisible(false);
        textoempresarec.setVisible(false);
        campoEenvia.setVisible(false);
        textoempresaenv.setVisible(false);
        campoPais.setVisible(false);
        textopais.setVisible(false);
        campoDesc.setVisible(false);
        textodescripicion.setVisible(false);
        checkaduanas.setVisible(false);
        campocolumna.setVisible(false);
        textocolumna.setVisible(false);
        botonok.setVisible(false);
        print.setText(barco1.toString());


        apilarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                campoID.setVisible(true);
                textoid.setVisible(true);
                textoprioridad.setVisible(true);
                botonPrioridad1.setVisible(true);
                botonPrioridad2.setVisible(true);
                botonPrioridad3.setVisible(true);
                campoPeso.setVisible(true);
                textopeso.setVisible(true);
                campoErecibe.setVisible(true);
                textoempresarec.setVisible(true);
                campoEenvia.setVisible(true);
                textoempresaenv.setVisible(true);
                campoPais.setVisible(true);
                textopais.setVisible(true);
                campoDesc.setVisible(true);
                textodescripicion.setVisible(true);
                checkaduanas.setVisible(true);
                campocolumna.setVisible(false);
                textocolumna.setVisible(false);

                botonok.setVisible(true);
                printder.setText("");
                confirmar_boton[0] = 1;


            }
        });

        desapilarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                campoID.setVisible(false);
                textoid.setVisible(false);
                textoprioridad.setVisible(false);
                botonPrioridad1.setVisible(false);
                botonPrioridad2.setVisible(false);
                botonPrioridad3.setVisible(false);
                campoPeso.setVisible(false);
                textopeso.setVisible(false);
                campoErecibe.setVisible(false);
                textoempresarec.setVisible(false);
                campoEenvia.setVisible(false);
                textoempresaenv.setVisible(false);
                campoPais.setVisible(false);
                textopais.setVisible(false);
                campoDesc.setVisible(false);
                textodescripicion.setVisible(false);
                checkaduanas.setVisible(false);
                campocolumna.setVisible(true);
                textocolumna.setVisible(true);
                botonok.setVisible(true);
                printder.setText("");
                confirmar_boton[0]=2;
            }
        });

        mostrarDatosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                campoID.setVisible(true);
                textoid.setVisible(true);
                textoprioridad.setVisible(false);
                botonPrioridad1.setVisible(false);
                botonPrioridad2.setVisible(false);
                botonPrioridad3.setVisible(false);
                campoPeso.setVisible(false);
                textopeso.setVisible(false);
                campoErecibe.setVisible(false);
                textoempresarec.setVisible(false);
                campoEenvia.setVisible(false);
                textoempresaenv.setVisible(false);
                campoPais.setVisible(false);
                textopais.setVisible(false);
                campoDesc.setVisible(false);
                textodescripicion.setVisible(false);
                checkaduanas.setVisible(false);
                campocolumna.setVisible(false);
                textocolumna.setVisible(false);
                botonok.setVisible(true);
                printder.setText("");
                confirmar_boton[0]=3;

            }
        });
        procedenciaPorPaísButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                campoID.setVisible(false);
                textoid.setVisible(false);
                textoprioridad.setVisible(false);
                botonPrioridad1.setVisible(false);
                botonPrioridad2.setVisible(false);
                botonPrioridad3.setVisible(false);
                campoPeso.setVisible(false);
                textopeso.setVisible(false);
                campoErecibe.setVisible(false);
                textoempresarec.setVisible(false);
                campoEenvia.setVisible(false);
                textoempresaenv.setVisible(false);
                campoPais.setVisible(true);
                textopais.setVisible(true);
                campoDesc.setVisible(false);
                textodescripicion.setVisible(false);
                checkaduanas.setVisible(false);
                campocolumna.setVisible(false);
                textocolumna.setVisible(false);
                botonok.setVisible(true);
                printder.setText("");
                confirmar_boton[0]=4;

            }
        });

        botonok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (confirmar_boton[0]){
                    case 1:
                        int id= Integer.parseInt(campoID.getText());
                        int peso = Integer.parseInt(campoPeso.getText());
                        String pais = campoPais.getText();
                        int prioridad = 0;
                        String desc = campoDesc.getText();
                        String emp_envia = campoEenvia.getText();
                        String emp_recibe = campoErecibe.getText();
                        boolean aduanas = checkaduanas.isBorderPainted();

                        if (botonPrioridad1.isSelected()){
                            prioridad = 1;
                        }
                        if (botonPrioridad2.isSelected()){
                            prioridad = 2;
                        }
                        if (botonPrioridad3.isSelected()){
                            prioridad = 3;
                        }

                        Contenedor contenedor = new Contenedor(id, peso, pais, aduanas,prioridad, desc, emp_envia, emp_recibe );
                        barco1.apila(contenedor);
                        print.setText(barco1.toString());
                        break;

                    case 2:
                        int columna = Integer.parseInt(campocolumna.getText());
                        printder.setText(barco1.desapila(columna));
                        print.setText(barco1.toString());
                        break;

                    case 3:
                        int id1 = Integer.parseInt(campoID.getText());
                        barco1.MostrarDatos(id1);
                        printder.setText(barco1.MostrarDatos(id1));
                        break;
                    case 4:

                        String pais2 = campoPais.getText();
                        printder.setText(String.valueOf(barco1.contenedoresPais(pais2)));
                        break;
                }
            }
        });

        //botones de prioridad
        botonPrioridad1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (botonPrioridad1.isSelected()){
                    botonPrioridad2.setSelected(false);
                    botonPrioridad3.setSelected(false);
                }
            }
        });

        botonPrioridad2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (botonPrioridad2.isSelected()){
                    botonPrioridad1.setSelected(false);
                    botonPrioridad3.setSelected(false);
                }
            }
        });
        botonPrioridad3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (botonPrioridad3.isSelected()){
                    botonPrioridad1.setSelected(false);
                    botonPrioridad2.setSelected(false);
                }
            }
        });
    }

    public static void main(String[] args) {
        MainFrame ventana = new MainFrame();

    }

}