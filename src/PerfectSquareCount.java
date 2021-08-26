
public class PerfectSquareCount {

    private int numberOfTestCases;
    private int length;
    private int width;
    private int[] totalNumberOfPerfectSquares;
    private int forArray;
    public int[] getTotalNumberOfPerfectSquares() {
        return totalNumberOfPerfectSquares;
    }

    public int getNumberOfTestCases() {
        return numberOfTestCases;
    }

    public void setNumberOfTestCases(int numberOfTestCases) {
        //number of test cases we want to run
        this.numberOfTestCases = numberOfTestCases;
        //placeholder for storing the results in the array
        forArray=numberOfTestCases;
        //An array that holds all the result
        totalNumberOfPerfectSquares =new int[numberOfTestCases];
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public String calculateTheTotalNumberOfSquares() throws TotalNumberOfSquareException {

        if(length<=0){
            throw new TotalNumberOfSquareException("The length is invalid");
        }
        if(width<=0){
            throw new TotalNumberOfSquareException("The width is invalid");
        }
        //A method that returns the list of squares in each test case and also leading to the logic
      return  checkLengthAndWidthSize(length,width);
    }

    private String checkLengthAndWidthSize(int length, int width){
        StringBuilder stringBuilder= new StringBuilder();
        //width and length check
        if(length==1&&width==1){
            totalNumberOfPerfectSquares[numberOfTestCases-1]=1;
            numberOfTestCases=numberOfTestCases-1;
           return String.valueOf(1);
        }
        //width and length check
        if(length==width){
            lengthEqualsWidth(length,width);
            for (int i = forArray-1; i>=0 ; i--) {
                stringBuilder.append(totalNumberOfPerfectSquares[i]).append("\n");

            }
        }
        //width and length check
        if(length<width){
            lengthLessThanWidth(length,width);
            for (int i = forArray-1; i>=0 ; i--) {
                stringBuilder.append(totalNumberOfPerfectSquares[i]).append("\n");
            }
        }
        //width and length check
        if(length>width){
            int temp=length;
            this.length=width;
            this.width=temp;
           return checkLengthAndWidthSize(this.length,this.width);
        }

        return stringBuilder.toString();
    }

    private void lengthLessThanWidth(int length, int width) {
       //logic
        int [] numberOfPerfectSquare= new int[length];
        int totalOfLengthAndWidth=length*width;
        int difference=width-length;
        int totalNumber=0;
        for(int counter=length;counter>0;counter--){
           int square= totalOfLengthAndWidth/counter;
           numberOfPerfectSquare[counter-1]=square;
        }
        for (int number:numberOfPerfectSquare) {
            totalNumber+=number;
        }
        totalNumber=totalNumber-difference;
        totalNumberOfPerfectSquares[numberOfTestCases-1]=totalNumber;
        numberOfTestCases=numberOfTestCases-1;

    }

    private void lengthEqualsWidth(int length, int width) {
        //logic
        int [] numberOfPerfectSquare= new int[length];
        int totalOfLengthAndWidth=length*width;
        int totalNumber=0;
        for(int counter=length-1;counter>0;counter--){
            int square= totalOfLengthAndWidth/counter;
            numberOfPerfectSquare[counter-1]=square;
        }
        for (int number:numberOfPerfectSquare) {
            totalNumber+=number;
        }

        totalNumberOfPerfectSquares[numberOfTestCases-1]=totalNumber;
        numberOfTestCases=numberOfTestCases-1;
    }
}
