import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCommision {

@test
public void calculateTotalCommission_ReturnsCommission() {
        // Arrange
        double[] propertySales = {800000, 1500000, 2000000};
        EstateAgent joeBloggs = new EstateAgent("Joe Bloggs", propertySales);

        // Act
        double commission = joeBloggs.getEstateAgentCommission();

        // Assert
        assertEquals(86000, commission, 0.01); // Considering double precision
    }
  }
