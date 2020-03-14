package ClassExcericePackage;

import java.util.ArrayList;
import java.util.List;

public class ClassExerciseStart {
	
	public static void execute() {
		
		List<String> featureList = new ArrayList<>();
		featureList.add("Super LED Screen");
		featureList.add("Super LED Screen");
		featureList.add("Super LED Screen");
		featureList.add("Super LED Screen");
		
		Laptop apple = prepareLaptopData(
				16,
				"Macbook Pro",
				"A1234",
				16,
				256,
				"mac",
				20,
				featureList);
		
		Laptop dell = prepareLaptopData(
				16,
				"Think Pad",
				"D1234",
				8,
				256,
				"windows",
				25,
				featureList);
		
		int result = apple.compareTo(dell);
		if(result==1) {
			apple.print();
		} else if(result==-1) {
			dell.print();
		} else {
			apple.print();
			dell.print();
		}
		
		
		
	}
	
	public static Laptop prepareLaptopData(
			int screenSize,
			String modelName,
			String modelNumber,
			int ram,
			int hardDisk,
			String operatingSystem,
			int weight,
			List<String> featuresList) {
		
		Laptop laptop = new Laptop();
		laptop.setFeaturesList(featuresList);
		laptop.setHardDisk(hardDisk);
		laptop.setModelName(modelName);
		laptop.setModelNumber(modelNumber);
		laptop.setOperatingSystem(operatingSystem);
		laptop.setRam(ram);
		laptop.setScreenSize(screenSize);
		laptop.setWeight(weight);
		
		return laptop;
		
	}

}
