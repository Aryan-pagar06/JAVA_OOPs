public class Employee
{
    private final String name;
    private final int salaray;

    public Employee(String name, int salaray) {
        this.name = name;
        this.salaray = salaray;
    }

    public String getName() {
        return name;
    }

    public int getSalaray() {
        return salaray;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee{");
        sb.append("name=").append(name);
        sb.append(", salaray=").append(salaray);
        sb.append('}');
        return sb.toString();
    }

}