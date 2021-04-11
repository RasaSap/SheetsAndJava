import Utils.SheetsServiceUtil;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.*;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class GoogleSheetsIntegrationTest2 {
    private static Sheets sheetService;
    private static String SPREADSHEET_ID = "187pjtXqxzTtWkCWm95yMtYFlt1pHaaH2lxMzVvsQ4wQ";

    @BeforeAll
    public static void setup() throws GeneralSecurityException, IOException {
        sheetService = SheetsServiceUtil.getSheetsService();
    }

    @Test
    public void writeData() throws IOException {
        Object a1 = new Object();
        a1 = "Expenses January";
        Object a2 = new Object();
        a2 = "books";
        Object a3 = new Object();
        a3 = "pens";

        Object b2 = new Object();
        b2 = "30";
        Object b3 = new Object();
        b3 = "10";

        Object c1 = new Object();
        c1 = "Expenses February";
        Object c2 = new Object();
        c2 = "clothes";
        Object c3 = new Object();
        c3 = "shoes";

        Object d2 = new Object();
        d2 = "20";
        Object d3 = new Object();
        d3 = "5";

        ValueRange appendBody = new ValueRange()
                .setValues(Arrays.asList(
                        Arrays.asList(a1),
                        Arrays.asList(a2, b2),
                        Arrays.asList(a3, b3),
                        Arrays.asList(c1),
                        Arrays.asList(c2 , d2),
                        Arrays.asList(c3, d3)));

        AppendValuesResponse appendResult = sheetService.spreadsheets().values()
                .append(SPREADSHEET_ID, "Sheet1", appendBody)
                .setValueInputOption("USER_ENTERED")
                .setInsertDataOption("INSERT_ROWS")
                .setIncludeValuesInResponse(true)
                .execute();
    }
}
