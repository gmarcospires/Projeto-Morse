/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.morse;

import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;

/**
 *
 * @author marco
 */
public class Conversao {
    
    public static String morse(String normal) throws IOException, IOException, InterruptedException, IOException, IOException, IOException, InterruptedException, IOException, IOException, IOException, IOException, IOException, LineUnavailableException, UnsupportedAudioFileException {
            StringBuilder textMorse = new StringBuilder();
            char letraNormal[] = normal.toUpperCase().toCharArray();
            Thread.sleep(200);
            for (int i = 0; i < normal.length(); i++) {
                Som.SOM(letraNormal[i]);
                if (i == 0) {
                    Thread.sleep(200);
                }
                if (letraNormal[i] != ' ') {
                    Thread.sleep(600);
                }
                if (textMorse.length() > 0) {
                    textMorse.append(" ");
                }
                String m = letraMorse(letraNormal[i]);
                textMorse.append(m);
            }
            return textMorse.toString();
        }

        public static String normal(String morse) {
            StringBuilder textNormal = new StringBuilder();
            String[] palavrasMorse = morse.split("\\Q   \\E");
            for (String palavraMorse : palavrasMorse) {
                if (textNormal.length() > 0) {
                    textNormal.append(" ");
                }
                String[] letrasMorse = palavraMorse.trim().split(" ");
                for (String letraMorse : letrasMorse) {
                    textNormal.append(letraNormal(letraMorse));
                }
            }
            return textNormal.toString();
        }

        private static String letraMorse(char normal) {
            for (Simbolo simbolo : Simbolo.SIMBOLOS) {
                if (simbolo.normal == normal) {
                    return simbolo.morse;
                }
            }
            JOptionPane.showMessageDialog(null, "Símbolo inválido: \" "+ normal +  " \"","ERRO",JOptionPane.ERROR_MESSAGE);
            throw new IllegalArgumentException("Símbolo inválido: \" " + normal + " \"");
        }

        private static char letraNormal(String morse) {
            for (Simbolo simbolo : Simbolo.SIMBOLOS) {
                if (simbolo.morse.equals(morse)) {
                    return simbolo.normal;
                }
            }
           JOptionPane.showMessageDialog(null, "Símbolo inválido: \" " + morse + " \" ","ERRO",JOptionPane.ERROR_MESSAGE);
            throw new IllegalArgumentException("Símbolo inválido: \" " + morse + " \" ");
        } 
    }  
