package edu.ucsb.cs56.pconrad;

import static spark.Spark.port;

import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.mustache.MustacheTemplateEngine;


public class MainClass {

    public static void main(String[] args) {

        port(getHerokuAssignedPort());

		System.out.println("");
		System.out.println("(Don't worry about the warnings below about SLF4J... we'll deal with those later)");
		System.out.println("");
		System.out.println("In browser, visit: http://localhost:" + getHerokuAssignedPort() + "/hello");
		System.out.println("");
    spark.Spark.get("/", (req, res) -> {res.redirect("/todo");return null;});
    Map taskList = new HashMap();
    taskList.put("task", "One");
    taskList.put("task", "Two");
    taskList.put("task", "Three");

  //   spark.Spark.get("/todo", (rq, rs) -> {
  //
  //     return new ModelAndView(taskList, "todo.mustache");
  //   },
  //   new MustacheTemplateEngine() );

	}

    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }


}
