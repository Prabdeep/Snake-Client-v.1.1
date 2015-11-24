package SDK;

import java.util.Date;

public class Player {

    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private String playerid;
    private String password;
    private Date created;
    private String status;
    private int type;

    public Player () {}

    // ID

    public int getId (){ return id;}

    public void setId(int id) {this.id = id;}

    // Firstname

    public String getFirstname () {return firstname;}

    public void setFirstname (String firstname) {this.firstname = firstname;}

    // Lastname

    public String getLastname () {return lastname;}

    public void SetLastname (String lastname) {this.lastname = lastname;}

    // Email

    public String getEmail () {return email;}

    public void SetEmail (String email) {this.email = email;}

    // PlayerID

    public String getPlayerid () {return playerid;}

    public void setPlayerid (String playerid) {this.playerid = playerid;}

    // Password

    public String getPassword (String password) {return password;}

    public void setPassword(String password) {
        this.password = password;
    }

    // Created

    public Date getCreated (Date created) {return created;}

    public void SetCreated (Date created) {this.created = created;}

    // Status

    public String getStatus (String status) {return status;}

    public void SetStatus (String status) {this.status = status;}

    // Type

    public int getType (int type) {return type;}

    public void Settype (int type) {this.type = type;}

}
