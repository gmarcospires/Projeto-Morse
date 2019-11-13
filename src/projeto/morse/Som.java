/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.morse;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author marco
 */
public class Som {
    public static void AUDIO1() throws MalformedURLException, LineUnavailableException, UnsupportedAudioFileException, IOException, InterruptedException {
        //URL oUrl = new URL("https://www.soundjay.com/button/sounds/beep-06.wav");//long beep
        File oUrl = new File("E:/Pessoal/Projeto Morse/beep-1.wav");
        Clip oClip = AudioSystem.getClip();
        AudioInputStream oStream = AudioSystem.getAudioInputStream(oUrl);
        oClip.open(oStream);
        oClip.loop(0);
        Thread.sleep(400);
    }

    public static void AUDIO2() throws MalformedURLException, LineUnavailableException, UnsupportedAudioFileException, IOException, InterruptedException {
        //URL oUrl = new URL("file://G:/IFMG/IFMG/BSI/PAA/TRABALHO%20FINAL/TESTE%20SOM%202/beep-1.wav");//short beep
        File oUrl = new File("E:/Pessoal/Projeto Morse/beep-7.wav");
        Clip oClip = AudioSystem.getClip();
        AudioInputStream oStream = AudioSystem.getAudioInputStream(oUrl);
        oClip.open(oStream);
        oClip.loop(0);
        Thread.sleep(400);
    }

