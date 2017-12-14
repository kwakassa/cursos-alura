package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AbreArquivoUI extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JLabel lblAbreArquivo;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JButton btnSelecione;
	
	public AbreArquivoUI() {
		setSize(640, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Abre Arquivo UI");
		
		lblAbreArquivo = new JLabel("Abre Arquivo:");
		
		btnSelecione = new JButton("Selecione");
		
		btnSelecione.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				textArea.setText("");
				//--- O Correto seria utilizar o SwingWorker para disparar uma nova thread e nao comprometer a renderizacao
				JFileChooser janelaEscolheArquivo = new JFileChooser();
				
				janelaEscolheArquivo.setDialogTitle("Selecione Arquivo");//Opcional
				janelaEscolheArquivo.setCurrentDirectory(new File("/"));//Opcional	
				janelaEscolheArquivo.showOpenDialog(null);// returna um inteiro JFileChooser.CANCEL_OPTION ou JFileChooser.APPROVE_OPTION ou JFileChooser.ERROR_OPTION
				
				File selectedFile = janelaEscolheArquivo.getSelectedFile();
				
				try {
					Scanner leitorArquivo = new Scanner(selectedFile);
					while(leitorArquivo.hasNext()){
						String linha = leitorArquivo.nextLine() + "\n";
						textArea.append(linha);
					}
				} catch (FileNotFoundException e) {
					textArea.setText("Erro ao Ler Arquivo");
				}
			}
		});
		//Abstrair o trecho abaixo pois ew gerado pelo plugin do WindowBuilder
		scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblAbreArquivo)
							.addGap(18)
							.addComponent(btnSelecione)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAbreArquivo)
						.addComponent(btnSelecione))
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		getContentPane().setLayout(groupLayout);
	}

	public static void main(String[] args) {
		new AbreArquivoUI().setVisible(true);
	}
}
