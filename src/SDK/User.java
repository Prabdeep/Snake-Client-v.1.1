package SDK;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.sql.Date;
import java.util.ArrayList;

public class User {

    //creating variables
    private int id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private java.sql.Date created;
    private String status;
    private String email;
    private int type;

    private static ServerConnection serverCon;


    public User() {

        serverCon = new ServerConnection();

    }

    public static String userAuthentication(User user) {
        String message = "";
        String authentication = serverCon.post(new Gson().toJson(user), "login");
        JSONParser parser = new JSONParser();

        try {
            Object object = parser.parse(authentication);
            JSONObject jsonobject = (JSONObject) object;

            message = (String) jsonobject.get("message");

            if (jsonobject.get("userid") != null) ;
            user.setId((int) (long) jsonobject.get("userid"));

        } catch (ParseException e) {

        }
        return message;
    }
    // User Arraylist

    public static ArrayList<User> getUsers() {
        String jsonImport = serverCon.get("users");
        ArrayList<User> users = new Gson().fromJson(jsonImport, new TypeToken<ArrayList<User>>() {
        }.getType());

        return users;
    }

    // ID
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public java.sql.Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

}