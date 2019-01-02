package mate.academy.HWpatterns.flyweightAndPrototype;

public class Project implements Copyable {
    private String name;
    private int cost;

    public Project(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public Object copy() {
        return new Project(name, cost);
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
