package controllers;

import com.avaje.ebean.Query;
import models.entity.User;
import play.*;
import play.db.ebean.Model;
import play.mvc.*;

import views.html.*;

import java.util.List;

public class Application extends Controller {

    public static Result index() {
        Query<User> user = User.find.where("age='30'");
        return ok(index.render(user.findUnique()));
    }

}
