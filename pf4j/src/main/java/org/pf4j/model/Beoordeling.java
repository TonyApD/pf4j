package org.pf4j.model;

import java.util.ArrayList;
import java.util.List;

public class Beoordeling {

    private Integer punten;
    private List<String> aantekeningen;

    public Beoordeling() {
        aantekeningen = new ArrayList<>();
    }

    public Beoordeling(Integer punten, List<String> aantekeningen) {
        this.punten = punten;
        this.aantekeningen = aantekeningen;
    }

    public Integer getPunten() {
        return punten;
    }

    public void setPunten(Integer punten) {
        this.punten = punten;
    }

    public List<String> getAantekeningen() {
        return aantekeningen;
    }

    public void setAantekeningen(List<String> aantekeningen) {
        this.aantekeningen = aantekeningen;
    }

    public void addAantekening(String aantekening) {
        aantekeningen.add(aantekening);
    }
}
