
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Chatbot {

    private Cortex[] db;
    public static final String CONDITON_STRING = "<condition>";
    String[] defres = {"thats crazy...", "okay...", "sorry what?.."};

    public Chatbot(){
        fillVoc();
        Category zero = new Category("zero", "who am i");
        Category.learn(zero);
        //Category one = new Category("name", "bill");
        //Category.learn(one);
        
    }

    private void fillVoc(){
        db = new Cortex[8];
        int i = 0;
        

        {
            String[] hear = {"goodbye", "later", "bye"};
            String[] speak = {"goodbye", "auf wiedersehen", "bye..."};
            Cortex neo = new Cortex(hear, speak);
            db[i++] = neo;
        }

        {
            String[] hear = {"hey", "hi", "hello"};
            String[] speak = {"gooday", "holla", "guten tag"};
            Cortex neo = new Cortex(hear, speak);
            db[i++] = neo;
        }

        {
            String[] hear = {"sad", "upset", "depressed"};
            String[] speak = {"cheer up, things will get better", "Im sorry you are feeling that way"};
            Cortex neo = new Cortex(hear, speak);
            db[i++] = neo;
        }

        {
            String[] hear = {"happy", "i am feeling great", "so good"};
            String[] speak = {"excellent! I am happy for you", "that must be nice"};
            Cortex neo = new Cortex(hear, speak);
            db[i++] = neo;
        }

        {
            String[] hear = {"new", "how are you", "how is it"};
            String[] speak = {"I am well thank you, how are you?", "Im fine, I am perfect, everyday and in everway I am getting better and better... and yourself?"};
            Cortex neo = new Cortex(hear, speak);
            db[i++] = neo; 
        }

         
        {
            String[] hear = {"my name is", "you can call me eva"};
            String[] speak = {"hello" + CONDITON_STRING, CONDITON_STRING + "!? that is a funny name", "hello" + CONDITON_STRING + "my name is bot"};
            String cate = "name";
            InputCortex neo = new InputCortex(hear, speak, cate);
            db[i++] = neo;
        }

        {
            String[] hear = { "do you like"};
            String[] speak = {"I think " + CONDITON_STRING + "is amazing!", "No I despise" + CONDITON_STRING, "I have never heard of" + CONDITON_STRING};
            String cate = "pref";
            InputCortex neo = new InputCortex(hear, speak, cate);
            db[i++] = neo;
        }

        {
            String[] hear = {"do you remember my name", "what is my name", "do you know who i am"};
            String[] speak = {"you are " + CONDITON_STRING, "yes I remember you " + CONDITON_STRING};
            Hippocampus neo = new Hippocampus(hear, speak);
            db[i++] = neo;

        }

       


      

     
    }

    public String ear(String s){
        int index = (int) (Math.random()*defres.length);
        String response = defres[index];
        s = " " + s + " ";
        for(int i = 0; i<db.length; i++){
            Cortex neo = db[i];
            String temp = neo.wernicke(s);
            if(temp != null){
                response = neo.chooseWordsWisely();
                response = response.replace(CONDITON_STRING, neo.getInput(s));
                if(neo.cate != null){
                    String select = neo.getInput(s);
                    Category t = new Category(neo.cate, select);
                    Category.learn(t);
                }
                break;
            }
        }
        return response;
    }



}






//for(Cortex neo: db){
    //String temp = neo.wernicke(s);
    //if(temp != null){
        //response = neo.chooseWordsWisely();
        //break;
    //}
//}
 

    


        

    
    
    

