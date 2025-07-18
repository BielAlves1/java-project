package model;

public class User {
    private static long countId = 0;
    private final long id;
    private String userName;
    private String email;
    private String password;
    private String role;

    public User(String userName, String email, String password, String role){
        this.id = countId++;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void updatePassword(String newPassword) {
        setPassword(newPassword);
    }
}
