package comp;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class Main {

    public static void main(String[] args) {

        // т.к. это JavaSE, а не веб приложение, приходится создавать контейнер вручную
        Weld weld = new Weld();

        // старутем контейнер
        WeldContainer container = weld.initialize(); // будет пытаться найти файл beans.xml и считать оттуда настройки, где искать классы - в итоге создаст контейнер
//        WeldContainer container = weld.beanClasses(Monitor.class, Computer.class).initialize(); // НЕ будет пытаться найти файл beans.xml, а создаст контейнер на основе переданных классов

        // получаем из контейнера объекты - для проверки
        IMonitor monitor = container.select(IMonitor.class).get();
        IComputer comp = container.select(IComputer.class).get();

        // проверяем, что они не пустые
        System.out.println("monitor = " + monitor.getName());
        System.out.println("comp = " + comp.getMonitor()); // монитор внедряется с помощью DI

        container.shutdown(); // завершаем контейнер


    }

}
