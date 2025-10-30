package entities;

public class VectRooms {
    private String peopleName;
    private String email;
    private int room;

    public VectRooms(String peopleName, String email, int room) {
        this.peopleName = peopleName;
        this.email = email;
        this.room = room;
    }

    public VectRooms(){

    }

    public String getPeopleName(){
        return peopleName;
    }
    public String getEmail(){
        return email;
    }
    public int getRoom(){
        return room;
    }
    public void setPeopleName(String peopleName){
        this.peopleName = peopleName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setRoom(int room){
        this.room = room;
    }

    public String toString(){
        return "Name: " + peopleName+"\n" + "Email: " + email+"\n" + "Room: " +"\n";
    }
}
