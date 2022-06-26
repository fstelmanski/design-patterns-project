package pl.fifi.MarsRoverApp.response;

import java.util.Objects;

public class CustomRoverOne extends RoverPrototype{
    public String size;

    public CustomRoverOne(){

    }
    public CustomRoverOne(CustomRoverOne target) {
        super(target);
        if(target!=null){
            this.size = target.size;
        }
    }

    @Override
    public RoverPrototype clone() {
        return new CustomRoverOne(this);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof CustomRoverOne) || !super.equals(o)) return false;

        CustomRoverOne that = (CustomRoverOne) o;

        return Objects.equals(that.size,size);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (size != null ? size.hashCode() : 0);
        return result;
    }
}
