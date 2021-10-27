import javax.swing.JOptionPane;
import java.util.Random;


public class App {
    public static void main(String[] args) throws Exception {
    String selecione= JOptionPane.showInputDialog(null, "Escolha: \n1- Pedra \n2- Papel \n3-Tesoura", "Jogo Jokenpô", JOptionPane.QUESTION_MESSAGE);
    int opcao = Integer.parseInt(selecione);
        if (opcao <1 || opcao >3){
            JOptionPane.showMessageDialog(null, "Opção invalida");
        }
        else{        
            JOptionPane.showMessageDialog(null, "Você selecionou: " + opcao, "Peça selecionada", JOptionPane.INFORMATION_MESSAGE);
            Random gerador = new Random();
            int numero = gerador.nextInt(3) + 1;
            if (numero == 1){
            JOptionPane.showMessageDialog(null, "A maquina escolheu pedra");
            }
            if (numero == 2){
                JOptionPane.showMessageDialog(null, "A maquina escolheu papel");
            }
            if (numero == 3){
                JOptionPane.showMessageDialog(null, "A maquina escolheu tesoura");
            }

            int resultado = opcao - numero;
                if (resultado == 0){
                    JOptionPane.showMessageDialog(null, "Jogo empatado!");
                }
                else if (resultado == 1){
                    JOptionPane.showMessageDialog(null, "Você ganhou!");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Você perdeu!");
                }
        
        }


}
}
