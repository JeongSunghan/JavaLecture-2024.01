package praticeExam;

public class Q04_Path {

	public static void main(String[] args) {
		String path = "C:\\Workspace\\Java\\lesson\\src\\praticeExam\\Q04_Path.java";
		String[] pathArr = path.split("\\\\");		// \\ 정규표현식의 오해
		String filename = pathArr[pathArr.length - 1];
		System.out.println(filename);
		
	}

}
