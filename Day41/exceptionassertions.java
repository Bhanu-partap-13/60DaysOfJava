package Day41;
public class exceptionassertions {
    private int value;

    // Constructor with assertion to check invariant
    public exceptionassertions(int value) {
        assert value > 0 : "Value must be positive"; // Invariant check
        this.value = value;
    }

    // Setter method with assertion
    public void setValue(int newValue) {
        assert newValue > 0 : "New value must be positive"; // Ensuring the condition holds
        this.value = newValue;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        exceptionassertions obj = new exceptionassertions(10);  // ✅ Valid case
        System.out.println("Initial Value: " + obj.getValue());

        obj.setValue(20);  // ✅ Valid case
        System.out.println("Updated Value: " + obj.getValue());

        obj.setValue(-5);  // ❌ This will trigger AssertionError if assertions are enabled (-ea)
    }
}
