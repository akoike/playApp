package controllers;

import models.Test;
import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public Result index() {
        Test test = new Test();
        test.age = 28;
        return ok(index.render(test));
    }

}
