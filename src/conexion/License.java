package conexion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;



public class License {
    String fecha;

    public String getFecha() {
        return fecha;
    }

    private void setFecha(String fecha) {
        try {
    this.fecha = fecha;   
        } catch (Exception e) {
        this.fecha = "";
        }
    }
    public License(String key,int ope)throws Exception{
        URL http;
   if(key.equals("")){
        key="0";
        }
  
        http = new URL("http://jbmserver.ddns.net/license/"+key+"/"+ope);
    
        URLConnection yc = http.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                                yc.getInputStream()));
        String input;
        while ((input = in.readLine()) != null){
            setFecha(input);
        }
        in.close();
    }

}
