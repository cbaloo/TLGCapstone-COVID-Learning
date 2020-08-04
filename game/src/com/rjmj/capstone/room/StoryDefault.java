package com.rjmj.capstone.room;

import java.util.Scanner;

public class StoryDefault implements StoryRoom{

    Scanner scanner;
    private String nextAction;

    @Override
    public void enter(Scanner scanner) {
        this.scanner = scanner;
        System.out.println("*** Default *** What would you like to do"); //TODO remove *** Default *** for testing purpose only
        freeAns();
    }

    private void freeAns(){
        String action = scanner.nextLine();
        setNextAction(action);
    }

    /**
     * Set Action (e.g. "talk", "move right") <- This can be user input
     * */
    private void setNextAction(String nextAction){
        this.nextAction = nextAction;
    }

    @Override
    public String getNextAction() {
        return nextAction;
    }
}
