/**
 *
 * @author sladegovender
 */
public class EstateAgentApp {

    public static void main(String[] args) {
        // Property sales data for two estate agents for January, February, and March
        double[][] propertySales = {
                {800000, 1500000, 2000000},  // Joe Bloggs
                {700000, 1200000, 1600000}   // Jane Doe
        };

        // Create instances of EstateAgent for Joe Bloggs and Jane Doe
        System.out.println("ESTATE AGENT SALES REPORT"
                + "n/NAME      JAN      FEB     MAR"
                + "____________________________________");
        EstateAgent joeBloggs = new EstateAgent("Joe Bloggs", propertySales[0]);
        EstateAgent janeDoe = new EstateAgent("Jane Doe", propertySales[1]);

        // Print total property sales for each estate agent
        System.out.println("Total Property Sales:");
        System.out.println("Joe Bloggs: " + joeBloggs.getEstateAgentSales());
        System.out.println("Jane Doe: " + janeDoe.getEstateAgentSales());

        // Print total commission earned by each estate agent
        System.out.println("\nTotal Commission Earned (2%):");
        System.out.println("Joe Bloggs: " + joeBloggs.getEstateAgentCommission());
        System.out.println("Jane Doe: " + janeDoe.getEstateAgentCommission());

        // Print the top-selling estate agent
        System.out.println("\nTop-Selling Estate Agent:");
        int topAgentIndex = EstateAgent.topEstateAgent(propertySales);
        System.out.println("Index: " + topAgentIndex);
        System.out.println("Name: " + (topAgentIndex == 0 ? "Joe Bloggs" : "Jane Doe"));
    }
}