    protected static void SOM(char l) throws LineUnavailableException, UnsupportedAudioFileException, IOException, MalformedURLException, InterruptedException {
        if (l == 'A') { //a = *-
            AUDIO2();
            AUDIO1();
        } else if (l == 'B') { //b = -***
            AUDIO1();
            AUDIO2();
            AUDIO2();
            AUDIO2();
            AUDIO2();
        } else if (l == 'C') {//-.-.
            AUDIO1();//LONGO
            AUDIO2();//CURTO
            AUDIO1();
            AUDIO2();
        } else if (l == 'D') {//-..
            AUDIO1();
            AUDIO2();
            AUDIO2();
        } else if (l == 'E') {//.
            AUDIO2();
        } else if (l == 'F') {//..-.
            AUDIO2();
            AUDIO2();
            AUDIO1();
            AUDIO2();
        } else if (l == 'G') {//--.
            AUDIO1();
            AUDIO1();
            AUDIO2();
        } else if (l == 'H') {//....
            AUDIO2();
            AUDIO2();
            AUDIO2();
            AUDIO2();
        } else if (l == 'I') {//..
            AUDIO2();
            AUDIO2();//curto
        } else if (l == 'J') {//.---
            AUDIO2();
            AUDIO1();
            AUDIO1();
            AUDIO1();
        } else if (l == 'K') {//-.-
            AUDIO1();
            AUDIO2();
            AUDIO1();
        } else if (l == 'L') {//.-..
            AUDIO2();
            AUDIO1();
            AUDIO2();
            AUDIO2();
        } else if (l == 'M') {//--
            AUDIO1();
            AUDIO1();
        } else if (l == 'N') {//-.
            AUDIO1();//longo
            AUDIO2();
        } else if (l == 'O') {//---
            AUDIO1();
            AUDIO1();
            AUDIO1();
        } else if (l == 'P') {//.--.
            AUDIO2();
            AUDIO1();
            AUDIO1();
            AUDIO2();
        } else if (l == 'Q') {//--.-
            AUDIO1();
            AUDIO1();
            AUDIO2();
            AUDIO1();
        } else if (l == 'R') {//.-.
            AUDIO2();
            AUDIO1();
            AUDIO2();
        } else if (l == 'S') {//...
            AUDIO2();
            AUDIO2();
            AUDIO2();
        } else if (l == 'T') {//-
            AUDIO1();
        } else if (l == 'U') {//..-
            AUDIO2();
            AUDIO2();
            AUDIO1();//longo
        } else if (l == 'V') {//...-
            AUDIO2();
            AUDIO2();
            AUDIO2();
            AUDIO1();
        } else if (l == 'W') {//.--
            AUDIO2();
            AUDIO1();
            AUDIO1();
        } else if (l == 'X') {//-..-
            AUDIO1();
            AUDIO2();
            AUDIO2();
            AUDIO1();
        } else if (l == 'Y') {//-.--
            AUDIO1();
            AUDIO2();
            AUDIO1();
            AUDIO1();
        } else if (l == 'Z') {//--..
            AUDIO1();
            AUDIO1();
            AUDIO2();
            AUDIO2();
        } else if (l == '0') {//-----
            AUDIO1();
            AUDIO1();
            AUDIO1();
            AUDIO1();
            AUDIO1();
        } else if (l == '1') {//.----
            AUDIO2();
            AUDIO1();
            AUDIO1();
            AUDIO1();
            AUDIO1();
        } else if (l == '2') {//..---
            AUDIO2();
            AUDIO2();
            AUDIO1();
            AUDIO1();
            AUDIO1();
        } else if (l == '3') {//...--
            AUDIO2();
            AUDIO2();
            AUDIO2();
            AUDIO1();
            AUDIO1();
        } else if (l == '4') {//....-
            AUDIO2();
            AUDIO2();
            AUDIO2();
            AUDIO2();
            AUDIO1();
        } else if (l == '5') {//.....
            AUDIO2();
            AUDIO2();
            AUDIO2();
            AUDIO2();
            AUDIO2();
        } else if (l == '6') {//-....
            AUDIO1();
            AUDIO2();
            AUDIO2();
            AUDIO2();
            AUDIO2();
        } else if (l == '7') {//--...
            AUDIO1();
            AUDIO1();
            AUDIO2();
            AUDIO2();
            AUDIO2();
        } else if (l == '8') {//---..
            AUDIO1();
            AUDIO1();
            AUDIO1();
            AUDIO2();
            AUDIO2();
        } else if (l == '9') {
            AUDIO1();//longo
            AUDIO1();
            AUDIO1();
            AUDIO1();
            AUDIO2();
        } else if (l == ' ') {
            Thread.sleep(1000);
        } else if (l == '.') {
            AUDIO2();
            AUDIO1();
            AUDIO2();
            AUDIO1();
            AUDIO2();
            AUDIO1();
        } else if (l == ',') {
            AUDIO1();
            AUDIO1();
            AUDIO2();
            AUDIO2();
            AUDIO1();
            AUDIO1();
        } else if (l == '?') {
            AUDIO2();
            AUDIO2();
            AUDIO1();
            AUDIO1();
            AUDIO2();
            AUDIO2();
        } else if (l == '!') {
            AUDIO1();
            AUDIO2();
            AUDIO1();
            AUDIO2();
            AUDIO1();
            AUDIO1();
        } else if (l == '/') {
            AUDIO1();
            AUDIO2();
            AUDIO2();
            AUDIO1();
            AUDIO2();
        } else if (l == ':') {
            AUDIO1();
            AUDIO1();
            AUDIO1();
            AUDIO2();
            AUDIO2();
            AUDIO2();
        } else if (l == ';') {
            AUDIO1();
            AUDIO2();
            AUDIO1();
            AUDIO2();
            AUDIO1();
            AUDIO2();
        } else if (l == '=') {
            AUDIO1();
            AUDIO2();
            AUDIO2();
            AUDIO2();
            AUDIO1();
        } else if (l == '@') {
            AUDIO2();
            AUDIO1();
            AUDIO1();
            AUDIO2();
            AUDIO1();
            AUDIO2();
        } else if (l == 'Á') {
            AUDIO2();
            AUDIO1();
            AUDIO2();
            AUDIO1();
            AUDIO1();
            AUDIO1();
            AUDIO2();
            AUDIO1();
            AUDIO1();
            AUDIO2();
        } else if (l == 'É') {
            AUDIO2();
            AUDIO2();
            AUDIO1();
            AUDIO1();
            AUDIO1();
            AUDIO2();
            AUDIO1();
            AUDIO1();
            AUDIO2();
        } else if (l == 'Í') {
            AUDIO2();
            AUDIO2();
            AUDIO2();
            AUDIO1();
            AUDIO1();
            AUDIO1();
            AUDIO2();
            AUDIO1();
            AUDIO1();
            AUDIO2();
        } else if (l == 'Ó') {
            AUDIO1();
            AUDIO1();
            AUDIO1();
            AUDIO2();
            AUDIO1();
            AUDIO1();
            AUDIO1();
            AUDIO2();
            AUDIO1();
            AUDIO1();
            AUDIO2();
        } else if (l == 'Ú') {
            AUDIO2();
            AUDIO2();
            AUDIO1();
            AUDIO2();
            AUDIO1();
            AUDIO1();
            AUDIO1();
            AUDIO2();
            AUDIO1();
            AUDIO1();
            AUDIO2();
        } else if (l == 'Ã') {
            AUDIO2();
            AUDIO1();
            AUDIO2();
            AUDIO2();
            AUDIO1();
            AUDIO1();
            AUDIO2();
            AUDIO1();
            AUDIO1();
            AUDIO2();
        } else if (l == 'Õ') {
            AUDIO1();
            AUDIO1();
            AUDIO1();
            AUDIO2();
            AUDIO2();
            AUDIO1();
            AUDIO1();
            AUDIO2();
            AUDIO1();
            AUDIO1();
            AUDIO2();
        } else if (l == 'Â') {
            AUDIO2();
            AUDIO1();
            AUDIO2();
            AUDIO2();
            AUDIO2();
            AUDIO1();
            AUDIO2();
            AUDIO1();
            AUDIO1();
            AUDIO2();
        } else if (l == 'Ê') {
            AUDIO2();
            AUDIO2();
            AUDIO2();
            AUDIO2();
            AUDIO1();
            AUDIO2();
            AUDIO1();
            AUDIO1();
            AUDIO2();
        } else if (l == 'Î') {
            AUDIO2();
            AUDIO2();
            AUDIO2();
            AUDIO2();
            AUDIO2();
            AUDIO1();
            AUDIO2();
            AUDIO1();
            AUDIO1();
            AUDIO2();
        } else if (l == 'Ô') {
            AUDIO1();
            AUDIO1();
            AUDIO1();
            AUDIO2();
            AUDIO2();
            AUDIO2();
            AUDIO1();
            AUDIO2();
            AUDIO1();
            AUDIO1();
            AUDIO2();
        } else if (l == 'Û') {
            AUDIO2();
            AUDIO2();
            AUDIO1();
            AUDIO2();
            AUDIO2();
            AUDIO2();
            AUDIO1();
            AUDIO2();
            AUDIO1();
            AUDIO1();
            AUDIO2();
        }
    }
}
