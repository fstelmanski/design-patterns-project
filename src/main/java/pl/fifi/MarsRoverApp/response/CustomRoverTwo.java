package pl.fifi.MarsRoverApp.response;

import java.util.Objects;

public class CustomRoverTwo extends RoverPrototype{
    public int width;
    public int height;

    public CustomRoverTwo(){

    }
    public CustomRoverTwo(CustomRoverTwo target) {
        super(target);
        if(target!=null){
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public RoverPrototype clone() {
        return new CustomRoverTwo(this);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof CustomRoverTwo) || !super.equals(o)) return false;

        CustomRoverTwo that = (CustomRoverTwo) o;

        return that.width == width && that.height == height;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + width;
        result = 31 * result + height;
        return result;
    }
}