package org.axdt.as3.ui.contentassist.antlr;

import org.antlr.runtime.IntStream;
import org.antlr.runtime.RecognitionException;

/**
 * This parser class is a provisional fix for an issue described at
 * https://bugs.eclipse.org/bugs/show_bug.cgi?id=320941
 * that is already fixed in HEAD however not yet in Xtext 1.0
 * 
 * The code is a copy of
 * @see org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class DFA extends org.antlr.runtime.DFA {
	
	@Override
	public int predict(IntStream input) throws RecognitionException {
		try {
			getRecognizer().beginDFAPrediction();
			return super.predict(input);
		} finally {
			getRecognizer().endDFAPrediction();
		}
	}
	
	protected AbstractInternalContentAssistParser getRecognizer() {
		return (AbstractInternalContentAssistParser) recognizer;
	}

}