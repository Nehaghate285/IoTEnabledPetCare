/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Validator;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Neha Ghate
 */
public class Validator {

    public static boolean isValidInteger(String str) {
        int a;
        try {
            a = Integer.parseInt(str);
            return true;
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Please enter a number", "warning", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public static boolean isValidFloat(String str) {
        float a;
        try {
            a = Float.parseFloat(str);
            return true;
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Please enter a number", "warning", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public static boolean isStringValid(String str) {
        if (str.trim().isEmpty()) {
            return false;
        } else {
            return true;
        }

    }

    public static boolean isWithinRange(Date testDate, Date startDate, Date endDate) {
        //return !(testDate.before(startDate) || testDate.after(endDate));
        if (startDate.equals(endDate)) {
           return false;
        } else {
            return true;
        }

    }
    public static boolean isValidatePhoneNumber(String sPhoneNumber) {

      //String sPhoneNumber = "605-88899991";
      //String sPhoneNumber = "605-888999A";

      Pattern pattern = Pattern.compile("\\d{3}-\\d{7}");
      Matcher matcher = pattern.matcher(sPhoneNumber);
      
      if (matcher.matches()) {
    	  return true;
      }
      else
      {
          return false;
      }
 }


    public static boolean isValidEmailAddress(String email) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
    }

    public static long getDifferenceDays(Date d1, Date d2) {
        long diff = d1.getTime() - d2.getTime();
   // System.out.println(TimeUnit.MINUTES.convert(diff, TimeUnit.MILLISECONDS));
        //add for hours and days!
        return TimeUnit.MINUTES.convert(diff, TimeUnit.MILLISECONDS);
    }

}
