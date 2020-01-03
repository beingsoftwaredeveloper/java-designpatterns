import java.util.HashMap;
import java.util.Map;

enum BeverageChoice {
	COFFE(1), 
	TEA(2), 
	GREENTEA(3), 
	ESPRESSO(4), 
	CAPACHINO(5);
	
	private int value;
	private static Map map = new HashMap<>();
	public int getValue() {
		return value;
	}
	
	private BeverageChoice(int value) {
		this.value = value;
	}
	static {
        for (BeverageChoice beverageChoice : BeverageChoice.values()) {
            map.put(beverageChoice.value, beverageChoice);
        }
    }
	
	public static BeverageChoice valueOf(int beverageChoice) {
        return (BeverageChoice) map.get(beverageChoice);
    }
	
};

