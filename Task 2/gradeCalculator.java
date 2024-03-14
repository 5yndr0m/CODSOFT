import java.util.*;

public class gradeCalculator {

    public static char gradeStu(double avg){
        char grade = '-';
        if(avg >= 75){
            grade = 'A';
        }
        else if(avg >= 65){
            grade = 'B';
        }
        else if(avg >= 50){
            grade = 'C';
        }
        else if(avg >= 35){
            grade = 'D';
        }
        else{
            grade = 'W';
        }
        return grade;
    }

    public static double average(int[] array, int subjects){
        double avg = 0;
        int sum = 0;
        sum = marksSum(array);
        avg = sum / subjects;
        return avg;
    }

    public static int marksSum(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of subjects : ");
        int subCount = scan.nextInt();
        int[] subjects = new int[subCount];

        for(int i = 0; i < subCount; i++){
            System.out.println("Enter marks for subject " + (i + 1));
            subjects[i] = scan.nextInt();
        }

        int sum = marksSum(subjects);
        double avg = average(subjects, subCount);
        char grade = gradeStu(avg);

        System.out.println();
        System.out.println();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>> Student Report >>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println();
        System.out.println(">>>>>>>>>>> Subjects & Marks >>>>>>>>>>>");
        for(int i = 0; i < subjects.length; i++){
            System.out.println("Subject " + (i+1) + " - " + subjects[i]);
        }
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println();
        System.out.println("Total = " + sum);
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println();
        System.out.println("Average = " + avg);
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println();
        System.out.println("Grade = " + grade);
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        
        scan.close();
    }
}
