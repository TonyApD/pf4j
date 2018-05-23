package org.pf4j.interfaces;

import javafx.scene.Scene;
import org.pf4j.ExtensionPoint;

public interface IPlugin extends ExtensionPoint {

    void showVraagAfnemen(Scene parent, String vraagEigenschappen, IPluginStudentCallback callback);

    void showVraagNakijken(Scene parent, String vraagEigenschappen, String nakijkModel, String gegevenAntwoord);

    void showVraagOpstellen(Scene parent, String vraagEigenschappen, String nakijkModel, IPluginDocentCallback callback);

    int verifyAntwoord(String nakijkModel, String gegevenAntwoord);

    String convertVraagToStructuredText(String vraagEigenschappen, String gegevenAntwoord);

    String getNakijkmodelStructure();
}
