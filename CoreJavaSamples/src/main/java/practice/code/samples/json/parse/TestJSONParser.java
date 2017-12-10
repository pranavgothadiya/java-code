package practice.code.samples.json.parse;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class TestJSONParser {

	 @SuppressWarnings("unchecked")
	public static void main(String[] args) 
	   {
	      JSONParser parser=new JSONParser();
	      
		try {
			Object obj = parser.parse(new FileReader("src/main/java/practice/code/samples/json/parse/example_2.json"));
			JSONObject jsonObj =  (JSONObject) obj;
			
			JSONObject quiz = (JSONObject) jsonObj.get("quiz");
			System.out.println("Objects under quiz: " + quiz.size());

			//Only with Java 8
			quiz.forEach((Object k1, Object v1) -> {
				System.out.println("L1: Item : " + k1 + " Count : " + v1);
				if("sport".equals(k1)){
					System.out.println("Hello sport");
					JSONObject inner1 = (JSONObject) ((JSONObject)v1).get("q1");

					inner1.forEach((Object k2, Object v2) -> {
						System.out.println("L2 Item : " + k2 + " Count : " + v2);
					});
					
				} else if ("maths".equals(k1)) {
					System.out.println("Hello maths");
				}
			});
			
			
			System.out.println();

		} catch (Exception e) {
			e.printStackTrace();
		} 
		 
	   }
}

/*
{
    "quiz": {
        "sport": {
            "q1": {
                "question": "Which one is correct team name in NBA?",
                "options": [
                    "New York Bulls",
                    "Los Angeles Kings",
                    "Golden State Warriros",
                    "Huston Rocket"
                ],
                "answer": "Huston Rocket"
            }
        },
        "maths": {
            "q1": {
                "question": "5 + 7 = ?",
                "options": [
                    "10",
                    "11",
                    "12",
                    "13"
                ],
                "answer": "12"
            },
            "q2": {
                "question": "12 - 8 = ?",
                "options": [
                    "1",
                    "2",
                    "3",
                    "4"
                ],
                "answer": "4"
            }
        }
    }
}
*/