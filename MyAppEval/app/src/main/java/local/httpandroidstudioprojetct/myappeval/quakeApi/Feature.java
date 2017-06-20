
package local.httpandroidstudioprojetct.myappeval.quakeApi;


import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Feature {

    @SerializedName("geometry")
    private Geometry mGeometry;
    @SerializedName("id")
    private String mId;
    @SerializedName("properties")
    private Properties mProperties;
    @SerializedName("type")
    private String mType;

    public void setmProperties(Properties mProperties) {
        this.mProperties = mProperties;
    }

    public Geometry getGeometry() {
        return mGeometry;
    }

    public String getId() {
        return mId;
    }

    public Properties getProperties() {
        return mProperties;
    }

    public String getType() {
        return mType;
    }

    public static class Builder {

        private Geometry mGeometry;
        private String mId;
        private Properties mProperties;
        private String mType;

        public Feature.Builder withGeometry(Geometry geometry) {
            mGeometry = geometry;
            return this;
        }

        public Feature.Builder withId(String id) {
            mId = id;
            return this;
        }

        public Feature.Builder withProperties(Properties properties) {
            mProperties = properties;
            return this;
        }

        public Feature.Builder withType(String type) {
            mType = type;
            return this;
        }

        public Feature build() {
            Feature Feature = new Feature();
            Feature.mGeometry = mGeometry;
            Feature.mId = mId;
            Feature.mProperties = mProperties;
            Feature.mType = mType;
            return Feature;
        }

    }

}
