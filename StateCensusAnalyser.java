import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class MyRecordException extends Exception{
   @Override
   public String getMessage() {
       return "Record is missing...";
   }
   @Override
   public String toString() {
       return "File not found";
   }
}
public class StateCensusAnalyser{
    public static void main(String[] args) throws FileNotFoundException {
        int counterRecord = 0;
        try{
            Scanner sc = new Scanner(new File(("statecensusdata.csv")));
            sc.useDelimiter(",");
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine()); 
            counterRecord++;
        }
        sc.close();
        }
        catch(Exception e){
            System.out.println("Error...File not found");
        }
        System.out.println("\n"+ "Total Records : "+counterRecord);
        if(counterRecord != 30){
           try{
            throw new MyRecordException();
           }
           catch(Exception e){
            System.out.println(e.getMessage());
           }
        }
    }
}