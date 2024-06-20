package org.example;

public class Classroom {
    public static void main(String[] args) {
        Wild jc = new Wild();
        Wild henry = new Wild();

        jc.setFirstname("Jean-claude");
        jc.setAware(true);
        henry.setFirstname("Henry");
        henry.setAware(false);
        System.out.println(jc.whoIAm());
        System.out.println(henry.whoIAm());
    }
}