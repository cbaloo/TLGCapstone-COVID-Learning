package com.rjmj.capstone.character;

import java.util.Scanner;

public class Nelly implements Character, Color {
    private String questionAnswer;

    @Override
    public String askTheQuestionAndCollectInput() {
        String[] nellyInput = {
                ANSI_CYAN,
                "Nelly: \"To get you started here is a Syringe.  You will need to find the remaining items.\"",
                "Once you have all of the items required, the mix command will become available for you.",
                "Type Start or any other entry if you are ready to get started.",
                ANSI_RESET
        };

        try {
            for (String nelly : nellyInput) {
                Thread.sleep(SLEEP_DURATION_MS);
                System.out.println(nelly);
            }
        }
        catch(Exception e){
            somethingWentWrong(e);
            System.out.println("Please check at : \"Thread.sleep(SLEEP_DURATION_MS);\"");
        }

        Scanner sc = new Scanner(System.in);
        setQuestionAnswer(sc.next());
        return getQuestionAnswer();
    }

    @Override
    public String processQuestionAnswer(String questionAnswer) {
        System.out.println(ANSI_CYAN + "Good Luck!" + ANSI_RESET);
        return getItem();
    }

    public String getQuestionAnswer() {
        return questionAnswer;
    }

    public void setQuestionAnswer(String questionAnswer) {
        this.questionAnswer = questionAnswer;
    }

    public String getItem() {
        return "Syringe";
    }
}
