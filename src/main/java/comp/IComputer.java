package comp;

public interface IComputer {

    String getName();
    IMonitor getMonitor();
    IMouse getMouse();
    void setMouse(IMouse mouse);

    void on();
    void off();

}
