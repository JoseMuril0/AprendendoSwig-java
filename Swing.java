import jutil.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.FlowLayout;
import java.awt.GridLayout;

/*
    Aqui é o main da janela;
*/
class Swing {
    public static void main(String[] args) throws Exception {
        JFrame form1 = new JFrame();
        form1.setTitle("Policia DPH - Treinamentos");
        form1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        form1.setSize(400, 300);
        /* Implementação na janela */

        JLabel label1 = new JLabel("Policia DPH");
        JLabel label2 = new JLabel("Treinamentos");

        label1.setHorizontalAlignment(JLabel.CENTER);
        label2.setHorizontalAlignment(JLabel.CENTER);        

        /* Final de implementação na janela */
        GridLayout tabela = new GridLayout(1, 2);
        form1.setLayout(tabela);
        form1.add(label1);
        form1.add(label2);
        form1.setVisible(true);
    }
}


/* Area de dúvidas e estudos sobre código */
/*
    Importação do OBJ que sera a janela e nomeada; 
    JFrame form1 = new JFrame("Form 1");
*/

/*
    Metodo do titulo da janela (mesmo resultado se passar o string como
                                argumento na instacia da janela)
    form1.setTitle("Policia DPH - Treinamentos");
*/

/*
    Metodo que define o que fazer quando a janela e fechada;
    form1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
*/
/*
    Metodo que define o tamanho da janela;
    form1.setSize(400, 300);
*/

/*
    Criando um label momento de instacia;
    JLabel label1 = new JLabel("Policia DPH");

    Metodo que adciona um componente a janela; 
    form1.add(label1);

    Metodo para definir o aliamento horizontal do label1(Usando uma constante nesse caso);
    label1.setHorizontalAlignment(JLabel.CENTER);

    Metodo para defenor o aliamento vertical do label1(Usando uma constante nesse caso);
    label1.setVerticalAlignment(JLabel.TOP);
*/
/*
    SetLayout recebe o layout para podemos usar add sem sobre por os labels
    form1.setLayout(new FlowLayout());

    Instancia do GridLayout que outra opção de como mostrar os layout;
    Instancia (linha, coluna);
    GridLayout tabela = new GridLayout(1, 2);
*/
/*
    Metodo para definir a janela como visivel;
    form1.setVisible(true);
*/