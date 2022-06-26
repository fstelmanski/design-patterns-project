package pl.fifi.MarsRoverApp.response;

public class SolToDayAdapter implements SoldatableAdapter{
    private Integer solExample;

    @Override
    public Double getEarthDay() {
        return convertSolToDay(solExample);
    }

    public Double convertSolToDay(Integer sol){
       return sol * 1.0276;
    }
}
