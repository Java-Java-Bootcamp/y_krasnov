import java.util.List;

public class Application {
    static List<Worker> getYoungWorkers(List<Worker> workers) {
        return workers.stream()
                .filter(it -> it.getAge() < 30)
                .toList();
    }


    public static void main(String[] args) {

    }
}
