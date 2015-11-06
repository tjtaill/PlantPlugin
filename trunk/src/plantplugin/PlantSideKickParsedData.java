package plantplugin;


import sidekick.SideKickParsedData;

import javax.swing.tree.DefaultMutableTreeNode;

public class PlantSideKickParsedData extends SideKickParsedData {

    public DefaultMutableTreeNode particpants = null;
    public DefaultMutableTreeNode messages = null;
    // TODO: do I need this ?
    public DefaultMutableTreeNode notes = null;

    public PlantSideKickParsedData(String fileName) {
        super(fileName);
    }
}
