
package local.httpandroidstudioprojetct.myappeval.quakeApi;


import com.google.gson.annotations.SerializedName;

import java.text.SimpleDateFormat;
import java.util.Date;

@SuppressWarnings("unused")
public class Properties {

    @SerializedName("alert")
    private Object mAlert;
    @SerializedName("cdi")
    private Object mCdi;
    @SerializedName("code")
    private String mCode;
    @SerializedName("detail")
    private String mDetail;
    @SerializedName("dmin")
    private Double mDmin;
    @SerializedName("felt")
    private Object mFelt;
    @SerializedName("gap")
    private Long mGap;
    @SerializedName("ids")
    private String mIds;
    @SerializedName("mag")
    private Double mMag;
    @SerializedName("magType")
    private String mMagType;
    @SerializedName("mmi")
    private Object mMmi;
    @SerializedName("net")
    private String mNet;
    @SerializedName("nst")
    private Long mNst;
    @SerializedName("place")
    private String mPlace;
    @SerializedName("rms")
    private Double mRms;
    @SerializedName("sig")
    private Long mSig;
    @SerializedName("sources")
    private String mSources;
    @SerializedName("status")
    private String mStatus;
    @SerializedName("time")
    private Long mTime;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("tsunami")
    private Long mTsunami;
    @SerializedName("type")
    private String mType;
    @SerializedName("types")
    private String mTypes;
    @SerializedName("tz")
    private Long mTz;
    @SerializedName("updated")
    private Long mUpdated;
    @SerializedName("url")
    private String mUrl;

    public Object getAlert() {
        return mAlert;
    }

    public Object getCdi() {
        return mCdi;
    }

    public String getCode() {
        return mCode;
    }

    public String getDetail() {
        return mDetail;
    }

    public Double getDmin() {
        return mDmin;
    }

    public Object getFelt() {
        return mFelt;
    }

    public Long getGap() {
        return mGap;
    }

    public String getIds() {
        return mIds;
    }

    public Double getMag() {
        return mMag;
    }

    public String getMagType() {
        return mMagType;
    }

    public Object getMmi() {
        return mMmi;
    }

    public String getNet() {
        return mNet;
    }

    public Long getNst() {
        return mNst;
    }

    public String getPlace() {
        return mPlace;
    }

    public Double getRms() {
        return mRms;
    }

    public Long getSig() {
        return mSig;
    }

    public String getSources() {
        return mSources;
    }

    public String getStatus() {
        return mStatus;
    }

    public Long getTime() {
        return mTime;
    }

    public String getTitle() {
        return mTitle;
    }

    public Long getTsunami() {
        return mTsunami;
    }

    public String getType() {
        return mType;
    }

    public String getTypes() {
        return mTypes;
    }

    public Long getTz() {
        return mTz;
    }

    public Long getUpdated() {
        return mUpdated;
    }

    public String getUrl() {
        return mUrl;
    }

    public String getCustomDate(){

      String date = new SimpleDateFormat("dd/MM/yyyy").format(getTime()).toString();
        return date;
    }

    public String getCustomTime(){

        String time = new SimpleDateFormat("HH:mm:ss").format(getTime()).toString();
        return time;
    }

    public void setmMag(Double mMag) {
        this.mMag = mMag;
    }

    public void setmPlace(String mPlace) {
        this.mPlace = mPlace;
    }

    public void setmTime(Long mTime) {
        this.mTime = mTime;
    }

    public void setmUrl(String mUrl) {
        this.mUrl = mUrl;
    }

    public static class Builder {

        private Object mAlert;
        private Object mCdi;
        private String mCode;
        private String mDetail;
        private Double mDmin;
        private Object mFelt;
        private Long mGap;
        private String mIds;
        private Double mMag;
        private String mMagType;
        private Object mMmi;
        private String mNet;
        private Long mNst;
        private String mPlace;
        private Double mRms;
        private Long mSig;
        private String mSources;
        private String mStatus;
        private Long mTime;
        private String mTitle;
        private Long mTsunami;
        private String mType;
        private String mTypes;
        private Long mTz;
        private Long mUpdated;
        private String mUrl;

        public Properties.Builder withAlert(Object alert) {
            mAlert = alert;
            return this;
        }

        public Properties.Builder withCdi(Object cdi) {
            mCdi = cdi;
            return this;
        }

        public Properties.Builder withCode(String code) {
            mCode = code;
            return this;
        }

        public Properties.Builder withDetail(String detail) {
            mDetail = detail;
            return this;
        }

        public Properties.Builder withDmin(Double dmin) {
            mDmin = dmin;
            return this;
        }

        public Properties.Builder withFelt(Object felt) {
            mFelt = felt;
            return this;
        }

        public Properties.Builder withGap(Long gap) {
            mGap = gap;
            return this;
        }

        public Properties.Builder withIds(String ids) {
            mIds = ids;
            return this;
        }

        public Properties.Builder withMag(Double mag) {
            mMag = mag;
            return this;
        }

        public Properties.Builder withMagType(String magType) {
            mMagType = magType;
            return this;
        }

        public Properties.Builder withMmi(Object mmi) {
            mMmi = mmi;
            return this;
        }

        public Properties.Builder withNet(String net) {
            mNet = net;
            return this;
        }

        public Properties.Builder withNst(Long nst) {
            mNst = nst;
            return this;
        }

        public Properties.Builder withPlace(String place) {
            mPlace = place;
            return this;
        }

        public Properties.Builder withRms(Double rms) {
            mRms = rms;
            return this;
        }

        public Properties.Builder withSig(Long sig) {
            mSig = sig;
            return this;
        }

        public Properties.Builder withSources(String sources) {
            mSources = sources;
            return this;
        }

        public Properties.Builder withStatus(String status) {
            mStatus = status;
            return this;
        }

        public Properties.Builder withTime(Long time) {
            mTime = time;
            return this;
        }

        public Properties.Builder withTitle(String title) {
            mTitle = title;
            return this;
        }

        public Properties.Builder withTsunami(Long tsunami) {
            mTsunami = tsunami;
            return this;
        }

        public Properties.Builder withType(String type) {
            mType = type;
            return this;
        }

        public Properties.Builder withTypes(String types) {
            mTypes = types;
            return this;
        }

        public Properties.Builder withTz(Long tz) {
            mTz = tz;
            return this;
        }

        public Properties.Builder withUpdated(Long updated) {
            mUpdated = updated;
            return this;
        }

        public Properties.Builder withUrl(String url) {
            mUrl = url;
            return this;
        }

        public Properties build() {
            Properties Properties = new Properties();
            Properties.mAlert = mAlert;
            Properties.mCdi = mCdi;
            Properties.mCode = mCode;
            Properties.mDetail = mDetail;
            Properties.mDmin = mDmin;
            Properties.mFelt = mFelt;
            Properties.mGap = mGap;
            Properties.mIds = mIds;
            Properties.mMag = mMag;
            Properties.mMagType = mMagType;
            Properties.mMmi = mMmi;
            Properties.mNet = mNet;
            Properties.mNst = mNst;
            Properties.mPlace = mPlace;
            Properties.mRms = mRms;
            Properties.mSig = mSig;
            Properties.mSources = mSources;
            Properties.mStatus = mStatus;
            Properties.mTime = mTime;
            Properties.mTitle = mTitle;
            Properties.mTsunami = mTsunami;
            Properties.mType = mType;
            Properties.mTypes = mTypes;
            Properties.mTz = mTz;
            Properties.mUpdated = mUpdated;
            Properties.mUrl = mUrl;
            return Properties;
        }

    }

}
