import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.util.*;

public class Student {
    private String mID;
    private String mFullName;
    private Date mDoB;
    private String mPhone;
    private String mAddress;
    public Student(){}

    public Student(String ID, String FullName, Date DoB, String Phone, String Address) {
        this.mID = ID;
        this.mFullName = FullName;
        this.mDoB = DoB;
        this.mPhone = Phone;
        this.mAddress = Address;
    }

    public String getmID() {
        return mID;
    }
    public void setmID(String mID) {
        this.mID = mID;
    }
    public String getmFullName() {
        return mFullName;
    }
    public void setmFullName(String mFullName) {
        this.mFullName = mFullName;
    }
    public Date getmDoB() {
        return mDoB;
    }
    public void setmDoB(Date mDoB) {
        this.mDoB = mDoB;
    }
    public String getmPhone() {
        return mPhone;
    }
    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }
    public String getmAddress() {
        return mAddress;
    }
    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    @Override
    public String toString() {
        return "Student{" + "mID=" + mID + ", mFullName=" + mFullName + ", mDoB=" + mDoB + ", mPhone=" + mPhone + ", mAddress=" + mAddress + '}';
    }
    
    
}
