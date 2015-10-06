package models.entity.builder.user;

public interface UserInfoAction {

    /** 自己紹介を生成するインターフェイス */
    String selfIntroduction();

    /** DBへ挿入するインターフェイス */
    boolean insert();

}
