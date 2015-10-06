package models.entity.builder.user;

public interface UserSetWork {

    /** 実行後UserSetHobbyを返すインターフェイス */
    UserSetHobby workStudent();

    /** 実行後UserSetHobbyを返すインターフェイス */
    UserSetHobby workOfficeWorker();

    /** 実行後UserSetHobbyを返すインターフェイス */
    UserSetHobby workHouseWife();

    /** 実行後UserSetHobbyを返すインターフェイス */
    UserSetHobby workNeet();

}
