package InterfaceExamplePackage;

public class InterfaceHelper {
	
	public void getAndPrint(InstituteEntity insituteEntity) {
		Object data = insituteEntity.getData();
		insituteEntity.printData(data);
	}

}
