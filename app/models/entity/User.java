package models.entity;

import com.avaje.ebean.annotation.CreatedTimestamp;
import play.db.ebean.Model;

import javax.persistence.Id;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by akoike on 2015/06/20.
 */
public class User extends Model {

    @Id
    public long id;

    @NotNull
    public String name;

    @NotNull
    public int age;

    @NotNull
    public SexType sex;

    @CreatedTimestamp
    public Date createDate;

    @Version
    public Date updateDate;

    public String toString() {
        return "User [" +
                "id=" + id + ", " +
                "name=" + name + ", " +
                "age=" + age + ", " +
                "sex=" + sex + ", " +
                "createDate=" + createDate + ", " +
                "updateDate=" + updateDate +
                "]";
    }

    public enum SexType{
        MAN,
        WOMAN;
    }

}
