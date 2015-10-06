package models.entity.builder.user;

import models.entity.User;

public class UserInfoBuilder implements UserSetLastName, UserSetFirstName, UserSetAge, UserSetSex, UserSetWork, UserSetHobby, UserInfoAction {

    private static User user;

    /** コンストラクタ */
    public UserInfoBuilder(){
        UserInfoBuilder.user = new User();
    }

    /** ビルダー */
    public static UserSetLastName builder() {
        return new UserInfoBuilder();
    }

    @Override
    public UserSetFirstName lastName(String lastName) {
        return this;
    }

    @Override
    public UserSetAge firstName(String firstName) {
        return this;
    }

    @Override
    public UserSetSex age(int age) {
        return this;
    }

    @Override
    public UserSetWork sexMan() {
        return this;
    }
    @Override
    public UserSetWork sexWoman() {
        return this;
    }

    @Override
    public UserSetHobby workStudent() {
        return this;
    }

    @Override
    public UserSetHobby workOfficeWorker() {
        return this;
    }
    @Override
    public UserSetHobby workHouseWife() {
        return this;
    }
    @Override
    public UserSetHobby workNeet() {
        return this;
    }
    @Override
    public UserInfoAction hobby(String... hobbyList) {
        return this;
    }

    @Override
    public String selfIntroduction() {
        return new String();
    }
    @Override
    public boolean insert() {
        return false;
    }

}
