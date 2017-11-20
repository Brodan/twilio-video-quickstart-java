import io.javalin.Javalin;

public class Main {

    // Find your Account Sid and Token at twilio.com/user/account
    public static final String ACCOUNT_SID = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
    public static final String AUTH_TOKEN = "YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY";
    public static final String TWILIO_NUMBER = "+15555555555";

    public static void main(String[] args) {
        Javalin app = Javalin.start(7000);
        app.get("/", ctx -> ctx.result("Hello World"));

        app.get("/token", ctx -> {
            ctx.result("Token");
        });
    }
}
