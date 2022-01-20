import com.blade.Blade;

public class Main {
    public static void main(String[] args) {
        Blade.of().get("/",ctx ->ctx.text("hello blade")).start();
    }
}
