import Utils.SheetsServiceUtil;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.security.GeneralSecurityException;

import java.util.List;

public class GoogleSheetsIntegrationTest {
    private static Sheets sheetService;
    private static String SPREADSHEET_ID = "187pjtXqxzTtWkCWm95yMtYFlt1pHaaH2lxMzVvsQ4wQ";

    @BeforeAll
    public static void setup() throws GeneralSecurityException, IOException {
        sheetService = SheetsServiceUtil.getSheetsService();
    }

    @Test
    public void readData() throws IOException {
        String range = "Sheet1!A2:B3";

        ValueRange response = sheetService.spreadsheets().values()
                .get(SPREADSHEET_ID, range)
                .execute();

        List<List<Object>> values = response.getValues();

        if (values == null || values.isEmpty()){
            System.out.println("No data found");
        }else {
            for (List row : values) {
                System.out.printf("%s : %s\n", row.get(0), row.get(1));
            }
        }
    }

}

