package models.entity;

import com.avaje.ebean.annotation.CreatedTimestamp;
import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;
import javax.validation.Constraint;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by akoike on 2015/06/20.
 */
@Entity
public class User extends Model {

    @Id
    public long id;

    @Constraints.Required
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

    public static Finder<Long, User> find = new Finder<Long, User>(Long.class, User.class);

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

    public enum SexType {
        MAN("男"),
        WOMAN("女");
        public String sexType;
        SexType(String sexType) {
            this.sexType = sexType;
        }
        public String getSexType() {
            return this.sexType;
        }
    }

}
