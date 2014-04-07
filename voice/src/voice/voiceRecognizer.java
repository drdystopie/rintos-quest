package voice;

import java.util.Locale;

import javax.speech.Central;
import javax.speech.EngineList;
import javax.speech.recognition.RecognizerModeDesc;

public class voiceRecognizer {

	public static Boolean isRecognitionEngine() {
		RecognizerModeDesc desc = new RecognizerModeDesc(Locale.ENGLISH,
				Boolean.TRUE);
		EngineList el = Central.availableRecognizers(desc);
		if (el.size() > 0) {
			return true;
		} else {
			return false;
		}
	}

}