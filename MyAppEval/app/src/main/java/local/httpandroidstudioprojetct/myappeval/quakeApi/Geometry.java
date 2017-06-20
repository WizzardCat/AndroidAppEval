
package local.httpandroidstudioprojetct.myappeval.quakeApi;

import java.util.List;

import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Geometry {

    @SerializedName("coordinates")
    private List<Double> mCoordinates;
    @SerializedName("type")
    private String mType;

    public List<Double> getCoordinates() {
        return mCoordinates;
    }

    public String getType() {
        return mType;
    }

    public static class Builder {

        private List<Double> mCoordinates;
        private String mType;

        public Geometry.Builder withCoordinates(List<Double> coordinates) {
            mCoordinates = coordinates;
            return this;
        }

        public Geometry.Builder withType(String type) {
            mType = type;
            return this;
        }

        public Geometry build() {
            Geometry Geometry = new Geometry();
            Geometry.mCoordinates = mCoordinates;
            Geometry.mType = mType;
            return Geometry;
        }

    }

}
