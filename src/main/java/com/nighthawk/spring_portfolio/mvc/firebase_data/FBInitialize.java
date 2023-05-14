package com.nighthawk.spring_portfolio.mvc.firebase_data;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.FileInputStream;

@Service
public class FBInitialize {

    @PostConstruct
    public void initialize() {
        try {
            FileInputStream serviceAccount =
            new FileInputStream("src/main/java/com/nighthawk/spring_portfolio/mvc/firebase_data/aurorae-be25d-firebase-adminsdk-rte19-8dd35f8bf2.json");
          
          FirebaseOptions options = new FirebaseOptions.Builder()
            .setCredentials(GoogleCredentials.fromStream(serviceAccount))
            .setDatabaseUrl("https://aurorae-be25d-default-rtdb.firebaseio.com")
            .build();
          
          FirebaseApp.initializeApp(options);
          System.out.println("ran");

                  } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
