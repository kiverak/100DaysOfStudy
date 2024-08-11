package comp;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class Main {

    public static void main(String[] args) {

        Weld weld = new Weld();
        WeldContainer container = weld.initialize(); // будет пытаться найти файл beans.xml и считать оттуда настройки, где искать классы - в итоге создаст контейнер
//        WeldContainer container = weld.beanClasses(Monitor.class, Computer.class).initialize(); // НЕ будет пытаться найти файл beans.xml, а создаст контейнер на основе переданных классов

        IComputer comp = container.select(Computer.class).get();

        System.out.println("Mouse = " + comp.getMouse());
        System.out.println("Monitor = " + comp.getMonitor().getName());

        container.shutdown(); // завершаем контейнер
    }

}
