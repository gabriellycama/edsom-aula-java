import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;//01 import javax.swing.J0ptionPane;
public class Botaol extends JFrame implements ActionListener{//abre 01
JButton jb = new JButton("Botao 1");//02 botao ja recebendo o nome do botão
JButton jb2 = new JButton("Sair");//06 segundo botao
public void actionPerformed (ActionEvent e){//abre 02
//Sempre que um componente que tem um ActionListener registrado é acionado, esse método é chamado automaticamente.
if(e.getSource()==jb){
JOptionPane.showMessageDialog(null,"Aula ActionListener");
if(e getSource ()== jb2){
System.exit (0);
｝
}//fecha 02
public Botaol(){//abre 03
jb.addActionListener(this);//adicionando a escuta para classe pai jb2.addActionListener(this);//adicionando a escuta para classe pai setLayout (null);//04 //setando nulo o layout
jb.setBounds(100, 300, 100, 60)://05 x(vertical),y(horizontal) largura e altura execute jb2.setBounds(0, 0, 100, 60)://07
//getContentPane().add(jb); //para saber de onde vem mas não precisa usar geContentPane add (jb)://03 execute -adiciona o botao jb add (jb2);//08 execute -adicona o botao jb2 //criação da janela
setTitle("Titulo da janela");// Titulo da janela.
setSize (500,400);//Tamanho da janela setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//fecha depois da execução.
setLocationRelativeTo(null);//posição do elemento setVisible(true);// se vai ser visivel ou não setResizable(true);//caso eu não queria alterar o tamanho da janela false
}//fecha 03
public static void main(String[] args){
new Botao1();
}
}//fecha 01