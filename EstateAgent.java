/**
 *
 * @author sladegovender
 */

interface IEstateAgent {
    double estateAgentSales(double[] propertySales);

    double estateAgentCommission(double propertySales);

    int topEstateAgent(double[][] totalSales);
}

class EstateAgent implements IEstateAgent {
    private String name;
    private double[] propertySales;

    public EstateAgent(String name, double[] propertySales) {
        this.name = name;
        this.propertySales = propertySales;
    }

    public double getEstateAgentSales() {
        return estateAgentSales(propertySales);
    }

    public double getEstateAgentCommission() {
        return estateAgentCommission(propertySales);
    }

    @Override
    public double estateAgentSales(double[] propertySales) {
        double totalSales = 0;
        for (double sale : propertySales) {
            totalSales += sale;
        }
        return totalSales;
    }

    @Override
    public double estateAgentCommission(double propertySales) {
        return 0.02 * propertySales;
    }

    @Override
    public int topEstateAgent(double[][] totalSales) {
        double joeBloggsTotalSales = estateAgentSales(totalSales[0]);
        double janeDoeTotalSales = estateAgentSales(totalSales[1]);

        return joeBloggsTotalSales > janeDoeTotalSales ? 0 : 1;
    }
}
