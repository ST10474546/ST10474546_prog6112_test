
package com.mycompany.st10474546progtests2.Question2;


class CricketRunsScored extends Cricket implements ICricket {
    public CricketRunsScored(String batsman, String stadium, int runsScored) {
        super(batsman, stadium, runsScored);
    }

    // Implement interface methods
    @Override
    public String getBatsman() {
        return batsman;
    }

    @Override
    public String getStadium() {
        return stadium;
    }

    @Override
    public int getRunsScored() {
        return runsScored;
    }
}

