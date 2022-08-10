import java.io.File;
import java.util.Scanner;
public class CSVStates {
        public static void main(String[] args) throws Exception{

        MyRecordException myRecordException = new MyRecordException();
        StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
        int codesRecord = 0;
       try{
        Scanner sc = new Scanner(new File("statescodes.csv"));
        sc.useDelimiter(",");
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
            codesRecord++;
        }
        sc.close();
       }
       catch(Exception e){
        System.out.println(myRecordException.toString());
       }
        System.out.println("\nTotal States Codes : " + codesRecord);
        
        if(codesRecord != stateCensusAnalyser.counterRecord){
            myRecordException.getMessage();
        }
    }
}
