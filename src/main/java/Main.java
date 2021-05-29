import joinery.DataFrame;
import tech.tablesaw.api.Table;


public class Main {
    public static void main(String[] args){
        try {
            Table titanicData = Table.read().file("Titanic.csv");
            System.out.println("Data summary using tablesaw: ");
            System.out.println(titanicData.summary());

            System.out.println("Using Joinery");
            DataFrame<Object> df = DataFrame.readCsv("Titanic.csv");

            System.out.println("Survival count of each gender:");
            System.out.println(Operations.getGenderSurvivedCount(df));

            System.out.println("Survival count of each pclass:");
            System.out.println(Operations.getPClassSurvivedCount(df));

            System.out.println("Mean fare per pclass");
            System.out.println(Operations.getMeanFarePerClass(df));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
