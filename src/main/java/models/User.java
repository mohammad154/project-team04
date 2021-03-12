  
package models;

public class User {
    public String Username;
    public String Password;

    public User(String Username, char[] Password) {
        this.Username = Username;
        this.Password = String.valueOf(Password);
    }

    @Override
    public String toString() {
        return "User{" + "Username=" + Username + ", Password=" + Password + '}';
    }
    
    }
