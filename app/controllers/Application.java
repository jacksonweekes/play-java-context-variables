package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        flash("success", "This message comes from the flash variable");
        session("session_var", "This message is from the session variable");
        return ok(index.render("Your new application is ready."));
    }

}
