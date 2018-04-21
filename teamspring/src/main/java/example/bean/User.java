package example.bean;

public class User {
    private int userid;
    private String username;
    private String password;
    private int age;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {

        return username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getPassword() {
        return password;
    }



    public void setPassword(String password) {
        this.password = password;

    }
}
