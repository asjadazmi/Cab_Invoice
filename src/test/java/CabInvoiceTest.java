import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CabInvoiceTest {
    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare(){
        InvoiceGenrator invoiceGenrator= new InvoiceGenrator();
        double distance=2.0;
        int time=5;
        double fare=invoiceGenrator.calculateFare(distance,time);
        Assertions.assertEquals(25,fare,0.0);

    }
}
