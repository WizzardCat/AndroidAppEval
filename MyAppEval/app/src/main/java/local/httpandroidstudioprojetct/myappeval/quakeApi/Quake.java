
package local.httpandroidstudioprojetct.myappeval.quakeApi;

import java.util.List;

import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Quake {

    @SerializedName("bbox")
    private List<Double> mBbox;
    @SerializedName("features")
    private List<Feature> mFeatures;
    @SerializedName("metadata")
    private Metadata mMetadata;
    @SerializedName("type")
    private String mType;

    public List<Double> getBbox() {
        return mBbox;
    }

    public List<Feature> getFeatures() {
        return mFeatures;
    }

    public Metadata getMetadata() {
        return mMetadata;
    }

    public String getType() {
        return mType;
    }

    public static class Builder {

        private List<Double> mBbox;
        private List<Feature> mFeatures;
        private Metadata mMetadata;
        private String mType;

        public Quake.Builder withBbox(List<Double> bbox) {
            mBbox = bbox;
            return this;
        }

        public Quake.Builder withFeatures(List<Feature> features) {
            mFeatures = features;
            return this;
        }

        public Quake.Builder withMetadata(Metadata metadata) {
            mMetadata = metadata;
            return this;
        }

        public Quake.Builder withType(String type) {
            mType = type;
            return this;
        }

        public Quake build() {
            Quake Quake = new Quake();
            Quake.mBbox = mBbox;
            Quake.mFeatures = mFeatures;
            Quake.mMetadata = mMetadata;
            Quake.mType = mType;
            return Quake;
        }

    }

}
