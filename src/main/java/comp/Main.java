package comp;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class Main {

    public static void main(String[] args) {

        Weld weld = new Weld();
        WeldContainer container = weld.initialize(); // будет пытаться найти файл beans.xml и считать оттуда настройки, где искать классы - в итоге создаст контейнер
//        WeldContainer container = weld.beanClasses(Monitor.class, Computer.class).initialize(); // НЕ будет пытаться найти файл beans.xml, а создаст контейнер на основе переданных классов

        // получаем из контейнера объекты - для проверки
        IComputer comp1 = container.select(Computer.class).get(); // чтобы получить конкретный объект - явно указываем его тип
        IComputer comp2 = container.select(ComputerNew.class).get(); // чтобы получить конкретный объект - явно указываем его тип


        System.out.println("comp1.getMouse() = " + comp1.getMonitor());
        System.out.println("comp2.getMouse() = " + comp2.getMonitor());

        container.shutdown(); // завершаем контейнер
    }

}
