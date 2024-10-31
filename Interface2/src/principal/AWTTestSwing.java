package principal;

//Imports da biblioteca java para que os métodos utilizados funcionem corretamente
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;


//Classe criada para fazer o teste da Interface, com todos os métodos já inseridos
public class AWTTestSwing {
		public static void main (String[] args) {
			
			//Criação da janela da interface, com o nome AWT.
			//Através do frame.SET o molde da janela é feito, sendo colocado um tamanho 400x200 e adicionando uma borda com os "métodos" fechar/minimmizar/aumentar a tela
			JFrame frame = new JFrame ("AWT TEST"); //Nome da janela
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //colocar os "métodos"
			frame.setSize(400,200); //tamanho
			frame.setLayout(new BorderLayout()); //Adicionar a Borda
			
			//Criação de um espaço de Escrita, chamado Label 1
			JLabel label1 = new JLabel ("Label 1");
			JTextField textField1 = new JTextField(15);
			
			//Criação da Borda do espaço onde se escreve, utilizando o topPanel.ADD
			JPanel topPanel = new JPanel();
			topPanel.setLayout(new FlowLayout());
			topPanel.add(label1);
			topPanel.add(textField1);
	
			//Criação de 3 botões
			JButton button1 = new JButton ("Button 1");
			JButton button2 = new JButton ("Button 2");
			JButton button3 = new JButton ("Button 3");
			
			//Layout dos 3 Botões, Cria um layout e o adiciona utilizando o buttonPanel.ADD
			JPanel buttonPanel = new JPanel();
			buttonPanel.setLayout(new FlowLayout());
			buttonPanel.add(button1);
			buttonPanel.add(button2);
			buttonPanel.add(button3);
							
			//determinação da localização das bordas, tendo uma no topo para separar os "métodos" do resto e outra para preencher a borda dos botões 
			frame.add(topPanel,BorderLayout.NORTH);
			frame.add(buttonPanel,BorderLayout.CENTER);
			
			
			frame.setVisible(true);
							
		}
	
}