package tts;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;


/**
 *
 * @author rishabh kumar
 */
public class TextToSpeech {
    
    private static final String VOICENAME="kevin";     
    String workingDir;
     
     public TextToSpeech(){
     workingDir = System.getProperty("user.dir");    //extracting current working directory
     }
    /////////////////////////////////////////////////////////////////////////////
    
    public void mySpeak(String text){         //text-to-speech synthesizer
        System.setProperty("mbrola.base", workingDir+"\\src\\mbrola\\mbrola");
    Voice voice;
    VoiceManager vm=VoiceManager.getInstance();
    voice=vm.getVoice(VOICENAME);
    voice.allocate();
    voice.speak(text);
    }
}
