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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import static javax.ws.rs.client.ClientBuilder.newClient;

/**
 *
 * @author Duglas
 */
public class WebCourseRest {
    
    public JsonElement cursosWebGet(){

        String jsoncomplete="";
	  try {

                URL url = new URL("http://18.222.214.0:3000/api/cursos/");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
                conn.setRequestProperty("Content-Type", "application/json");
                conn.setRequestProperty("Authorization", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluQGluZ2VuaWVyaWEudXNhYy5lZHUuZ3QiLCJleHAiOjE1NDA3Nzg3MTksImlhdCI6MTU0MDE3MzkxOX0.SUdab5jIgAkdekUSw0KaJVXtg-8CalmR2Iq6a29_54Q");
                

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
    
    
public List dumpJSONElementCursosWeb(JsonElement elemento, List<WebCourse> webcourses) {

    String id_curso="";
    String nombre="";
    String creditos="";
    
    if (elemento.isJsonObject()) {
        System.out.println("Es objeto");
        JsonObject obj = elemento.getAsJsonObject();
        java.util.Set<java.util.Map.Entry<String,JsonElement>> entradas = obj.entrySet();
        java.util.Iterator<java.util.Map.Entry<String,JsonElement>> iter = entradas.iterator();
        while (iter.hasNext()) {
            java.util.Map.Entry<String,JsonElement> entrada = iter.next();
            //System.out.println("Clave: " + entrada.getKey());
            //System.out.println("Valor:" + entrada.getValue());
            
            if(entrada.getKey().equals("id_curso")){
                id_curso = entrada.getValue().toString().replaceAll("\"", "");
            }else if(entrada.getKey().equals("nombre")){
                nombre = entrada.getValue().toString().replaceAll("\"", "");
            }else if(entrada.getKey().equals("creditos")){
                creditos = entrada.getValue().toString().replaceAll("\"", "");
            }
        }
        webcourses.add(new WebCourse(id_curso,nombre,creditos));
 
    } else if (elemento.isJsonArray()) {
        JsonArray array = elemento.getAsJsonArray();
        //System.out.println("Es array. Numero de elementos: " + array.size());
        java.util.Iterator<JsonElement> iter = array.iterator();
        webcourses = new ArrayList();
        while (iter.hasNext()) {
            
            JsonElement entrada = iter.next();
            webcourses = dumpJSONElementCursosWeb(entrada,webcourses);
        }
    } 
    
    return webcourses;
}



    public void WebCoursePut(String codigo, String nombre, String creditos){
    
    	  try {

		URL url = new URL("http://18.222.214.0:3000/api/cursos/");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setDoOutput(true);
		conn.setRequestMethod("PUT");
		conn.setRequestProperty("Content-Type", "application/json");
                conn.setRequestProperty("Authorization", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluQGluZ2VuaWVyaWEudXNhYy5lZHUuZ3QiLCJleHAiOjE1NDA3Nzg3MTksImlhdCI6MTU0MDE3MzkxOX0.SUdab5jIgAkdekUSw0KaJVXtg-8CalmR2Iq6a29_54Q");
                
                
                
		String input =  "[\n" +
"  {\n" +
"    \"id_curso\": 283,\n" +
"    \"nombre\": \"Análisis y Diseño de Sistemas 1\",\n" +
"    \"creditos\": 5\n" +
"  }"+
"]";

                OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream());
                out.write(input);
                

                
		BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));
                out.close();
		String output;
		System.out.println("Output from Server .... \n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);
		}

		conn.disconnect();
                

	  } catch (MalformedURLException e) {

		e.printStackTrace();

	  } catch (IOException e) {

		e.printStackTrace();

	 }

	}

    
}
