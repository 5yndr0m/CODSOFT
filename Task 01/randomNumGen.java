import java.util.*;

class randomNumGen{

    public static int numberGen(int upperBound, int lowerBound){
        int randomNum = 0;
        randomNum = (int)(Math.random() * ((upperBound - lowerBound) + 1) + lowerBound);
        return randomNum;
    }
}