package mate.academy.HWpatterns.flyweightAndPrototype;

import java.util.HashMap;
import java.util.Map;

public class DevFactory {
    private static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDevSpeciality(String speciality) {
        Developer developer = developers.get(speciality);

        if (developer == null) {
            switch (speciality) {
                case "java":
                    System.out.println("Hiring java developer ...");
                    developer = new JavaDeveloper();
                    break;

                case "c++":
                    System.out.println("Hiring c++ developer ...");
                    developer = new CppDeveloper();
                    break;
            }

            developers.put(speciality, developer);
        }

        return developer;
    }
}
