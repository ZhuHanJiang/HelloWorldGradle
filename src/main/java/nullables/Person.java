package nullables;
import org.jetbrains.annotations.NotNull;

public class Person {
    @NotNull
    public String getTitle() {
        return "null" ;
    }
    public String getName() {
        return null;
    }
}
