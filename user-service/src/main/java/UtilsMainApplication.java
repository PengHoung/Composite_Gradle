import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UtilsMainApplication {
    public static void main(String[] args){
        Greeting greeting = new Greeting();
       greeting.greet();
    }
}
