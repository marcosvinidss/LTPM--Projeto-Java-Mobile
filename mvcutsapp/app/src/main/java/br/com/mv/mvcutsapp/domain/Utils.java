package br.com.mv.mvcutsapp.utils;

import android.util.Patterns;

import java.text.SimpleDateFormat;
import java.util.Date;



public class Utils {

    
    public static boolean isValidEmail(String email) {
        return email != null && Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

   
    public static boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber != null && Patterns.PHONE.matcher(phoneNumber).matches();
    }

   
    public static String formatDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return dateFormat.format(date);
    }

    
    public static boolean isValidPassword(String password) {
        return password != null && password.length() >= 6;
    }

   
    public static int parseInt(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return -1; 
        }
    }

    
    public static double parseDouble(String value) {
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            return -1.0; 
        }
    }

    public static String formatMessage(String title, String message) {
        return title + ": " + message;
    }

    public static boolean isNotEmpty(String value) {
        return value != null && !value.trim().isEmpty();
    }
}
