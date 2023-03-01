package guessinggame;
import javax.swing.*;

public class App {
    public static void main (String[] args) {
        int computerNumber = (int) (Math.random()*100 + 1);
        int userAnswer = 0;
        System.out.println("A resposta correta seria: " + computerNumber);
        int count = 1;
        
        while (userAnswer != computerNumber){
            String response = JOptionPane.showInputDialog(null,
            "escolha 1 número entre 1 e 100", "Guessing Game", 3);
            userAnswer = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, ""+ determineGuess(userAnswer, computerNumber, count));
            count++;
        }
    }

    
    public static String determineGuess(int userAnswer, int computerNumber, int count){
        if (userAnswer <=0 || userAnswer>100){
        return "sua tentativa é invalida";
    }
        else if (userAnswer == computerNumber){
            return "resposta correta! \ntotal de tentativas: " + count;
        }
        
        else if (userAnswer < computerNumber){
            return "sua resposta está abaixo do número correto! \nNumero de tentativas: " + count;
        }
        
        else if (userAnswer > computerNumber){
            return "sua resposta está abaixo do número correto! \nNumero de tentativas: " + count;
        }
        
        else if (userAnswer != computerNumber){
            return "resposta errada! ";
        }
        return null;
    }
}
