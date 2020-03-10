import java.util.ArrayList;

public class Category {
    
    public static ArrayList<Category> memory = new ArrayList<>();
    public String type = "";
    public String select = "";

    public Category(String type, String select){
        this.type = type;
        this.select = select;
    }

    public static void learn(Category c){
        memory.add(c);
    }

    public static String getCat(String s){
        String repl = "...On second thought I dont know...";
        for(int i = 0; i<memory.size(); i++){
             Category c = (Category) memory.get(i);
             if(c.type.equals(s))
                repl =  c.select;
        }
        return repl;
    }


}