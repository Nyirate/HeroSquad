import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;

public class App {
    public static  void main(String[] args) { //type “psvm + tab” to autocreate this
        staticFileLocation("/public");

        //get: new hero form
        get("/new",(request, response) -> {
            Map<String,Object> model = new HashMap<>();
            return new ModelAndView(model,"hero-form.hbs");
        },new HandlebarsTemplateEngine());

        //post: process new hero form
        post ("/news",(request, response) -> {
            Map<String,Object>model = new HashMap<>();
            String name =request.queryParams("name");
            int age = Integer.parseInt(request.queryParams("age"));
            String power= request.queryParams("power");
            String weakness = request.queryParams("weakness");
            Hero newIdentity =new Hero(name,age,power,weakness);
            model.put("hero",newIdentity);
            return new ModelAndView(model,"pass.hbs");
        }, new HandlebarsTemplateEngine());

/*
        get("/",(request, response) -> {
            Map<String,Object> model = new HashMap<>();
            ArrayList<Post> posts=Post.getAll();
            model.put("Posts",posts);
            return new ModelAndView(model,"heroes.hbs");
        },new HandlebarsTemplateEngine());*/

        get("/nell",(request, response) -> {
            Map<String,Object> model = new HashMap<>();
            ArrayList<Hero> posts=Hero.all();
            model.put("posts",posts);
            return new ModelAndView(model,"heroes.hbs");
        },new HandlebarsTemplateEngine());


        //get: show squad form
        get("/squad",(request, response) -> {
            Map<String,Object> model = new HashMap<>();
            return new ModelAndView(model,"squad-form.hbs");
        },new HandlebarsTemplateEngine());


        //post: process a squad form
        post ("/squads",(request, response) -> {
            Map<String,Object>model = new HashMap<>();
            String name =request.queryParams("name");
            int size = Integer.parseInt(request.queryParams("size"));
            String cause = request.queryParams("cause");
            Squad newSquadIdentity =new Squad(name,size,cause);
            model.put("squads",newSquadIdentity );
            return new ModelAndView(model,"pass2.hbs");
        }, new HandlebarsTemplateEngine());


        get("/squad",(request, response) -> {
            Map<String, Object> model = new HashMap<>();
            ArrayList<Squad> squad = Squad.getAll();
            model.put("squad", squad);
            return new ModelAndView(model, "squad-list.hbs");
        },new HandlebarsTemplateEngine());

    }
}