import java.util.Scanner;

public class PerfectSquareCountMainMethod {
    public static void main(String[] args) {
        PerfectSquareCount perfectSquareCount = new PerfectSquareCount();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        StringBuilder stringBuilder= new StringBuilder();
        String answer=null;
      
        int numberOfTestCases= scanner.nextInt();
        while (numberOfTestCases>0){
            perfectSquareCount.setNumberOfTestCases(numberOfTestCases);
            System.out.println("Enter the width");
            int width=scanner.nextInt();
            perfectSquareCount.setWidth(width);
            System.out.println("Enter the length");
            int length=scanner.nextInt();
            perfectSquareCount.setLength(length);


           try{ 
             answer=  perfectSquareCount.calculateTheTotalNumberOfSquares();
           }
           catch (TotalNumberOfSquareException totalNumberOfSquareException){
               System.err.println(totalNumberOfSquareException.getMessage());
           }
            stringBuilder.append("The number of perfect squares in length: ").append(length).append(" and width: ").append(width).append(" is: ").append(perfectSquareCount.getTotalNumberOfPerfectSquares()[numberOfTestCases-1]).append("\n");
           numberOfTestCases=numberOfTestCases-1;
            
        }
        System.out.println(stringBuilder.toString());
        
    }
}
