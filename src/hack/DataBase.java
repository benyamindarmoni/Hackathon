package hack;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DataBase
{
	private static String course_file = "resource\\courses.txt";
	
	private static Course readSingleCourse(BufferedReader br, String first_line) throws IOException
	{
		String line = first_line;
		//ID
		int data_field_ind = line.indexOf(":");
		long c_id = Integer.parseInt(line.substring(data_field_ind + 1));
		line = br.readLine();
		
		data_field_ind = line.indexOf(":");
		String c_name = line.substring(data_field_ind + 1);
		line = br.readLine();
		
		data_field_ind = line.indexOf(":");
		String c_lecturer = line.substring(data_field_ind + 1);
		line = br.readLine();
		
		data_field_ind = line.indexOf(":");
		double c_points = Double.parseDouble(line.substring(data_field_ind + 1));
		line = br.readLine();
		
		data_field_ind = line.indexOf(":");
		int c_day = Integer.parseInt(line.substring(data_field_ind + 1));
		line = br.readLine();
		
		data_field_ind = line.indexOf(":");
		double c_start_time = Double.parseDouble(line.substring(data_field_ind + 1));
		line = br.readLine();
		
		data_field_ind = line.indexOf(":");
		double c_duration = Double.parseDouble(line.substring(data_field_ind + 1));
		line = br.readLine();
		
		data_field_ind = line.indexOf(":");
		int c_capacity = Integer.parseInt(line.substring(data_field_ind + 1));
		line = br.readLine();
		
		data_field_ind = line.indexOf(":");
		int c_registered = Integer.parseInt(line.substring(data_field_ind + 1));
		
		return (new Course(c_id, c_name, c_lecturer, c_points, 
				c_capacity, c_registered, new Ctime(c_day,c_start_time,c_duration)));
	}
	
	static ArrayList<Course> readCourseFile(String path)
	{
		ArrayList<Course>courses = new ArrayList<Course>();
		
		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while((line = br.readLine()) != null)
			{
				courses.add(readSingleCourse(br, line));
			}
			
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return courses;
	}
	
	static void updateNumOfStudents(long c_id, int new_val)
	{
		try {
			FileReader fr = new FileReader(course_file);
			BufferedReader br = new BufferedReader(fr);
			String line;
			StringBuffer inputBuffer = new StringBuffer();
			boolean found = false;
			while((line = br.readLine()) != null && !found)
			{
				inputBuffer.append(line);
				inputBuffer.append("\r\n");

				int data_field_ind = line.indexOf(":");
				long temp_id = Integer.parseInt(line.substring(data_field_ind + 1));

				if(temp_id == c_id)//This is the course to update.
				{
					found = true;
					for (int i = 0; i < 7; i++)
					{
						inputBuffer.append(br.readLine());
						inputBuffer.append("\r\n");
					}
					inputBuffer.append("registered:" + new_val);
					inputBuffer.append("\r\n");
				}
				else
				{
					//Read all object
					for (int i = 0; i < 8; i++)
					{
						inputBuffer.append(br.readLine());
						inputBuffer.append("\r\n");
					}
				}
			}
			
			while((line = br.readLine()) != null)
			{
				inputBuffer.append(line);
				inputBuffer.append("\r\n");
			}
			
			br.close();
			
			
			 // write the new string with the replaced line OVER the same file
	        FileOutputStream fileOut = new FileOutputStream(course_file);
	        fileOut.write(inputBuffer.toString().getBytes());
	        fileOut.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String []args)
	{
		ArrayList<Course> al = readCourseFile(course_file);
		Algorithm alg = new Algorithm();
		Constraints co = new Constraints();
		co.AddConstraint(new Ctime(1, 9, 5));
		co.AddConstraint(new Ctime(3, 16, 5));
		alg.sinun(alg.toArray(al), co);
		alg.build_scheduls();
		ScheduleContainer sc = new ScheduleContainer();
		GradeSort.sortByGradesstatic(sc);
		sc.getList().get(0).toString();
		System.out.println("\n\n\n\n\n\n\n");

		
	}
}
