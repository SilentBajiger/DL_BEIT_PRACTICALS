import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class U {
    public static void main(String[] args) {
        try {
            URL obj = new URL("http://localhost:8080/add?a=35&b=354");
            HttpURLConnection conn = (HttpURLConnection)obj.openConnection();
            conn.setRequestMethod("GET");

            int responseCode = conn.getResponseCode();

            if(responseCode == 200){
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String inline;
                StringBuilder response = new StringBuilder();
                while((inline = in.readLine()) != null){
                    response.append(inline);

                }
                System.out.println("OUTPUT IS "+response);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
