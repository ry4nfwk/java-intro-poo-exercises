package entities;

public class VectRooms {
    private String peopleName;
    private String email;

    public VectRooms(String peopleName, String email) {
        this.peopleName = peopleName;
        this.email = email;
    }

    public String getPeopleName(){
        return peopleName;
    }
    public String getEmail(){
        return email;
    }
    public void setPeopleName(String peopleName){
        this.peopleName = peopleName;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String toString(){
        return peopleName + ", " + email;
    }
}
