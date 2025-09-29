
package com.mycompany.st10474546progtests2.Question2;


abstract class Cricket {
    protected String batsman;
    protected String stadium;
    protected int runsScored;

    // Constructor
    public Cricket(String batsman, String stadium, int runsScored) {
        this.batsman = batsman;
        this.stadium = stadium;
        this.runsScored = runsScored;
    }

    // Getter methods
    public String getBatsmanName() {
        return batsman;
    }

    public String getStadiumName() {
        return stadium;
    }

    public int getTotalRunsScored() {
        return runsScored;
    }
}


