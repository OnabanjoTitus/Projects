import javax.swing.*;
import java.util.Arrays;

public class StringCalculator {
    private String input;
    private String total;

    public void setInput() {
        input=JOptionPane.showInputDialog("Enter the input");

    }
    public String getInput() {
        return input;
    }

    public String getValue() {
        char [] charArray=new char[input.length()];
     input.getChars(0,input.length(),charArray,0);
     for(char g:charArray){
         total+=g;
     }
     return total;

    }
//    public int setTotal(){
//        this.total=input.charAt(0);
//       return total;
//    }
//    public int getTotal(){
//        return total;
//    }
//int [] array=new int[input.length()];
//        for(int counter=0; counter<input.length();counter++){
//        array[counter]=input.charAt(counter);
//        total=Arrays.stream(array).sum();
//    }
////        for(int numbers: array){
////            total=total+numbers;
////        }
//        return total;


}
