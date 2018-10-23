/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formRest;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Duglas
 */
public class ProfessorRest {
    
    String jsoncomplete="";
        public JsonElement calificacionpost(String id){
    
    	  try {

		URL url = new URL("http://35.224.130.227/AYD2_BACKEND/api_Movil/get_calificacion");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setDoOutput(true);
		conn.setRequestMethod("POST");
                conn.setRequestProperty("Content-Type", "application/json");
		//conn.setRequestProperty("id_personal", "200510101");
                //conn.setRequestProperty("Content-Type", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluQGluZ2VuaWVyaWEudXNhYy5lZHUuZ3QiLCJleHAiOjE1NDA3Nzg3MTksImlhdCI6MTU0MDE3MzkxOX0.SUdab5jIgAkdekUSw0KaJVXtg-8CalmR2Iq6a29_54Q");

		String input =  "{\"id_personal\":"+id+"}";

		OutputStream os = conn.getOutputStream();
		os.write(input.getBytes());
		os.flush();

             
		/*if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
			throw new RuntimeException("Failed : HTTP error code : "
				+ conn.getResponseCode());
		}*/

		BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

		String output;
		System.out.println("Output from Server .... \n");
		while ((output = br.readLine()) != null) {
                        System.out.println(output);
                        jsoncomplete = jsoncomplete + output;
		}

		conn.disconnect();

	  } catch (MalformedURLException e) {

		e.printStackTrace();

	  } catch (IOException e) {

		e.printStackTrace();

	 }
          
        System.out.println(jsoncomplete);
        JsonParser parser = new JsonParser();
        JsonElement datos = parser.parse(jsoncomplete);
        return datos;

	}
        
    public JsonElement catedraticoget(){

        String jsoncomplete="";
	  try {

                URL url = new URL("http://35.224.130.227/AYD2_BACKEND/api_Movil/get_catedraticos");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
                conn.setRequestProperty("Content-Type", "application/json");
                

		BufferedReader br = new BufferedReader(new InputStreamReader(
			(conn.getInputStream())));
                
                
		String output;
		System.out.println("Output from Server .... \n");
		while ((output = br.readLine()) != null) {
                        System.out.println(output);
                        jsoncomplete = jsoncomplete + output;
		}

		conn.disconnect();

	  } catch (MalformedURLException e) {

		e.printStackTrace();

	  } catch (IOException e) {

		e.printStackTrace();

	  }

        
        System.out.println(jsoncomplete);
        JsonParser parser = new JsonParser();
        JsonElement datos = parser.parse(jsoncomplete);
        
        return datos;

	}
    
    
public List dumpJSONElementCatedraticos(JsonElement elemento, List<Professor> catedraticos) {

    String id_personal="";
    String cui="";
    String nombre="";
    String apellido="";
    String fechanac="";
    
    if (elemento.isJsonObject()) {
        System.out.println("Es objeto");
        JsonObject obj = elemento.getAsJsonObject();
        java.util.Set<java.util.Map.Entry<String,JsonElement>> entradas = obj.entrySet();
        java.util.Iterator<java.util.Map.Entry<String,JsonElement>> iter = entradas.iterator();
        while (iter.hasNext()) {
            java.util.Map.Entry<String,JsonElement> entrada = iter.next();
            //System.out.println("Clave: " + entrada.getKey());
            //System.out.println("Valor:" + entrada.getValue());
            
            if(entrada.getKey().equals("id_personal")){
                id_personal = entrada.getValue().toString().replaceAll("\"", "");
            }else if(entrada.getKey().equals("cui")){
                cui = entrada.getValue().toString().replaceAll("\"", "");
            }else if(entrada.getKey().equals("nombre")){
                nombre = entrada.getValue().toString().replaceAll("\"", "");
            }else if(entrada.getKey().equals("apellido")){
                apellido = entrada.getValue().toString().replaceAll("\"", "");
            }else if(entrada.getKey().equals("fecha_nac")){
                fechanac = entrada.getValue().toString().replaceAll("\"", "");
            }
        }
        catedraticos.add(new Professor(id_personal,cui,nombre,apellido,fechanac));
 
    } else if (elemento.isJsonArray()) {
        JsonArray array = elemento.getAsJsonArray();
        //System.out.println("Es array. Numero de elementos: " + array.size());
        java.util.Iterator<JsonElement> iter = array.iterator();
        catedraticos = new ArrayList();
        while (iter.hasNext()) {
            
            JsonElement entrada = iter.next();
            catedraticos = dumpJSONElementCatedraticos(entrada,catedraticos);
        }
    } 
    
    return catedraticos;
}


public Qualification dumpJSONElementCalificacion(JsonElement elemento, Qualification cal) {

    String puntual="";
    String dominio="";
    String respeto="";
    String didacta="";
    String responsable="";
    String promedio="";
    
    if (elemento.isJsonObject()) {
        System.out.println("Es objeto");
        JsonObject obj = elemento.getAsJsonObject();
        java.util.Set<java.util.Map.Entry<String,JsonElement>> entradas = obj.entrySet();
        java.util.Iterator<java.util.Map.Entry<String,JsonElement>> iter = entradas.iterator();
        while (iter.hasNext()) {
            java.util.Map.Entry<String,JsonElement> entrada = iter.next();
            //System.out.println("Clave: " + entrada.getKey());
            //System.out.println("Valor:" + entrada.getValue());
            
            if(entrada.getKey().equals("puntual")){
                puntual = entrada.getValue().toString().replaceAll("\"", "");
            }else if(entrada.getKey().equals("dominio")){
                dominio = entrada.getValue().toString().replaceAll("\"", "");
            }else if(entrada.getKey().equals("respeto")){
                respeto = entrada.getValue().toString().replaceAll("\"", "");
            }else if(entrada.getKey().equals("didacta")){
                didacta = entrada.getValue().toString().replaceAll("\"", "");
            }else if(entrada.getKey().equals("responsable")){
                responsable = entrada.getValue().toString().replaceAll("\"", "");
            }else if(entrada.getKey().equals("promedio")){
                promedio = entrada.getValue().toString().replaceAll("\"", "");
            }
        }
        cal = new Qualification(puntual,dominio,respeto,didacta,responsable,promedio);
 
    } else if (elemento.isJsonArray()) {
        JsonArray array = elemento.getAsJsonArray();
        //System.out.println("Es array. Numero de elementos: " + array.size());
        java.util.Iterator<JsonElement> iter = array.iterator();
        while (iter.hasNext()) {
            
            JsonElement entrada = iter.next();
            cal = dumpJSONElementCalificacion(entrada,cal);
        }
    } 
    
    return cal;
}

}