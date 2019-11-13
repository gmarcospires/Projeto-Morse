/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.morse;

/**
 *
 * @author marco
 */

    
    final class Simbolo{
        public final char normal;
            public final String morse;

            Simbolo(char normal, String morse) {
                this.normal = normal;
                this.morse = morse;
            }
             protected static final Simbolo[] SIMBOLOS = new Simbolo[]{
            new Simbolo('A', ".-"),
            new Simbolo('B', "-..."),
            new Simbolo('C', "-.-."),
            new Simbolo('D', "-.."),
            new Simbolo('E', "."),
            new Simbolo('F', "..-."),
            new Simbolo('G', "--."),
            new Simbolo('H', "...."),
            new Simbolo('I', ".."),
            new Simbolo('J', ".---"),
            new Simbolo('K', "-.-"),
            new Simbolo('L', ".-.."),
            new Simbolo('M', "--"),
            new Simbolo('N', "-."),
            new Simbolo('O', "---"),
            new Simbolo('P', ".--."),
            new Simbolo('Q', "--.-"),
            new Simbolo('R', ".-."),
            new Simbolo('S', "..."),
            new Simbolo('T', "-"),
            new Simbolo('U', "..-"),
            new Simbolo('V', "...-"),
            new Simbolo('W', ".--"),
            new Simbolo('X', "-..-"),
            new Simbolo('Y', "-.--"),
            new Simbolo('Z', "--.."),
            new Simbolo('0', "-----"),
            new Simbolo('1', ".----"),
            new Simbolo('2', "..---"),
            new Simbolo('3', "...--"),
            new Simbolo('4', "....-"),
            new Simbolo('5', "....."),
            new Simbolo('6', "-...."),
            new Simbolo('7', "--..."),
            new Simbolo('8', "---.."),
            new Simbolo('9', "----."),
            new Simbolo(' ', "   "),
            new Simbolo('.', "·-·-·-"),
            new Simbolo(',', "--··--"),
            new Simbolo('?', "··--··"),
            new Simbolo('!', "-·-·--"),
            new Simbolo('/', "-··-·"),
            new Simbolo(':', "---···"),
            new Simbolo(';', "-·-·-·"),
            new Simbolo('=', "-···-"),
            new Simbolo('@', "·--·-·"),
            //OBS ACENTO AGUDO É .---.--.
            new Simbolo('Á', ".-.---.--."),
            new Simbolo('É', "..-.---.--."),
            new Simbolo('Í', "...-.---.--."),
            new Simbolo('Ó', "---.-.---.--."),
            new Simbolo('Ú', "..-.-.---.--."),
            //OBS TIU é ..--.--.
            new Simbolo('Ã', ".-..--.--."),
            new Simbolo('Õ', "---..--.--."),
            //OBS acento circunflexo é ...-.--.
            new Simbolo('Â', ".-...-.--."),
            new Simbolo('Ê', "....-.--."),
            new Simbolo('Î', ".....-.--."),
            new Simbolo('Ô', "---...-.--."),
            new Simbolo('Û', "..-...-.--.")
        };
    }
