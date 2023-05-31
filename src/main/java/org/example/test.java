package org.example;

import spark.Spark;

public class test {

    public static void main(String[] args) {
        // Set up Spark configuration
        Spark.port(4567); // Set the port number for your application

        // Define routes
        Spark.get("/", (req, res) -> "Hello, Spark Java!");

        // Start the Spark server
        Spark.awaitInitialization();

        }
}
