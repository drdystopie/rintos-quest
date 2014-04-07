package voice;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.speech.AudioException;
import javax.speech.Central;
import javax.speech.EngineException;
import javax.speech.EngineList;
import javax.speech.EngineStateError;
import javax.speech.recognition.RecognizerModeDesc;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;


public class Main {
	 private SynthesizerModeDesc required;
	 private static Synthesizer synth;
	 

	public static void main(String[] args) throws IllegalArgumentException, EngineException {
		
		   try {
			   
			    synth = Central.createSynthesizer(new SynthesizerModeDesc(Locale.US));
	            System.out.println(Locale.getDefault());
	            synth.allocate();
	            synth.resume();
	            
	            synth.speakPlainText("Who's that Pokemon ?",null);
	            
	            
	            synth.waitEngineState(Synthesizer.QUEUE_EMPTY);
	            synth.deallocate();
	            
	            System.out.println(voiceRecognizer.isRecognitionEngine());
	            
	        } catch (InterruptedException | IllegalArgumentException | EngineException | EngineStateError | AudioException ex) {
	            Logger.getLogger("ss").log(Level.SEVERE, null, ex);
	        }
	    }

	}