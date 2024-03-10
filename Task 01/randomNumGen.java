import java.util.*;

class randomNumGen{

    public static int numberGen(int upperBound, int lowerBound){
        int randomNum = 0;
        randomNum = (int)(Math.random() * ((upperBound - lowerBound) + 1) + lowerBound);
        return randomNum;
    }
    public static void main(String[] args){
        int upperBound = 100;
        int lowerBound = 1;
        int rand = numberGen(upperBound,lowerBound);
        System.out.println(rand);
        
    }
}