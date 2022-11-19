package com.karabass18;

public class Main {
    public static void main(String[] args) {
        System.out.println("Home work 4");

        byte varByte01 = 1, varByte02 = 127;
        short varShort01 = 1, varShort02 = 32767;
        int varInt01 = 1, varInt02 = 2147483647;
        long varLong01 = 1L, varLong02 = 7000000000000L;
        float varFloat01 = 1.0f, varFloat02 = 0.3f;
        double varDouble01 = 1.0d, varDouble02 = 0.009d;
        boolean varBool;
        char varChar = '!';
        String varString = "Mazzy";

        System.out.println("jast \"-\" " + (varByte02 - varByte01));
        System.out.println(varShort02 + " + " + varShort01 + "= ...");
        varShort01 = (short) (varShort02 + varShort01);
        System.out.println(varShort01 + "!!!");
        System.out.println("and " + varInt02 + " + " + varInt01 + "= ...");
        varInt02 = varInt02 + varInt01;
        System.out.println(varInt02 + "  BINGO");
        varInt01 = 20;
        System.out.println("Int with Double  " + varInt01 * varDouble02);
        System.out.println("long " + (varLong02 - varLong01));
        System.out.println("/ " + (varFloat01 / varFloat02));
        System.out.println("% " + (varFloat01 % varFloat02));
        varBool = varDouble01 > varDouble02;
        if (varBool) {
            System.out.println(varString + varChar + varChar + varChar);
        }
    }
}