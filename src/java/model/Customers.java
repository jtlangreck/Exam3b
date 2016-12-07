
package model;


public class Customers{
    
    private int custID;
    private String firstName;
    private String lastName;
    private String Addr1;
    private String Addr2;
    private String City;
    private String State;
    private String Zip;
    private String EmailAddr;

    
    public Customers() {
    this.custID = 0;
    this.firstName = "";
    this.lastName = "";
    this.Addr1 ="";
    this.Addr2 ="";
    this.City ="";
    this.State = "";
    this.Zip = "";
    this.EmailAddr = "";
    }
    
    
    
    public Customers(int custID, String firstName, String lastName, 
    String Addr1, String Addr2, String City, String State, String Zip, 
    String EmailAddr)
    {
        this.custID = custID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.Addr1 = Addr1;
        this.Addr2 = Addr2;
        this.City = City;
        this.State = State;
        this.Zip=Zip;
        this.EmailAddr = EmailAddr;
    }

    public int getCustID() {
        return custID;
    }

    public void setCustID(int custID) {
        this.custID = custID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddr1() {
        return Addr1;
    }

    public void setAddr1(String Addr1) {
        this.Addr1 = Addr1;
    }

    public String getAddr2() {
        return Addr2;
    }

    public void setAddr2(String Addr2) {
        this.Addr2 = Addr2;
    }
    
    public String getCity() {
        return City;
    }
    
    public void setCity(String City){
        this.City=City;
    }
    
    public String getState(){
        return State;
    }
    
    public void setState(String State){
        this.State=State;
    }
    
    public String getZip(){
        return Zip;
    }
    
    public void setZip(String Zip){
        this.Zip=Zip;
    }
    
    public String getEmailAddr(){
        return EmailAddr;
    }
    
    public void setEmailAddr(String EmailAddr){
        this.EmailAddr = EmailAddr;
    
        
    }

    @Override
    public String toString() {
        return "Customers{" + "custID=" + custID + ", firstName=" + firstName 
                + ", lastName=" + lastName 
                + ", Addr1=" + Addr1 + ", Addr2=" + Addr2 + ", City=" + City 
                + ", State=" + State + ", Zip=" + Zip + ", EmailAddr=" + EmailAddr + '}';
    }
    
    
    
}
