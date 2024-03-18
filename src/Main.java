import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::interfazeGrafikoa);
    }

    private static void interfazeGrafikoa() {
        JFrame frame = new JFrame("Maketazio Interfazea");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BorderLayout());
        JPanel panelIparraldea = new JPanel(new FlowLayout());
        panelIparraldea.add(new JCheckBox("Katniss"));
        panelIparraldea.add(new JCheckBox("Peeta"));
        contentPane.add(panelIparraldea, BorderLayout.NORTH);
        JPanel panelEkialdea = new JPanel();
        panelEkialdea.setPreferredSize(new Dimension(250, 0));
        contentPane.add(panelEkialdea, BorderLayout.EAST);
        JRadioButton[] radioBotoiak = new JRadioButton[3];
        ButtonGroup botoiTaldea = new ButtonGroup();
        JPanel panelEkialdeaBarne = new JPanel(new GridLayout(3, 1)); // Ekialdeko panelaren barneko kudeatzailea
        for (int i = 0; i < radioBotoiak.length; i++) {
            radioBotoiak[i] = new JRadioButton("OPT " + (i + 1));
            botoiTaldea.add(radioBotoiak[i]);
            panelEkialdeaBarne.add(radioBotoiak[i]);
            if (i == 0) {
                radioBotoiak[i].setSelected(true);
            }
        }
        panelEkialdea.add(panelEkialdeaBarne);
        JPanel panelHegoaldea = new JPanel();
        panelHegoaldea.setLayout(new BoxLayout(panelHegoaldea, BoxLayout.X_AXIS));
        panelHegoaldea.setPreferredSize(new Dimension(0, 50));
        panelHegoaldea.add(new JButton("But 1"));
        panelHegoaldea.add(new JButton("But 2"));
        contentPane.add(panelHegoaldea, BorderLayout.SOUTH);
        JPanel panelZentroa = new JPanel(new GridLayout(2, 2));
        ImageIcon ikonoa = new ImageIcon("C:\\Users\\User\\IdeaProjects\\Mugarriak\\Mugarriak/descarga.jpeg"); // Egiaztatu irudi baliogarria dela
        for (int i = 0; i < 4; i++) {
            JLabel etiketa = new JLabel(ikonoa);
            panelZentroa.add(etiketa);
        }
        contentPane.add(panelZentroa, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}