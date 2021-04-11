package Utils;

import java.io.IOException;
import java.security.GeneralSecurityException;

import Utils.GoogleAuthorizeUtil;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.sheets.v4.Sheets;

public class SheetsServiceUtil {
    private static String APPLICATION_NAME = "Google Sheets Example";
    public static Sheets getSheetsService() throws IOException, GeneralSecurityException {
        Credential credentia1 = GoogleAuthorizeUtil.authorize();
        return new Sheets.Builder(GoogleNetHttpTransport.newTrustedTransport(),
                JacksonFactory.getDefaultInstance(), credentia1)
                .setApplicationName(APPLICATION_NAME)
                .build();
    }
}
