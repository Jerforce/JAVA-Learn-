package javalearn.Alist.login;

/**
 * @author Lenovo
 * @create 2023/3/28 9:49
 **/
public class User {
    private int UserID;
    private String UserName;
    private String Password;

    public User() {
    }

    public User(int UserID, String UserName, String Password) {
        this.UserID = UserID;
        this.UserName = UserName;
        this.Password = Password;
    }

    /**
     * 获取
     * @return UserID
     */
    public int getUserID() {
        return UserID;
    }

    /**
     * 设置
     * @param UserID
     */
    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    /**
     * 获取
     * @return UserName
     */
    public String getUserName() {
        return UserName;
    }

    /**
     * 设置
     * @param UserName
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * 获取
     * @return Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * 设置
     * @param Password
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String toString() {
        return "User{UserID = " + UserID + ", UserName = " + UserName + ", Password = " + Password + "}";
    }
}
