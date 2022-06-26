package pl.fifi.MarsRoverApp.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public abstract class RoverPrototype {
    private Long id;
    private String name;
    private String landingDate;
    private String launchDate;
    private String status;

    public RoverPrototype(){

    }
    public RoverPrototype(RoverPrototype target){
        if(target!=null){
            this.id = target.id;
            this.name = target.name;
            this.landingDate = target.landingDate;
            this.launchDate = target.launchDate;
            this.status = target.status;
        }

    }
    public abstract RoverPrototype clone();

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof RoverPrototype)) return false;

        RoverPrototype that = (RoverPrototype) o;

        return Objects.equals(that.id,id) && Objects.equals(that.name, name) && Objects.equals(that.landingDate, landingDate)
                && Objects.equals(that.launchDate, launchDate) && Objects.equals(that.status,status);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (landingDate != null ? landingDate.hashCode() : 0);
        result = 31 * result + (launchDate != null ? launchDate.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
