package com.white.cloak.solution;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String input = "anc.asd@gmail.com";
        System.out.println("input: " + input);
        EmailMasker emailMasker = new EmailMasker();
        String result = emailMasker.maskEmail(input);
        System.out.println("result: " + result);
    }
}
