import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestEstateAgent {

    @Test
    public void calculateTotalSales_ReturnsTotalSales() {
        // Arrange
        double[] propertySales = {800000, 1500000, 2000000};
        EstateAgent joeBloggs = new EstateAgent("Joe Bloggs", propertySales);

        // Act
        double totalSales = joeBloggs.getEstateAgentSales();

        // Assert
        assertEquals(4300000, totalSales, 0.01); // Considering double precision
    }
