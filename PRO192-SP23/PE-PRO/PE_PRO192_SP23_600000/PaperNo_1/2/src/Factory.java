interface IConnect{
    public abstract boolean makeConnection();
}

public abstract class Factory {
    String type;
    String dataSoucre;

    public Factory() {
    }

    public Factory(String type, String dataSoucre) {
        this.type = type;
        this.dataSoucre = dataSoucre;
    }

    public String getType() {
        return type;
    }

    public String getDataSoucre() {
        return dataSoucre;
    }

    public abstract void readData();
    
    public abstract String writeData();
    
    
}
