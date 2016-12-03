package com.algonquincollege.doir0008.dungeonaccountant;

import java.util.ArrayList;

/**
 * Model a game character
 *
 * @author Ryan Doiron (doir0008@algonquinlive.com)
 */

public class GameCharacter {

    protected String charClass;
    protected int skill1Value;
    protected int skill2Value;
    protected int skill3Value;

    protected ArrayList<String> validClasses = new ArrayList<String>();

    protected void setCharClass() {
        validClasses.add("Warrior");
        validClasses.add("Rogue");
        validClasses.add("Mage");
        validClasses.add("Druid");
    }

    public GameCharacter() {
        setCharClass();
        charClass = "Warrior";
        skill1Value = 1;
        skill2Value = 1;
        skill3Value = 1;
    }

    public GameCharacter(
            String charClass,
            int skill1Value,
            int skill2Value,
            int skill3Value ) {
        setCharClass();
        this.charClass = charClass;
        this.skill1Value = skill1Value;
        this.skill2Value = skill2Value;
        this.skill3Value = skill3Value;
    }

    // getters
    public String getCharClass() { return charClass; }
    public int getSkill1Value() { return skill1Value; }
    public int getSkill2Value() { return skill2Value; }
    public int getSkill3Value() { return skill3Value; }

    //setters
    public void setCharClass(String charClass) {
        this.charClass = charClass;
    }

    public void setSkill1Value(int skill1Value) {
        this.skill1Value = skill1Value;
    }

    public void setSkill2Value(int skill2Value) {
        this.skill2Value = skill2Value;
    }

    public void setSkill3Value(int skill3Value) {
        this.skill3Value = skill3Value;
    }

}
