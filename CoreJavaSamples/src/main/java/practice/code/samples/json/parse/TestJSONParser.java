package practice.code.samples.json.parse;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class TestJSONParser {

	 public static void main(String[] args) 
	   {
	      JSONParser parser=new JSONParser();
	      
		try {
			Object obj = parser.parse(new FileReader("C:/Users/pranav_gothadiya/Downloads/Data/Sample_Intel_Report1.json"));
			JSONArray array = (JSONArray)obj;
			for (int i = 0; i < array.size(); i++) {
				System.out.println(((JSONObject)array.get(i)).toString());	
			}
			System.out.println(array.size());
		} catch (Exception e) {
			e.printStackTrace();
		} 
		 
	   }
}
