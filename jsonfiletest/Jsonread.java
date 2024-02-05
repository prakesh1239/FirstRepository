package jsonfiletest;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Jsonread {
	public static void main(String[] args) throws Exception {
	
		JsonParser jsonparser=new JsonParser();
		
		FileReader reader=new FileReader("D:\\javaseason\\maventest\\json\\test1.json");
		
		JsonObject jsonObject=  jsonparser.parseReader(reader).getAsJsonObject();
		
            System.out.println(jsonObject.get("Firstname"));
            
            System.out.println(jsonObject.get("Lastname"));
            
	     JsonArray array  = (JsonArray) jsonObject.get("users");
	     
	     for(int i=0;i<array.size();i++) {
	    	 
	    JsonObject users =(JsonObject) array.get(i);
	    
	    JsonElement name=users.get("name");
	    JsonElement age= users.get("age");
	    JsonElement education=users.get("education");
	    
	    System.out.println("users of "+i+ "is....");
	    System.out.println("name is "+name);
	    
	    System.out.println("name is "+age);

	    System.out.println("name is "+education);

	     }

}
}
