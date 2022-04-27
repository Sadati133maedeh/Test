package GV.Package;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import com.opencsv.CSVReader;


public class DataProviders {
	
	@DataProvider(name = "Login")
	public Iterator<Object[]> Login () throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_GV/Login.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();
	}
	
	
	
	@DataProvider(name = "AddSpeciality")
	public Iterator<Object[]> AddSpeciality() throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_GV/AddSpeciality.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();
	}
	
	@DataProvider(name = "AddLicense")
	public Iterator<Object[]> AddLicense() throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_GV/AddLicense.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();
	}
	
	@DataProvider(name = "AddInsurance")
	public Iterator<Object[]> AddInsurance() throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_GV/AddInsurance.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();
	}
	
	@DataProvider(name = "AddCenterPart")
	public Iterator<Object[]> AddCenterPart() throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_GV/AddCenterPart.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();
	}
	
	@DataProvider(name = "Service_Search")
	public Iterator<Object[]> Service_Search() throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_GV/Service_Search.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();
	}
	
	@DataProvider(name = "DeActive_GroupService")
	public Iterator<Object[]> DeActive_GroupService() throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_GV/DeActive_GroupService.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();
	}

	@DataProvider(name = "clippingServiceName")
	public Iterator<Object[]> clippingServiceName() throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_GV/clippingServiceName.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();
	}
	
	@DataProvider(name = "CopyServiceName")
	public Iterator<Object[]> CopyServiceName() throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_GV/CopyServiceName.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();
	}
	
	@DataProvider(name = "CheckCopyServiceName")
	public Iterator<Object[]> CheckCopyServiceName() throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/test/resources/data/CSVFiles_GV/CheckCopyServiceName.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();
	}







} 