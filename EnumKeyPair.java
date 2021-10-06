
public enum EnumKeyPair {
    LocalStorage(1,"LocalStorage"),
    GlobalStorage(2,"GlobalStorage");
    private int key;
    private String description;
    EnumKeyPair(int key,String description){
        this.key=key;
        this.description=description;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
class TestEnum{
    public static void main(String[] args) {
        EnumKeyPair pair = EnumKeyPair.GlobalStorage;
        System.out.println(pair.getDescription());
        if(pair.getKey()==2){
            pair.setDescription("Storage of Global");
        }
        System.out.println(pair.getDescription());

    }
}