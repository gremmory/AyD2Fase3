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
import formSoap.mainform;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Duglas
 */
public class UserRest {
    
    public void loginpost(){
    
    	  try {

		URL url = new URL("http://18.222.214.0:3000/token");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setDoOutput(true);
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Content-Type", "application/json");
                //conn.setRequestProperty("Content-Type", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluQGluZ2VuaWVyaWEudXNhYy5lZHUuZ3QiLCJleHAiOjE1NDA3Nzg3MTksImlhdCI6MTU0MDE3MzkxOX0.SUdab5jIgAkdekUSw0KaJVXtg-8CalmR2Iq6a29_54Q");

		String input =  "{\n" +
"    \"id_usuario\": 1,\n" +
"    \"correo\": \"admin@ingenieria.usac.edu.gt\",\n" +
"    \"contrasena\": \"hola1234\",\n" +
"    \"rol\": 1\n" +
"  }";

		OutputStream os = conn.getOutputStream();
		os.write(input.getBytes());
		os.flush();


		BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

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
    
    
public void loginget(String user, String password,int tipo){

String jsoncomplete="";
	  try {

		//URL url = new URL("http://18.222.214.0:3000/api/usuarios/admin@ingenieria.usac.edu.gt/hola1234");
                //URL url = new URL("http://18.222.214.0:3000/api/usuarios/admin@ingenieria.usac.edu.gt");
                //URL url = new URL("http://18.222.214.0:3000/api/usuarios");
                URL url = null;
                if(tipo==0){
                    url = new URL("http://18.222.214.0:3000/api/usuarios/"+user+"/"+password);
                }else if(tipo==1){
                    url = new URL("http://18.222.214.0:3000/api/usuarios/"+user);
                }else{
                    url = new URL("http://18.222.214.0:3000/api/usuarios/");
                }
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
                conn.setRequestProperty("Content-Type", "application/json");
                conn.setRequestProperty("Authorization", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImFkbWluQGluZ2VuaWVyaWEudXNhYy5lZHUuZ3QiLCJleHAiOjE1NDA3Nzg3MTksImlhdCI6MTU0MDE3MzkxOX0.SUdab5jIgAkdekUSw0KaJVXtg-8CalmR2Iq6a29_54Q");

		if (conn.getResponseCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ conn.getResponseCode());
		}

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
          
          
          if(tipo==0){
            if(jsoncomplete.contains("true")){
                mainform mf = new mainform();
                mf.setVisible(true);
            }else{
                loginget(user,password,1);
            }
          }else if(tipo==1){
            if(jsoncomplete.contains("true")){
                JOptionPane.showMessageDialog(null, "Contraseña Incorrecta.", "Error", 0, null);
            }else{
                JOptionPane.showMessageDialog(null, "No existe el usuario.", "Error", 0, null);
            }
          }else{
              
          }
          

	}
    
     public JsonElement usersGet(){

        String jsoncomplete="";
	  try {

                URL url = new URL("http://18.222.214.0:3000/api/usuarios/");
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
    
    
public List dumpJSONElementUsers(JsonElement elemento, List<User> users) {

    String id_usuario="";
    String correo="";
    String contrasena="";
    String rol="";
    
    if (elemento.isJsonObject()) {
        System.out.println("Es objeto");
        JsonObject obj = elemento.getAsJsonObject();
        java.util.Set<java.util.Map.Entry<String,JsonElement>> entradas = obj.entrySet();
        java.util.Iterator<java.util.Map.Entry<String,JsonElement>> iter = entradas.iterator();
        while (iter.hasNext()) {
            java.util.Map.Entry<String,JsonElement> entrada = iter.next();
            //System.out.println("Clave: " + entrada.getKey());
            //System.out.println("Valor:" + entrada.getValue());
            
            if(entrada.getKey().equals("id_usuario")){
                id_usuario = entrada.getValue().toString().replaceAll("\"", "");
            }else if(entrada.getKey().equals("correo")){
                correo = entrada.getValue().toString().replaceAll("\"", "");
            }else if(entrada.getKey().equals("contrasena")){
                contrasena = entrada.getValue().toString().replaceAll("\"", "");
            }else if(entrada.getKey().equals("rol")){
                rol = entrada.getValue().toString().replaceAll("\"", "");
            }
        }
        users.add(new User(id_usuario,correo,contrasena,rol));
 
    } else if (elemento.isJsonArray()) {
        JsonArray array = elemento.getAsJsonArray();
        //System.out.println("Es array. Numero de elementos: " + array.size());
        java.util.Iterator<JsonElement> iter = array.iterator();
        users = new ArrayList();
        while (iter.hasNext()) {
            
            JsonElement entrada = iter.next();
            users = dumpJSONElementUsers(entrada,users);
        }
    } 
    
    return users;
}
    
}
