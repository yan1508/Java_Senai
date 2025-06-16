package testeswing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TesteSwing {

    public static void main(String[] args) {
        
              JFrame janela = new JFrame("Janela");
        janela.setSize(300,200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(null);
        
//        criar um botao
        JButton botao = new JButton("Clique no botão");
        botao.setBounds(80,70,130,30);
        botao.addActionListener(e ->{
            JOptionPane.showMessageDialog(null,"meu pau na sua mão");
        });
        
        janela.add(botao);
        
        janela.setVisible(true);  


    }
    
}
