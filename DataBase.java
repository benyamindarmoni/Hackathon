package hack;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DataBase
{
	static Course [] readCourseFile(String path)
	{
		ArrayList<Course>courses = new ArrayList<Course>();
		
		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while((line = br.readLine()) != null)
			{
				//ID
				int data_field_ind = line.indexOf(":");
				int c_id = Integer.parseInt(line.substring(data_field_ind + 1));
				
				data_field_ind = line.indexOf(":");
				String c_name = line.substring(data_field_ind + 1);
				
				data_field_ind = line.indexOf(":");
				String c_lecturer = line.substring(data_field_ind + 1);
				
				data_field_ind = line.indexOf(":");
				int c_points = Integer.parseInt(line.substring(data_field_ind + 1));
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
