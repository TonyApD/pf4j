package org.pf4j.interfaces;

import javafx.scene.Parent;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.pf4j.ExtensionPoint;

import java.util.List;

public interface IPlugin extends ExtensionPoint {

    /**
     * Build the view for displaying the question to be filled in
     *
     * @param vraagModel the model of the question to be shown
     * @param callback   the callback implementation to send the answer back to the desktop application
     * @return the view which shows the process for filling in the question
     */
    Parent showVraagAfnemen(String vraagModel, IPluginStudentCallback callback);

    /**
     * Build the view for displaying the process for checking a students answer
     *
     * @param vraagModel      the model of the question to be shown
     * @param nakijkModel     the model of the question prescription
     * @param gegevenAntwoord the given answer by the student
     * @return the view which shows the process for checking student answers
     */
    Parent showVraagNakijken(String vraagModel, String nakijkModel, String gegevenAntwoord);

    /**
     * @param vraagModel  the model of the question to be shown
     * @param nakijkModel the model of the question prescription
     * @param callback
     * @return
     */
    Parent showVraagOpstellen(String vraagModel, String nakijkModel, IPluginDocentCallback callback);

    /**
     * Checks the students answer against computed solutions
     *
     * @param vraagModel      the question with its properties
     * @param nakijkModel     the correction prescription
     * @param gegevenAntwoord the answer given by the student
     * @return A JSON output with the mistakes of the student and the number of points earned by the student
     */
    String verifyAntwoord(String vraagModel, String nakijkModel, String gegevenAntwoord);

    /**
     * Convert the question and the answer of the student to PDF format
     *
     * @param document        the document on which the pages should be added
     * @param vraagModel      the question with its properties
     * @param gegevenAntwoord the given answer by the student
     * @return A list of pages which should be included in the document
     */
    List<PDPage> convertVraagToStructuredText(PDDocument document, String vraagModel, String gegevenAntwoord,
                                              String comments, int points);

    /**
     * Gives the parsed data that's necessary for the correction prescription
     *
     * @return the parsed nakijkmodel
     */
    String getNakijkmodel();

    /**
     * Gives the parsed structure for the question
     *
     * @return the parsed question
     */
    String getVraagModel();
}
