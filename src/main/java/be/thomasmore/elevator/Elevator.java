package be.thomasmore.elevator;

import java.util.ArrayList;

public class Elevator {

    public String scan(String name, int currentLevel) {
        if (name == null) return "";
        if (name.length() == 0) return "";
        if (name.length() > 3) return "";
        if (name.charAt(0) == '0') return "";
        if (name.charAt(0) == 'S') {
            return "" + activeButtons(currentLevel);
        }
        if (name.charAt(0) > '0' & name.charAt(0) <= '9') {
            String firstNumber = "" + name.charAt(0);
            String currentNumber = "" + currentLevel;
            if (!firstNumber.equals(currentNumber)) {
                return "0 " + firstNumber + " 10";
            }
            return "0 10";
        }
        return "";
    }
    
    public Object activeButtons(int currentLevel){
        ArrayList<Integer> actieveKnoppenLift = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (currentLevel != i) {
                actieveKnoppenLift.add(i);
            }
        }
        return actieveKnoppenLift;
    }
}
