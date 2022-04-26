package misaligned;

public class Misaligned {
    static int printColorMap() {
        String majorColors[] = {"White", "Red", "Black", "Yellow", "Violet"};
        String minorColors[] = {"Blue", "Orange", "Green", "Brown", "Slate"};
        int majorColorIndex = 0, minorColorIndex = 0;
        for(majorColorIndex = 0; majorColorIndex < 5; majorColorIndex++) {
            for(minorColorIndex = 0; minorColorIndex < 5; minorColorIndex++) {
            	assert(getPairNumberFromColor(majorColorIndex, minorColorIndex) == majorColorIndex * 5 + minorColorIndex);
                System.out.printf("%d | %s | %s\n", majorColorIndex * 5 + minorColorIndex, majorColors[majorColorIndex], minorColors[majorColorIndex]);
            }
        }
        return majorColorIndex * minorColorIndex;
    }
    
    public static int getPairNumberFromColor(int majorColorIndex, int minorColorIndex) {
        String minorColors[] = {"Blue", "Orange", "Green", "Brown", "Slate"};
        return majorColorIndex * minorColors.length + minorColorIndex + 1;
    }
    
    public static void main(String[] args) { 
        int result = printColorMap();
        assert(result == 25);
        System.out.println("All is well (maybe!)");
    }
}
