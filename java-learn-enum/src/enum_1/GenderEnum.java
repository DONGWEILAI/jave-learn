package enum_1;

public enum GenderEnum implements BaseEnum{
    FEMALE(0, "女"),
    MALE(1, "男");

    private int value;
    private String description;

    GenderEnum(int value, String description) {
        this.value = value;
        this.description = description;
    }

    @Override
    public int value() {
        return value;
    }

    @Override
    public String description() {
        return description;
    }
}
