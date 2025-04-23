import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("how many student do you hava: ");
        int studentnumber = scanner.nextInt();

        System.out.print("how many subject do they offer: ");
        int subjectnumber = scanner.nextInt();

        System.out.println("saving >>>>>>>>>>>>>>>>>>>>>>>>\nsaved successfully");




        int[][] scores = new int[studentnumber][subjectnumber];

        for (int i = 0; i < studentnumber; i++) {
            System.out.println("Enter scores for student " + (i + 1) + ":");
            for (int j = 0; j < subjectnumber; j++) {
                while (true) {
                    System.out.print("Subject " + (j + 1) + ": ");
                    int score = scanner.nextInt();
                    if (score >= 0 && score <= 100) {
                        scores[i][j] = score;
                        break;
                    } else {
                        System.out.println("Score must be between 0 and 100. Please enter again.");
                    }
                }
            }
        }

        System.out.println("Student Scores Summary:");

        System.out.println("====================================\nStudent | Sub1 |  Sub2 |  Sub3 |  Total |  Average\n====================================");

        for (int i = 0; i < studentnumber; i++) {
            int totalScore = 0;
            System.out.print("Student " + (i + 1) + "  ");
            for (int j = 0; j < subjectnumber; j++) {
                System.out.print(scores[i][j] + "   ");
                totalScore += scores[i][j];
            }
            double averageScore = (double) totalScore / subjectnumber;
            System.out.println(totalScore + "   " + averageScore);
        }


        System.out.println("\nSubject Summary:");
        for (int j = 0; j < subjectnumber; j++) {
            int highestScore = Integer.MIN_VALUE;
            int lowestScore = Integer.MAX_VALUE;
            int totalSubjectScore = 0;
            int passes = 0;
            int fails = 0;
            int highestScoringStudent = -1;
            int lowestScoringStudent = -1;

            for (int i = 0; i < subjectnumber; i++) {
                int score = scores[i][j];
                totalSubjectScore += score;
                if (score > highestScore) {
                    highestScore = score;
                    highestScoringStudent = i + 1;
                }
                if (score < lowestScore) {
                    lowestScore = score;
                    lowestScoringStudent = i + 1;
                }
                if (score >= 50) {
                    passes++;
                } else {
                    fails++;
                }
            }
            System.out.println("Subject " + (j + 1) + ":");
            System.out.println("  Highest scoring student: Student " + highestScoringStudent + " with score " + highestScore);
            System.out.println("  Lowest scoring student: Student " + lowestScoringStudent + " with score " + lowestScore);
            System.out.println("  Total score: " + totalSubjectScore);
            System.out.println("  Number of passes: " + passes);
            System.out.println("  Number of fails: " + fails);
        }


    }
}





