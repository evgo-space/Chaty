import java.util.ArrayList;

// the category class is to simulate memory for the chatbot, every category object is identifiable with they key "type" parameter
// so that the respective memory information can be accessed 
// the chat bot is initialized with book information within the books array, memories created from user input is saved to the memory arraylist
public class Category {

    //the chatbot is initialized with book memories
    public static Category sf = new Category("sci-fi", "Dune");
    public static Category f = new Category("fantasy", "Lord of the Rings");
    public static Category h = new Category("history", "A Distant Mirror");
    public static Category r = new Category("romantic", "Romoe and Juliet");
    public static Category c = new Category("classics", "Utopia by Thomas More");
    public static Category nf = new Category("non-fiction", "Silent Sping");
    public static Category fi = new Category("fiction", "Beware of Pity");
    
    
    public static ArrayList<Category> memory = new ArrayList<>();
    public static Category[] books = {sf, f, h, r, c, nf, fi};
    
    
    public String type = "";
    public String select = "";

    public Category(String type, String select){
        this.type = type;
        this.select = select;
    }

    //this function allows the ear() method to pass new categories to be saved to the bots memory
    // this takes places for InputCortex matches 
    public static void learn(Category c){
        memory.add(c);
    }

    //the getCat() method is for searching the bots memory (ArrayList<Category>) and returning matched category information (select)
    public static String getCat(String s){
        String repl = "...On second thought I dont know...";
        for(int i = 0; i<memory.size(); i++){
             Category c = (Category) memory.get(i);
             if(c.type.equals(s))
                repl =  c.select;
        }
        return repl;
    }

    // this function is for searching the chatbots book memory
    public static String getBooks(String s){
        String ret = "The Bibl... just kidding thats way too long";
        for(Category c: books){
            if(c.type.equals(s)){
                ret =  c.select;
            }
        }
        return ret;
    }


}