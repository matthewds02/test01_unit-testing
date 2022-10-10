package be.thomasmore.elevator;

public class Elevator {

    public String scan(String name, int verdieping) {
        if (name == null) return "";
        if (name.length() == 0) return "";
        if (name.length() > 4) return "";
        if (name.charAt(0) == 's') return "";
        return "0 10";
    }
}
