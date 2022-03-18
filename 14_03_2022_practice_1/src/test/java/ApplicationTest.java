import org.testng.annotations.Test;

import java.util.List;

class ApplicationTest {

    @Test
    void testGetYoungWorkers() {
        var v1 = new Worker("Ivan", "Ivanov", Sex.MALE,
                30, "Engineer", "Moscow");
        var v2 = new Worker("Ivana", "Ivanova", Sex.FEMALE,
                31, "Engineer", "Moscow");

//        assert(Application.getYoungWorkers(List.of());
    }

}
