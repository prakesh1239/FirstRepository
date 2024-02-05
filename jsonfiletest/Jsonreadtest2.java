package jsonfiletest;


import java.io.FileReader;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Jsonreadtest2 {

	public static void main(String[] args) throws Exception {

        JsonParser jsonparser = new JsonParser();

        FileReader fileread = new FileReader("D:\\javaseason\\maventest\\json\\test2.json");

        JsonArray jsonArray = jsonparser.parseReader(fileread).getAsJsonArray();
		
		for(int i=0;i<jsonArray.size();i++) {
			
			JsonObject obj= jsonArray.get(i).getAsJsonObject();
			
		System.out.println(obj.get("id"));
		
		System.out.println(obj.get("name"));

		System.out.println(obj.get("email"));

		System.out.println(obj.get("gender"));

		System.out.println(obj.get("status"));

		
	
		
		
			
                     
			
			
		}
		
	}

}
