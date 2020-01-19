package app;

public class PowerPlant {
    public String location;
    public String riverName;
    public Turbine turbines[];

    public PowerPlant(String location, String riverName, Turbine[] turbines) {
        this.location = location;
        this.riverName = riverName;
        this.turbines = turbines;
    }

    public double getMaxPower(){
        double result = 0;
        for(Turbine t : this.turbines){
            result += t.getMaxPower();
        }
        return result;
    }

    public double getCurrentPower(){
        double result = 0;
        for(Turbine t : this.turbines){
            result += (t.getStatus() * t.getMaxPower());
        }
        return result;
    }

    public void showStatus(){
        System.out.println(String.format("PowerPlant %s / %s", this.location, this.riverName));
        System.out.println(String.format("Turbine Count: %d", this.turbines.length));
        System.out.println(String.format("Maximum Output: %.2f MW", this.getMaxPower()));
        System.out.println(String.format("Current Output: %.2f MW", this.getCurrentPower()));
        int turbineNumber = 1;
        String s = "\n";
        for(Turbine t: this.turbines)
        {
            s += String.format("\tTurbine %d: Max Power: %.2f MW, Current Power: %.2f MW\n",turbineNumber++,t.getMaxPower(),t.getStatus()*t.getMaxPower());
        }
        s+="\n";
        System.out.println(s);
    }
}
