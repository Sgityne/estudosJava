package maratonajava.javacore.aula18_enum.domain;

public enum CostumerType {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    public final int VALUE;
    private String reportName;

    CostumerType(int value, String reportName) {
        this.VALUE = value;
        this.reportName = reportName;
    }

    public static CostumerType CostumerTypePerReportName(String reportName){
        for (CostumerType costumerType : values()) {
            if (costumerType.getReportName().equals(reportName)){
                return costumerType;
            }
        }
        return null;
    }

    public String getReportName() {
        return reportName;
    }
}
