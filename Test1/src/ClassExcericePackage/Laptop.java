package ClassExcericePackage;

import java.util.List;

public class Laptop implements Comparable<Laptop>{
	int screenSize;
	String modelName;
	String modelNumber;
	int ram;
	int hardDisk;
	String operatingSystem;
	int weight;
	List<String> featuresList;
	
	public int getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getHardDisk() {
		return hardDisk;
	}
	public void setHardDisk(int hardDisk) {
		this.hardDisk = hardDisk;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public List<String> getFeaturesList() {
		return featuresList;
	}
	public void setFeaturesList(List<String> featuresList) {
		this.featuresList = featuresList;
	}
	@Override
	public int compareTo(Laptop o) {
		int hardDiskComparison = this.hardDisk-o.hardDisk;
		int weightComparison = this.weight - o.weight;
		int ramComparison = this.ram - o.ram;
		int featuresComparison = this.featuresList.size() - o.featuresList.size();
		
		if(hardDiskComparison>0 && weightComparison>0 && ramComparison>0 && featuresComparison>0) {
			return 1;
		} else if (hardDiskComparison<0 && weightComparison<0 && ramComparison<0 && featuresComparison<0) {
			return -1;
		} else if(hardDiskComparison==0 && weightComparison==0 && ramComparison==0 && featuresComparison==0) {
			return 0;
		} else if(hardDiskComparison>0) {
			return 1;
		} else if(weightComparison>0) {
			return 1;
		} else if(ramComparison>0) {
			return 1;
		} else if(featuresComparison>0) {
			return 1;
		} else {
			return -1;
		}
	}
	
	public void print() {
		System.out.println();
		System.out.println("Laptop model:: "+ this.modelName);
	}

}
