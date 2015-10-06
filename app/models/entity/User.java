package models.entity;

import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * ユーザ情報テーブル
 */
@Entity
public class User extends Model {

    /** ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    /** 苗字 */
    @Constraints.Required
    @NotNull
    public String lastName;

    /** 名前 */
    @Constraints.Required
    @NotNull
    public String firstName;

    /** 年齢 */
    @Constraints.Required
    @NotNull
    public int age;

    /** 性別 */
    @Constraints.Required
    @NotNull
    public SexType sex;

    /** 職業 */
    @Constraints.Required
    @NotNull
    private WorkType work;

    /** 趣味 */
    @Constraints.Required
    @NotNull
    private List<String> hobby;

    @Version
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Date updateDate;

    /** ファインダー */
    public static Finder<Long, User> find = new Finder<Long, User>(Long.class, User.class);

    /**  性別 */
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

    /**  職業 */
    public enum WorkType {
        STUDENT("学生"),
        OFFICE_WORKER("会社員"),
        HOUSE_WIFE("専業主婦"),
        NEET("ニート");
        public String workType;
        WorkType(String workType) {
            this.workType = workType;
        }
        public String getWorkType() {
            return this.workType;
        }
    }

}
