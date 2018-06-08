package org.pf4j.interfaces;

public interface IPluginStudentCallback {

    /**
     * Send the answer of the student to the desktop application
     *
     * @param gegevenAntwoord the answer of the student
     */
    void slaGegevenAntwoordOp(String gegevenAntwoord);
}
