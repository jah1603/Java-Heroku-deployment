import spark.Spark;

import static spark.Spark.get;

public class Main {
    public static void main(String[] args) {

        // In order for this to work on Heroku, we need to allow Heroku to set the port number
        final String portNumber = System.getenv("PORT");
        if (portNumber != null) {
            Spark.port(Integer.parseInt(portNumber));
        }

        get("/hello", (req, res) -> "Hellooo, World!");
    }
}
