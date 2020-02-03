/*
import java.net.*;

public class kursy {
	public static void main(String[] args) {
		URL polaczenie = new URL("http://api.nbp.pl/api/exchangerates/tables/C");
		
		
	}
}




import java.io.*;
import java.net.*;
try {
URL url = new URL("http://api.nbp.pl/api/exchangerates/tables/C");
HttpURLConnection huc = (HttpURLConnection) url.openConnection();
for (int i = 1; i <= 20; i++) {
	System.out.println(huc.getHeaderFieldKey(i) + " = " + huc.getHeaderField(i));
}
huc.disconnect();
} catch (Exception e) {
System.out.println(e);
}
*/