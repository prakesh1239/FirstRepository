package jsonfiletest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JsonRead3 {

	public static void main(String[] args) throws Exception {

		JsonParser jsonparse=new JsonParser() ;
		 
		FileReader fileread=new FileReader("D:\\javaseason\\maventest\\json\\test3.json");
		
		JsonObject jsonobject=jsonparse.parseReader(fileread).getAsJsonObject();

		System.out.println(jsonobject.get("company"));
		
		System.out.println(jsonobject.get("employees"));
		
		System.out.println(jsonobject.get("address"));

		JsonArray jsonarray=(JsonArray) jsonobject.get("employees");
		
		for(JsonElement jsonelement:jsonarray) {
			
		 	JsonObject object 	=jsonelement.getAsJsonObject();
		 	
		 	JsonElement name= object.get("name");
		 	JsonElement position= object.get("position");
		 	JsonElement department= object.get("department");
		 	
		 	System.out.println("name is"+name);
		 	System.out.println("position is"+position);
		 	System.out.println("department is"+department);
		 	System.out.println();




		}

		
	}

}

