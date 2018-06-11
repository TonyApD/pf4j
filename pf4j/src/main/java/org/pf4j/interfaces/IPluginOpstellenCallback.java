package org.pf4j.interfaces;

public interface IPluginOpstellenCallback {

    /**
     * Sends the question that has been composed to the desktop application
     *
     * @param vraagEigenschappen the question with its properties
     * @param nakijkmodel        the structure of the correction prescription
     */
    void slaOpgesteldeVraagOp(String vraagEigenschappen, String nakijkmodel);
}
