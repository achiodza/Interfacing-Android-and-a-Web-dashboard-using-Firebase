package info.androidhive.firebase;

public class Data {

    private String uid;
    private String uname;
    private String standNumber;
    private String standArea;
    private String phoneNumber;
    private String allocDate;
    private String meterNumber;
    private String location;
    private String payment_status;
    private String water_status;
    private String sewer_status;
    private String road_status;


    public Data(){

    }


    public Data(String uid, String uname, String standNumber, String standArea, String phoneNumber, String allocDate, String meterNumber, String location, String sewer_status, String water_status, String road_status, String payment_status) {
        this.uid = uid;
        this.uname = uname;
        this.standNumber = standNumber;
        this.standArea = standArea;
        this.phoneNumber = phoneNumber;
        this.allocDate = allocDate;
        this.meterNumber = meterNumber;
        this.location =location;
        this.payment_status=payment_status;
        this.water_status=water_status;
        this.sewer_status=sewer_status;
        this.road_status=road_status;
    }

    public String getUid() {
        return uid;
    }

    public String getUname() {
        return uname;
    }

    public String getStandNumber() {
        return standNumber;
    }

    public String getStandArea() {
        return standArea;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAllocDate() {
        return allocDate;
    }

    public String getMeterNumber() {
        return meterNumber;
    }
    public String getLocation(){
        return location;
    }

    public String getPayment_status(){return payment_status; }

    public String getWater_status(){return water_status; }

    public String getSewer_status() { return  sewer_status; }

    public String getRoad_status() { return road_status; }




}
