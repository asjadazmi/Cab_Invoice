public class InvoiceGenrator {
    private static final double MINIMUM_COST_PER_KILOMETER =10 ;
    private static final int COST_PER_TIME =1 ;
    double MINIMUM_fARE=5;

    public double calculateFare(double distance, int time){
        double totalFare= distance *MINIMUM_COST_PER_KILOMETER+time*COST_PER_TIME;

        if(totalFare<MINIMUM_fARE)
            return MINIMUM_fARE;
        return totalFare;
    }

    public InvoiceSummary calculateFare(Ride[] rides) {
        double totalFare=0;

        for(Ride ride:rides){
            this.calculateFare(ride.distance,ride.time);
        }
        return new InvoiceSummary(rides.length, totalFare);
    }
}
