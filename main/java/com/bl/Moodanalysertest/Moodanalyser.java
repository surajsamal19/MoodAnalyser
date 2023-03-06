package com.bl.Moodanalysertest;

public class Moodanalyser {

        String message;

        public Moodanalyser(){

        }

        public Moodanalyser(String message) {
            this.message = message;
        }

        public String analyseMood(){

            try{
                if (message.length() == 0){

                    throw new Moodanalyser(MoodanalyserException.ExceptionType.ENTERED_EMPTY,"Enter Proper Message , Empty Not Allowed");

                }
                if (this.message.contains("SAD")){
                    return "SAD";
                }
                else{
                    return "HAPPY";
                }

            }
            catch (NullPointerException e){

                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL,"Entered Message Cannot Be Null");

            }
        }
    }
}
