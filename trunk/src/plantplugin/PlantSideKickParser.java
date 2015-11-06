package plantplugin;

import errorlist.DefaultErrorSource;
import org.gjt.sp.jedit.Buffer;
import sidekick.SideKickParsedData;
import sidekick.SideKickParser;

public class PlantSideKickParser extends SideKickParser {

    public PlantSideKickParser() {
        super("plant");
    }

    @Override
    public SideKickParsedData parse(Buffer buffer, DefaultErrorSource defaultErrorSource) {
        PlantSideKickParsedData data = new PlantSideKickParsedData( buffer.getPath() );
        boolean valid = PlantPlugin.validatePlant(buffer);
        if ( valid ) {
            
        }
        return data;
    }
}
