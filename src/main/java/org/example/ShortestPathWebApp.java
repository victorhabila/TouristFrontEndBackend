package org.example;

import spark.ModelAndView;

import spark.Spark;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;

import java.util.Map;

import static spark.Spark.*;

public class ShortestPathWebApp {

    public static void main(String[] args) {
        // Set up Spark configuration
        Spark.port(4567); // Set the port number for your application
        staticFiles.location("target/classes/templates/home.hbs"); // Serve static files from the "public" directory
       // get("/", ShortestPathWebApp::home, new HandlebarsTemplateEngine());

        get("/", (request, response) -> {
            // Logic to handle the home route
            // You can perform any necessary calculations or data retrieval here
            Map<String, Object> model = new HashMap<>();
            model.put("dwellingLatitude", 48.40194444);
            model.put("dwellingLongitude", 2.698055556);
            model.put("closestMonumentLatitude", 48.69361111);
            model.put("closestMonumentLongitude", 6.183333333);
            // Render the template and return it
            return new HandlebarsTemplateEngine()
                    .render(new ModelAndView(model, "home.hbs"));
        });




        // Define routes
        //Spark.get("/", (req, res) -> "Hello, Spark Java!");

        // Start the Spark server
        Spark.awaitInitialization();




    }

    // Route handler for the home page












}
