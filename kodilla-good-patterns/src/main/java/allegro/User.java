package allegro;

public class User {

    private String userNickName;
    private String userName;
    private String userSurname;

    public User(String userNickName, String userName, String userSurname) {
        this.userNickName = userNickName;
        this.userName = userName;
        this.userSurname = userSurname;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }
}
