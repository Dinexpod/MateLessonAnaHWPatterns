package mate.academy.HWpatterns.flyweightAndPrototype;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
//      Flywaight pattern
        DevFactory devFactory = new DevFactory();

        List<Developer> developers = new ArrayList<>();

        developers.add(devFactory.getDevSpeciality("java"));
        developers.add(devFactory.getDevSpeciality("java"));
        developers.add(devFactory.getDevSpeciality("c++"));
        developers.add(devFactory.getDevSpeciality("c++"));

        for (Developer developer : developers) {
            developer.writeCode();
        }

        System.out.println();

//      Prototype pattern
        Project master = new Project("Cool Project", 500);

        System.out.println(master);

        ProjectFactory projectFactory = new ProjectFactory(master);
        Project clone = projectFactory.cloneProject();

        System.out.println(clone);

        clone.setName("Clone");

        System.out.println("\nafter change\n");

        System.out.println(master);
        System.out.println(clone);
    }
}
