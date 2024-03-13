
package Models;

public class LoginSystem {

  public String generateCaptcha() {
        String capChar = "ABCDEFGHJKLMNOPQRSTUVWSYZabcdefghijklmnopqrstuvwsyz0123456789";
        SecureRandom cap = new SecureRandom();
        StringBuilder captcha = new StringBuilder();
        for (int i = 0; i <= 6; i++) {
            int index = cap.nextInt(capChar.length());
            captcha.append(capChar.charAt(index));

        }
        return Captcha.toString();
    }
    
    public String checkCaptch(String input, String generateCaptcha){
        if(input.equals(generateCaptcha))
            return "Captcha is valid";
        else 
            return "InvalidCaptcha. Pls try again.";
    }
    
}
