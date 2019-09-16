import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
//import spark.ModelAndView;
//import spark.template.handlebars.HandlebarsTemplateEngine;
//import static spark.Spark.*;
//
//public class App {
//    public static  void main(String[] args) { //type “psvm + tab” to autocreate this
//        staticFileLocation("/public");
//
//        //get: new hero form
//        get("/hero/new",(request, response) -> {
//            Map<String,Object> model = new HashMap<>();
//            return new ModelAndView(model,"hero-form.hbs");
//        },new HandlebarsTemplateEngine());
//
//        //post: process new hero form
//        post ("/hero/new",(request, response) -> {
//            Map<String,Object>model = new HashMap<>();
//            String name =request.queryParams("name");
//            int age = Integer.parseInt(request.queryParams("age"));
//            String power= request.queryParams("power");
//            String weakness = request.queryParams("weakness");
//            Hero newIdentity =new Hero(name,age,power,weakness);
//            model.put("hero",newIdentity);
//            return new ModelAndView(model,"pass.hbs");
//        }, new HandlebarsTemplateEngine());
//
//
//        //get: show an individual hero
//        get("/hero/:id",(request, response) -> {
//            Map<String,Object>model = new HashMap<>();
//            int idOfHeroToFind = Integer.parseInt(request.params(":id"));
//            Hero foundHero= Hero.findById(idOfHeroToFind);
//            model.put("hero",foundHero);
//            return new ModelAndView(model,"hero-detail.hbs");
//        }, new HandlebarsTemplateEngine());
//
//        //get: delete a hero
//        get("/hero/:id/delete" ,(request, response) -> {
//            Map<String,Object>model = new HashMap<>();
//            int idOfHeroToDelete = Integer.parseInt(request.params("id"));
//            Hero deleteHero = Hero.findById(idOfHeroToDelete);
//            deleteHero.deleteById(idOfHeroToDelete);
//            return new ModelAndView(model,"pass.hbs");
//        },new HandlebarsTemplateEngine());
//
//        //get: show squad form
//        get("/squad/list",(request, response) -> {
//            Map<String,Object> model = new HashMap<>();
//            return new ModelAndView(model,"squad-form.hbs");
//        },new HandlebarsTemplateEngine());
//
//
//        //post: process a squad form
//        post ("/squad/list",(request, response) -> {
//            Map<String,Object>model = new HashMap<>();
//            String name =request.queryParams("name");
//            int size = Integer.parseInt(request.queryParams("size"));
//            String cause = request.queryParams("cause");
//            Squad newSquadIdentity =new Squad(name,size,cause);
//            model.put("squad",newSquadIdentity );
//            return new ModelAndView(model,"pass2.hbs");
//        }, new HandlebarsTemplateEngine());
//
//
//        get("/squad/list",(request, response) -> {
//            Map<String, Object> model = new HashMap<>();
//            ArrayList<Squad> squads = Squad.getAll();
//            model.put("squads", squads);
//            return new ModelAndView(model, "squad-list.hbs");
//        },new HandlebarsTemplateEngine());
//
//    }
//}