/*
* generated by Xtext
*/
package cs.ua.edu.se.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MapRedoopAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.tokens");
	}
}
