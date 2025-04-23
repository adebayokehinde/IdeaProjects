import java.util.Random;
import java.util.Scanner;
public class MathQuiz{
    public static void main(String[] args){
    Random rand = new Random();
    Scanner input = new Scanner(System.in);
    int correctAnswer = 0;

    for(int i = 0; i <= 20; i++){
    int num1 = rand.nextInt(10)+1;
    int num2 = rand.nextInt(10)+1;
    char operation = "+-*"charAt(rand.nextInt(3));
    int correctAnswer = 0;

    if (operation == '+'){
        correctAnswer = num1 + num2;
    }
    if (operation == '-'){
        correctAnswer = num1 - num2;
    }
    if (operation == '*'){
        correctAnswer = num1 * num2;
    }
    System.out.println("what is"+num1+""operation+""+num2+"?");
    int userAnswer = input.nextInt();
    if (userAnswer == correctAnswer){
       System.out.println("correct");
       correctAnswer++
    }else{
        System.out.println("wrong");
    }


    }
        System.out.println("You got " + correctAnswer + " out of 20 questions correct.");





    }



}