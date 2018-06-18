package framework;

public class Helper {

    public static String getRandomText() {
        int randomNumber = (int) (Math.random() * 1000);
        String randomText = "Neca-" + randomNumber;
        return randomText;
    }

}
