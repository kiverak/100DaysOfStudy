package comp;

public class MonitorNew implements IMonitor {
    private String name = "monitor_new";

    public MonitorNew(String name) {
        this.name = name;
    }

    public MonitorNew() {
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
