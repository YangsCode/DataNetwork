package core;

public class MetaData {

    //0: location
    //1: type
    //2: blocked
    //3: shared

    protected String location;

    protected String type;

    protected volatile boolean shared;

    protected volatile boolean blocked;

    protected String name;

    protected MetaData(String location, String type,String name, boolean blocked, boolean shared) {
        this.location = location;
        this.type = type;
        this.name = name;
        this.shared =shared;
        this.blocked = blocked;
    }

    protected MetaData(String location, String type) {
        this(location,"Object","Unnamed",false,false);
    }

    public String getLocation() {
        return location;
    }

    public String getType() {
        return type;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
