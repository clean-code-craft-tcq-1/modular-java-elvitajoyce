package colorcoder;

public class ColorPair {
	private MajorColor majorColor;
	private MinorColor minorColor;

	public ColorPair(MajorColor major, MinorColor minor) {
		majorColor = major;
		minorColor = minor;
	}

	public MajorColor getMajor() {
		return majorColor;
	}

	public MinorColor getMinor() {
		return minorColor;
	}

	String ToString() {
		String colorPairStr = ColorCodeConstants.majorColorNames[majorColor.getIndex()];
		colorPairStr += " ";
		colorPairStr += ColorCodeConstants.minorColorNames[minorColor.getIndex()];
		return colorPairStr;
	}
	
	
}
