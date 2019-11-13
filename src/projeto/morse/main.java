/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.morse;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;

/**
 *
 * @author marco
 */


public class main {

    private static void entrarTexto(ArrayList texto) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream("texto.txt"), "UTF-8"));
        String buff = "0";
        //texto = new ArrayList<>();
        while (buffer.markSupported() && buff != null) {
            buff = buffer.readLine();
            if (buff != null) {
                texto.add(buff);
            }
        }
    }

    private static void entrarMorse(ArrayList texto) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream("texto.txt"), "UTF-8"));
        String buff = "0";
        //texto = new ArrayList<>();
        while (buffer.markSupported() && buff != null) {
            buff = buffer.readLine();
            if (buff != null) {
                texto.add(buff);
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException, LineUnavailableException, UnsupportedAudioFileException {
        // TODO code application logic here
        Object[] sel = {"Morse->Portugês","Portugês->Morse"};
        String mensagem,resposta;
        Object selecionado = JOptionPane.showInputDialog(null,"Escolha um item","Opção",JOptionPane.INFORMATION_MESSAGE,null,sel,sel[0]);
        if(selecionado.equals(sel[0]))
        {
            mensagem = JOptionPane.showInputDialog("Digite a mensagem em morse para ser traduzida:");
            resposta = Conversao.normal(mensagem);
        }
        else
        {
            mensagem = JOptionPane.showInputDialog("Digite a mensagem em Português para ser traduzida:");
            resposta = Conversao.morse(mensagem);
        }
        JOptionPane.showMessageDialog(null, "A mensagem traduzida é:  " + resposta);
        
    }
    
}
