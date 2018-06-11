package org.pf4j.interfaces;

import org.pf4j.model.Beoordeling;

public interface IPluginNakijkenCallback {

    /**
     * Sends the result to the desktop application
     * @param beoordeling the result to be sent to the application
     */
    void slaBeoordelingOp(Beoordeling beoordeling);

}
