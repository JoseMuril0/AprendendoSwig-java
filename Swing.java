import jutil.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
/*
    Aqui é o main da janela;
*/
class Swing {
    public static void main(String[] args) throws Exception {
        JFrame form1 = new JFrame();
        form1.setTitle("Policia DPH - Treinamentos");
        form1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        form1.setSize(400, 300);

        JLabel label1 = new JLabel("Policia DPH");

        form1.add(label1);
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
*/
/*
    Metodo para definir a janela como visivel;
    form1.setVisible(true);
*/