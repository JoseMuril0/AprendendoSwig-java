import javax.swing.*;
import java.awt.*;
/*
*   Praticando conhecimentos emm AWT E SWING;
*   Melhor forma de indentar o código;
*/
class Janela {

    private JFrame f;
    private JPanel p;
    private JButton b1;
    private JLabel lab;

    public Janela() {
        create();
    }
    /* Iniciar todos os labels,buttons, panel, instiando como padrão */
    public void create() {
        f = new JFrame("- Policia DPH -");
        f.setVisible(true);
        f.setSize(300, 150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p = new JPanel();
        p.setBackground(Color.YELLOW);

        b1 = new JButton("Cadastro");
        lab = new JLabel("Policial:");

        p.add(lab);
        p.add(b1);
       
        f.add(p);
    }
    public static void main(String[] args) throws Exception {
        new Janela();
    }
}

/*
 *  JPanel é onde iremos alterar propriedades do painel;
 *  JPanel é colocado no JFrame é considerado a parte de dentro da janela;
 */