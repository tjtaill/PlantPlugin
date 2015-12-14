package plantplugin;


import sidekick.SideKickParsedData;

import javax.swing.tree.DefaultMutableTreeNode;

public class PlantSideKickParsedData extends SideKickParsedData {

    public DefaultMutableTreeNode boxes = null;
    public DefaultMutableTreeNode particpants = null;
    public DefaultMutableTreeNode groups = null;
    public DefaultMutableTreeNode messages = null;


    public PlantSideKickParsedData(String fileName) {
        super(fileName);
    }
}
