import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FourthWeekTest {

    public static void main(String[] args) {
        // variable contoh
        String email = "example@example.com";
        String dateDMY = "18-02-2023";
        String dateFull = "Saturday, 02 February 18";
        String ipAddress = "192.168.0.1";

        // memvalidasi value dari variable contoh
        boolean checkEmail = isEmail(email);
        boolean checkDateDMY = isDateDMY(dateDMY);
        boolean checkDateFull = isDateFull(dateFull);
        boolean checkIpAddress = isIPAddress(ipAddress);

        System.out.printf("\nEmail yang anda masukan : %b\nEmail : %s\n", checkEmail, email);
        System.out.printf("\nTanggal format (dd-mm-yyyy) yang anda masukan : %b\nTanggal : %s\n", checkDateDMY, dateDMY);
        System.out.printf("\nTanggal format (dddd, dd-mmmm-yy) yang anda masukan : %b\nTanggal : %s\n", checkDateFull, dateFull);
        System.out.printf("\nIp address yang anda masukan : %b\nIp Address : %s\n", checkIpAddress, ipAddress);

    }
    // Method yang digunakan untuk memvalidasi value
    // menggunakan Pattern dan Matcher dalam library regex (Reguler Expression)

        // Email
        public static boolean isEmail(String input) {
            String regex = "^[\\w-]+@([\\w-]+\\.)+[\\w-]{2,4}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            return matcher.matches();
        }

        // Pattern tanggal (dd-mm-yyyy)
        public static boolean isDateDMY(String input) {
            String regex = "^\\d{2}-\\d{2}-\\d{4}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            return matcher.matches();
        }

        // Pattern tanggal (dddd, dd-mmmm-yy)
        public static boolean isDateFull(String input) {
            String regex = "^[a-zA-Z]+,\\s\\d{2}\\s[a-zA-Z]+\\s\\d{2}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            return matcher.matches();
        }

        // Ip Address
        public static boolean isIPAddress(String input) {
            String regex = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            return matcher.matches();
        }
    }