  
package models;

public class User {
    public String Username;
    public String Password;

    public User(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;
    }
    
    public User(String Username, char[] Password) {
        this(Username, String.valueOf(Password));
    }

    @Override
    public String toString() {
        return "User{" + "Username=" + Username + ", Password=" + Password + '}';
    }
    
    }
