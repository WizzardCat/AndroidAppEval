
package local.httpandroidstudioprojetct.myappeval.quakeApi;


import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Metadata {

    @SerializedName("api")
    private String mApi;
    @SerializedName("count")
    private Long mCount;
    @SerializedName("generated")
    private Long mGenerated;
    @SerializedName("status")
    private Long mStatus;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("url")
    private String mUrl;

    public String getApi() {
        return mApi;
    }

    public Long getCount() {
        return mCount;
    }

    public Long getGenerated() {
        return mGenerated;
    }

    public Long getStatus() {
        return mStatus;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getUrl() {
        return mUrl;
    }

    public static class Builder {

        private String mApi;
        private Long mCount;
        private Long mGenerated;
        private Long mStatus;
        private String mTitle;
        private String mUrl;

        public Metadata.Builder withApi(String api) {
            mApi = api;
            return this;
        }

        public Metadata.Builder withCount(Long count) {
            mCount = count;
            return this;
        }

        public Metadata.Builder withGenerated(Long generated) {
            mGenerated = generated;
            return this;
        }

        public Metadata.Builder withStatus(Long status) {
            mStatus = status;
            return this;
        }

        public Metadata.Builder withTitle(String title) {
            mTitle = title;
            return this;
        }

        public Metadata.Builder withUrl(String url) {
            mUrl = url;
            return this;
        }

        public Metadata build() {
            Metadata Metadata = new Metadata();
            Metadata.mApi = mApi;
            Metadata.mCount = mCount;
            Metadata.mGenerated = mGenerated;
            Metadata.mStatus = mStatus;
            Metadata.mTitle = mTitle;
            Metadata.mUrl = mUrl;
            return Metadata;
        }

    }

}
