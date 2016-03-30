/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author Neha Ghate
 */
public class SendSMS {

    public static void sendNotificationMessage(UserAccount userAccount, WorkRequest request) {

        String requestUrl;
        String mobileNumber = userAccount.getEmployee().getPhoneNumber();
        String notification = request.getMessage();
        String noti = notification.replace(' ', '+');

        //System.out.println(notification);
        try {

            requestUrl = "https://api.tropo.com/1.0/sessions?action=create&token=11eb079bf3ee9b4f8e766fb566ba33bbba98202a1ed9497c744def895652ee5594a5a8d58030d4557b56805e&myString=" + noti +"+is+processed."+ "&myNumber=" + mobileNumber;
            System.out.println(requestUrl);

            URL url = new URL(requestUrl);
            HttpURLConnection uc = (HttpURLConnection) url.openConnection();

            System.out.println(uc.getResponseMessage());

            uc.disconnect();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }
    }

    public static void sendNotificationRegistered(String mobileNumber) {

        String requestUrl;
        //String mobileNumber = userAccount.getEmployee().getPhoneNumber();
        String notification = "Check+your+email,+petOnly+account+is+created";

        //System.out.println(notification);
        try {

           // requestUrl ="http://api.tropo.com/1.0/sessions?action=create&token=11eb079bf3ee9b4f8e766fb566ba33bbba98202a1ed9497c744def895652ee5594a5a8d58030d4557b56805e&myString="+ notification + "&myNumber=" + mobileNumber;
            //  requestUrl = "https://api.tropo.com/1.0/sessions?action=create&token=11eb079bf3ee9b4f8e766fb566ba33bbba98202a1ed9497c744def895652ee5594a5a8d58030d4557b56805e&myString="+ notification + "&myNumber=" + mobileNumber;
            requestUrl = "https://api.tropo.com/1.0/sessions?action=create&token=11eb079bf3ee9b4f8e766fb566ba33bbba98202a1ed9497c744def895652ee5594a5a8d58030d4557b56805e&myString=" + notification + "&myNumber=" + mobileNumber;
            System.out.println(requestUrl);

            URL url = new URL(requestUrl);
            HttpURLConnection uc = (HttpURLConnection) url.openConnection();

            System.out.println(uc.getResponseMessage());

            uc.disconnect();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }
    }

}
