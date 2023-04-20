package lsy.java.Text;

public class Data {
    String username;
    String acc;
    String key;
    public  Data(){}

    public Data(String username, String acc, String key) {
        this.username = username;
        this.acc = acc;
        this.key = key;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAcc() {
        return acc;
    }

    public void setAcc(String acc) {
        this.acc = acc;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
    public void printf() {
        System.out.println("用户名:"+username+"账号:"+acc+"密码:"+key);
    }
}
