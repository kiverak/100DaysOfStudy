package comp;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ComputerNew implements IComputer {

    private String name;
    private IMouse mouse;

//    @Inject
//    @Named("monitorNew")
    private IMonitor monitor; // в эту переменную будет подставлен конкретный объект (это может быть неизвестно самой переменной)

    public ComputerNew(String name) {
        this.name = name;
    }

    public ComputerNew() {
    }

    @Inject
    public ComputerNew(IMouse mouse, IMonitor monitor) {
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

    @Override
    public IMouse getMouse() {
        return mouse;
    }

    public void setMouse(IMouse mouse) {
        this.mouse = mouse;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMonitor(IMonitor monitor) {
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
