package testers;

public class CheckStatic {
	private static int ps1;
	public String tempStr;

	static {
		ps1 = 10;
	}

	public CheckStatic() {
		tempStr = "tempStr";
	}

	public static class InsideStaticClass {
		private static int ps2;
		private int ps3;
		private String innerStr;

		static {
			ps2 = 11;
		}

		public InsideStaticClass() {
			ps3 = 12;
			innerStr = "innerStr";
		}

		public void printAll(){
			System.out.println(ps1);
		}
	}

	public void printAll() {
		System.out.println(InsideStaticClass.ps2);
	}
}