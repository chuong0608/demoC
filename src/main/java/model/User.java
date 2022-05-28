package model;

public class User {
    private int id;
    private String role;
    private String email;
    private String userName;
    private String password;
    private String status;
    private String displayName;

    public User() {
    }

    public User(String role, String email, String userName, String password, String status, String displayName) {
        this.role = role;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.status = status;
        this.displayName = displayName;
    }

    public User(int id, String role, String email, String userName,
                String password, String status, String displayName) {
        this.id = id;
        this.role = role;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.status = status;
        this.displayName = displayName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
