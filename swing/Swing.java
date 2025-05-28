package swing;

import javax.swing.*;

public class Swing {

    public static void main(String[] args) {
        
        JFrame janela = new JFrame("minha rola ta batendo no meu sapato");
        janela.setSize(300,200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(null);
        
        JButton botao = new JButton("cliquei aqui");
        botao.setBounds(80, 70, 130, 30);
        
        botao.addActionListener(e -> {
            JOptionPane.showMessageDialog(null,"pega no meu penis");
    });
        
        janela.add(botao);
        
        janela.setVisible(true);
        
    }
    
}
