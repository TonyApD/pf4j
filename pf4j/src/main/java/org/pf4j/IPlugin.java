package org.pf4j;

import javafx.scene.Scene;

public interface IPlugin extends ExtensionPoint {

    void showVraagAfnemen(Scene scene);

    String getAntwoord();

    void showVraagNakijken(Scene scene);

    void showVraagOpstellen(Scene scene);

    String getVraag();

    int verifyAntwoord(String correctAntwoord, String gegevenAntwoord);

    String getNakijkmodelStructure();

    String convertVraagToStructuredText();
}
