package controllers;

import com.avaje.ebean.Query;
import models.entity.User;
import models.entity.builder.user.UserInfoBuilder;
import play.*;
import play.db.ebean.Model;
import play.mvc.*;

import views.html.*;

import java.util.List;

public class Application extends Controller {

    public static Result index() {
//        Query<User> user = User.find.where("age='30'");
        return ok(index.render("Your new application is ready."));
//        String selfIntroduction = UserInfoBuilder.builder()
//                .lastName("")
//                .firstName("")
//                .age(0)
//                .sexMan()
//                .workOfficeWorker()
//                .hobby("", "")
//                .selfIntroduction();
//        String selfIntroduction = UserInfoBuilder.builder().lastName("").firstName("").age(28).sexMan().workOfficeWorker().hobby("", "").selfIntroduction();
//        return null;
    }

}
