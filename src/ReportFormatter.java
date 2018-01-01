import java.util.logging.XMLFormatter;

public class ReportFormatter {
    String formattedValue;
    public ReportFormatter() {
    }

    private String convertObjectToXML(Object object)
    {
        return "XML : <title> "+object.toString()+"...xml";
    }

    private String convertObjectToCSV(Object object)
    {
        return "CSV : <title> "+object.toString()+"...csv";
    }

    public String getFormattedValue(Employee employee, FormatType formatType)
    {
        switch (formatType)
        {
            case XML:
                formattedValue = convertObjectToXML(employee);
            case CSV:
                formattedValue = convertObjectToCSV(employee);
        }
        return formattedValue;
    }
}
