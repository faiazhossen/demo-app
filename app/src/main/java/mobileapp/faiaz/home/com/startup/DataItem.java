package mobileapp.faiaz.home.com.startup;

public class DataItem {
    private String id;
    private String name;
    private String address;

    public DataItem(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public DataItem() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
