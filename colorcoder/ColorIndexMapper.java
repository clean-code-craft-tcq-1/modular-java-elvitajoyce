package colorcoder;

public class ColorIndexMapper {

	public static void printColorCoding() {
		System.out.println("--------Reference manual--------");
		for (MajorColor majorColor : MajorColor.values()) {
			for (MinorColor minorColor : MinorColor.values()) {
				System.out.println(majorColor + " " + minorColor + " " + majorColor.getIndex() + minorColor.getIndex());
			}
		}
	}

}
