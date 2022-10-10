package be.thomasmore.elevator;

public class Elevator {

    public String scan(String name) {
        if (name == null) return "";
        if (name.length() == 0) return "";
        if (name.length() > 3) return "";
        if (name.charAt(0) == '0') return "";
        if (name.charAt(0) == 'S') {
            return "0 1 2 3 4 5 6 7 8 9 10";
        }
        else {
            String firstNumber = "" + name.charAt(0);
            return "0 " + firstNumber + " 10";
        }
    }
}
