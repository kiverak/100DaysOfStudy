package comp;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ApplicationScoped
public class Computer implements IComputer {

    private String name;
    private IMouse mouse;

    protected IMonitor monitor;

    public Computer() {
    }

    public Computer(String name) {
        this.name = name;
    }

    @Inject
    public Computer(IMouse mouse, IMonitor monitor) {
        this.mouse = mouse;
        this.monitor = monitor;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public IMonitor getMonitor() {
        return monitor;
    }

    public IMouse getMouse() {
        return mouse;
    }

    public void setMouse(IMouse mouse) {
        this.mouse = mouse;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMonitor(@Named("monitor") IMonitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public void on() {
        System.out.println("Компьютер включился " + name + ", используется монитор " + monitor.getName());
    }

    @Override
    public void off() {
        System.out.println("Компьютер выключился " + name + ", используется монитор " + monitor.getName());
    }
}
