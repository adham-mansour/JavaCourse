package app;

public class Turbine {
    private double status;
    private double maxPower;

    public Turbine(double maxPower) {
        this.maxPower = maxPower;
        this.status = 0;
    }

    public double getMaxPower() {
        return maxPower;
    }

    public double getStatus() {
        return status;
    }

    public void setStatus(double status) {
        if(status >= 0 && status <= 1)
            this.status = status;
    }
}
