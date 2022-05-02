package com.bridgelabz.junittesting;
/*
 * Author: Prasad
 * Program to analyse mood
 */
public class MoodAnalyser {
    public static String analyseMood(String mood){
        if(mood.toLowerCase().contains("happy")){
            return "Entry successful";
        }
        else if(mood.toLowerCase().contains("sad")){
            return "Entry failed";
        }
        else
            return null;
    }
}
