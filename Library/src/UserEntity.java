/**
 * 参与者：人
 */
public class UserEntity
{
    /**
     * 用户ID
     */
    private int id;

    /**
     * 姓名
     */
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return this.id;
    }
}
