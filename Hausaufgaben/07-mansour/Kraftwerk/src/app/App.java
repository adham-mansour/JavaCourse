package app;

public class App {
    public static void main(String[] args) {
        Turbine t1 = new Turbine(70);
        Turbine t2 = new Turbine(70);
        Turbine t3 = new Turbine(85);
        Turbine t4 = new Turbine(85);
        Turbine[] turbines = { t1, t2, t3, t4 };
        PowerPlant pp = new PowerPlant("Aschach", "Donau", turbines);
        pp.turbines[0].setStatus(0.70);
        pp.turbines[1].setStatus(0.75);
        pp.turbines[2].setStatus(0.65);
        pp.turbines[3].setStatus(0.8);
        pp.showStatus();
    }
}