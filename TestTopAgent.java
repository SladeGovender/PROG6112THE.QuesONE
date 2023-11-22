import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestTopAgent {

@Test
    public void topAgent_ReturnsTopPosition() {
        // Arrange
        double[][] totalSales = {
                {800000, 1500000, 2000000},  // Joe Bloggs
                {700000, 1200000, 1600000}   // Jane Doe
        };

        // Act
        int topAgentIndex = EstateAgent.topEstateAgent(totalSales);

        // Assert
        assertEquals(0, topAgentIndex); // Joe Bloggs should be the top-selling agent
    }
}
