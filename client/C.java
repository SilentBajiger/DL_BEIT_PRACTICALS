import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class C {
    public static void main(String[] args) {
        try {
            URL obj = new URL("http://localhost:8080/add?a=23&b=46");
            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
            conn.setRequestMethod("GET");

            int responseCode = conn.getResponseCode();

            if(responseCode == 200){
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));

                String inline;
                StringBuilder response = new StringBuilder();

                while((inline = in.readLine()) != null){
                    response.append(inline);
                }
                System.out.println("REsponse is " + response);
            }

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
            e.printStackTrace();
            
        }
    }
}
