package org.example;

public class Wild {
    String firstname;
    boolean aware;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public boolean isAware() {
        return aware;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public String whoIAm(){
        String awareString;
        if (aware){
            awareString = "je suis aware";
        }else {
            awareString = "je ne suis pas aware";
        }
        return "Je m'appelle " +firstname + " et " + awareString;
    };
}
