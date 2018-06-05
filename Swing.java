import jutil.*;
import javax.swing.JFrame;
/*
    Aqui é o main da janela;
*/
class Swing {
    public static void main(String[] args) throws Exception {
        JFrame form1 = new JFrame("Policia DPH");

        form1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        form1.setSize(400, 300);
        form1.setVisible(true);
    }
}


/* Area de dúvidas e estudos sobre código */
/*
    Importação do OBJ que sera a janela e nomeada; 
    JFrame form1 = new JFrame("Form 1");
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
    Metodo para definir a janela como visivel;
    form1.setVisible(true);
*/