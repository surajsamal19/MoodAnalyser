package com.bl.Moodanalysertest;

import org.junit.jupiter.api.Assertions;

public class Moodanalysertest {
    Moodanalyser moodAnalyzer = new Moodanalyser("");
    public void testMoodAnalysis1() throws MoodanalyserException{
        String mood = moodAnalyzer.analyseMood();
        Assertions.assertEquals(mood, "HAPPY");
    }
}
