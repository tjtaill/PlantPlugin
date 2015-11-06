package plantplugin;

import errorlist.DefaultErrorSource;
import errorlist.ErrorSource;
import net.sourceforge.plantuml.syntax.SyntaxChecker;
import net.sourceforge.plantuml.syntax.SyntaxResult;
import org.gjt.sp.jedit.Buffer;
import org.gjt.sp.jedit.EditPlugin;
import org.gjt.sp.jedit.jEdit;

import java.util.List;

public class PlantPlugin extends EditPlugin {
    static DefaultErrorSource errorSource;

    public void start() {
        errorSource = new DefaultErrorSource("PlantPlugin", jEdit.getActiveView());
        ErrorSource.registerErrorSource( errorSource );
    }

    public void stop() {
        ErrorSource.unregisterErrorSource(errorSource);
    }

    public static boolean validatePlant(Buffer plantBuffer) {
        errorSource.clear();
        String plantSource = plantBuffer.getText();
        SyntaxResult syntaxResult = SyntaxChecker.checkSyntax(plantSource);
        if ( syntaxResult.isError() ) {
            String description = syntaxResult.getDescription();
            if ( null == description ) {
                List<String> suggest = syntaxResult.getSuggest();
                if ( ! suggest.isEmpty() ) {
                    StringBuilder builder = new StringBuilder();
                    for( String s : suggest ) {
                        builder.append( s );
                        builder.append( ' ' );
                    }
                    description = builder.toString();
                } else {
                    description = "";
                }
            }
            int line = syntaxResult.getErrorLinePosition();
            errorSource.addError(ErrorSource.ERROR, plantBuffer.getPath(),
                    line, 0, plantBuffer.getLineLength(line) - 1, description);
            return false;
        }
        return true;
    }
}
