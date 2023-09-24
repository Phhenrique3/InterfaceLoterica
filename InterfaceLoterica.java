import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;
import javax.swing.text.DocumentFilter;
import javax.swing.JTextField;

public class InterfaceLoterica extends JFrame {

    private JLabel resultadoLabel;
    private JPanel painel = new JPanel();
    private JButton jButtonAposta1 = new JButton(" Aposta de 0 a 100");
    private JButton jButtonAposta2 = new JButton(" Aposta de A a Z");
    private JButton jButtonAposta3 = new JButton(" Aposta de PAR a IMPAR");
    private JLabel jLabel = new JLabel(" Exemplo de simples Janela");

    // Construtor

    /**
     *
     */
    public InterfaceLoterica() {
        this.setTitle("Lotofácil");
        this.setSize(300, 200);
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 20));
        painel.setBackground(new Color(45, 30, 50));
        painel.add(jButtonAposta1);
        painel.add(jButtonAposta2);
        painel.add(jButtonAposta3);

        jButtonAposta1.addActionListener(new ActionListener() {
            JTextField textfield = new JTextField(10);

            @Override
            public void actionPerformed(ActionEvent e) {

                String aposta = JOptionPane.showInputDialog("digite número de 0 a 100");
                painel.add(textfield);
                int numeroSorteado = random.nextInt(101);
                int numeroApostado = Integer.parseInt(aposta);
                if (numeroApostado >= 0 && numeroApostado <= 100) {
                    if (numeroApostado == numeroSorteado) {
                        JOptionPane.showMessageDialog(null, "parabens voce ganhou 1000 ");
                    } else {
                        JOptionPane.showMessageDialog(null, "Prezado numero sorteado foi " + numeroSorteado + " ");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, " opçao invalida");
                }
                // JOptionPane.showMessageDialog( null,"numero sorteado foi :" +numeroSorteado
                // );
            }
        });

        jButtonAposta2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String aposta = JOptionPane.showInputDialog("digite uma letra de A ate Z").toUpperCase();
                char letraPremiada = 'P';

                if (aposta.length() == 1 && Character.isLetter(aposta.charAt(0))) {
                    char letraApostado = aposta.charAt(0);
                    if (letraApostado == letraPremiada) {
                        JOptionPane.showMessageDialog(null, "parabens vc ganhou 500 ");
                    } else {
                        JOptionPane.showMessageDialog(null, "que pena a letra sorteada foi :" + letraPremiada + " ");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "opção invalida tenta novamente ! ");
                }

            }
        });

        jButtonAposta3.addActionListener(new ActionListener() {
            JTextField textfield = new JTextField(10);

            public void actionPerformed(ActionEvent e) {

                String aposta = JOptionPane.showInputDialog("Digite um numero Impar ou Par");
                painel.add(textfield);
                int NumeroImparPar = aposta.charAt(0);
                if (NumeroImparPar % 2 == 0) {
                    JOptionPane.showMessageDialog(null, "parabens vc ganhou R$ 100,00");
                } else {
                    JOptionPane.showMessageDialog(null, " Prezado numero que ganhou foi PAR");

                }
            }

        });

        this.getContentPane().add(painel);
        this.setLocationRelativeTo(null); // centralizar janela
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true); // Exibir Janela

    }


    public static void main(String[] args) {
        new InterfaceLoterica();
    }

    Random random = new Random();

}
