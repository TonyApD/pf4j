package org.pf4j.interfaces;

import javafx.scene.Parent;
import org.pf4j.ExtensionPoint;

public interface IPlugin extends ExtensionPoint {

    Parent showVraagAfnemen(String vraagModel, IPluginStudentCallback callback);

    Parent showVraagNakijken(String vraagModel, String nakijkModel, String gegevenAntwoord);

    Parent showVraagOpstellen(String vraagModel, String nakijkModel, IPluginDocentCallback callback);

    int verifyAntwoord(String nakijkModel, String gegevenAntwoord);

    String convertVraagToStructuredText(String vraagModel, String gegevenAntwoord);

    String getNakijkmodel();

    String getVraagModel();
}
