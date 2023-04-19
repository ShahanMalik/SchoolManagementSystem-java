
public class _Bus {
    private int totalBuses;

    public _Bus(int totalBuses) {
        this.totalBuses = totalBuses;
    }

    public int getTotalBuses() {
        return totalBuses;
    }

    public void setTotalBuses(int totalBuses) {
        this.totalBuses = totalBuses;
    }

    @Override
    public String toString() {
        return "_Bus [totalBuses=" + totalBuses + "]";
    }
    
    public void showDetails() {
        System.out.println("totalBuses =" + totalBuses );
    }
    

}
