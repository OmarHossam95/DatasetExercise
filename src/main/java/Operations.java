import joinery.DataFrame;

public class Operations {
    public static DataFrame<Object> getGenderSurvivedCount(DataFrame<Object> df){
        return df.retain("Survived", "Sex").groupBy("Sex").count();
    }

    public static DataFrame<Object> getPClassSurvivedCount(DataFrame<Object> df){
        return df.retain("Survived", "Pclass").groupBy("Pclass").count();
    }

    public static DataFrame<Object> getMeanFarePerClass(DataFrame<Object> df){
        return df.retain("Pclass", "Fare").groupBy("Pclass").mean();
    }
}
