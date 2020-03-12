package BeanPackage;

public class EducationDetails {
	
	public enum DegreeTypeEnum {
		GRADUATE,
		MASTER,
		NONE
	}
	
	public String degree;
	public DegreeTypeEnum degreeType;
	
	
	public boolean isMaster() {
		return DegreeTypeEnum.MASTER == this.degreeType;
	}
	
	public boolean isGraduate() {
		if(DegreeTypeEnum.GRADUATE.equals(this.degreeType)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean hasDegree() {
		
		if(DegreeTypeEnum.GRADUATE.equals(this.degreeType)) {
			return true;
		} else if(DegreeTypeEnum.MASTER == this.degreeType){
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean hasDegree2() {
		
		if(DegreeTypeEnum.NONE.equals(this.degreeType)) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean hasDegree3() {
		
		return isGraduate() || isMaster();
		
	}

}
