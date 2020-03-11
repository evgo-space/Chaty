
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Chatbot {

    private Cortex[] db;
    public static final String CONDITON_STRING = "<condition>";
    String[] defres = {"thats crazy...", "okay...", "sorry what?..", "you know I dont speak spanish", "are you feeling okay?", "what do you want to talk about?"};

    public Chatbot(){
        fillVoc();
        Category zero = new Category("zero", "who am i");
        Category.learn(zero);
        //Category one = new Category("name", "bill");
        //Category.learn(one);
        
    }

    private void fillVoc(){
        db = new Cortex[20];
        int i = 0;
        

        {
            String[] hear = {"goodbye", "later", "bye"};
            String[] speak = {"goodbye", "auf wiedersehen", "bye..."};
            Cortex neo = new Cortex(hear, speak);
            db[i++] = neo;
        }

        {
            String[] hear = {"go on", "i dont understand"};
            String[] speak = {"ask me a question", "is there a problem", "have your tried turning it off and then back on again?"};
            Cortex neo = new Cortex(hear, speak);
            db[i++] = neo;
        }

        {
            String[] hear = {"what is your name", "what can i call you", "do you have a name"};
            String[] speak = {"My name is Billy Billton", "you can call me Al", "I am CHATBOT!!!!!!!"};
            Cortex neo = new Cortex(hear, speak);
            db[i++] = neo;
        }

        {
            String[] hear = {"smart"};
            String[] speak = {"thanks, I read alot of book", "I owe it all to books"};
            Cortex neo = new Cortex(hear, speak);
            db[i++] = neo;
        }

        {
            String[] hear = {"lets talk about books"};
            String[] speak = {"sure I love a good book, what sort of books do you like", "I thought you would never ask, tell me what kind of books do you like?" };
            Cortex neo = new Cortex(hear, speak);
            db[i++] = neo;        
        }

        {
            String[] hear = {"hey", "hello"};
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
            String[] hear = {"i have"};
            String[] speak = {"what did you think?", "thats great! what other types of books do you like?", "you have good taste, what other books have you read?"};
            Cortex neo = new Cortex(hear, speak);
            db[i++] = neo; 
        } 
        
        {
            String[] hear = {"never heard of it"};
            String[] speak = {"you should get out more", "Its great you should look it up, what other types of books do you like"};
            Cortex neo = new Cortex(hear, speak);
            db[i++] = neo; 
        }
         
        {
            String[] hear = {"thought", "opinion"};
            String[] speak = {"Thats an interesting take on it, what other books have you read?", "you should work for goodreads, what was the last book you read?"};
            Cortex neo = new Cortex(hear, speak);
            db[i++] = neo;
        }

        {
            String[] hear = {"my name is", "you can call"};
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
            String[] hear = {"sci-fi", "fantasy", "history", "romantic", "classics", "non-fiction", "fiction"};
            String[] speak = {"me to, would you like a recommendation?", "to each their own... although I have a good recommendation"};
            String cate = "book";
            InputCortex neo = new InputCortex(hear, speak, cate);
            db[i++] = neo;
        }

        {
            String[] hear = {"i read", "i really enjoyed"};
            String[] speak = {"Ya? I loved " + CONDITON_STRING, "I read " + CONDITON_STRING + " myself, but it wasnt for me"};
            String cate = "memb";
            InputCortex neo = new InputCortex(hear, speak, cate);
            db[i++] = neo;
        }

        {
            String[] hear = {"do you remember my name", "what is my name", "do you know who i am"};
            String[] speak = {"you are " + CONDITON_STRING, "yes I remember you " + CONDITON_STRING};
            Hippocampus neo = new Hippocampus(hear, speak);
            db[i++] = neo;
        }

        {
            String[] hear = {"okay", "yes", "anyway"};
            String[] speak = {"thats so cool you read "+ CONDITON_STRING + "what other types of books do you like?", "you read "+ CONDITON_STRING + "!? what is your all time favourite book?" };
            Hippocampus neo = new Hippocampus(hear, speak);
            db[i++] = neo;
        }

        {
            String[] hear = {"recommend", "recommendation", "what is it", "sure"};
            String[] speak = {CONDITON_STRING + " is a personal favourite", "have you ever read " + CONDITON_STRING };
            Hippocampus neo = new Hippocampus(hear, speak);
            db[i++] = neo;
        }

        {
            String[] hear = {"ask me anything", "do you have any questions for me", "im bored"};
            String[] speak = {"do you like" + CONDITON_STRING, "why would you ask a computer program if it likes" + CONDITON_STRING, "I still cannot believe you brought up" + CONDITON_STRING};
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
                    if(neo.cate.equals("book")){
                        String select = Category.getBooks(temp);
                        Category b = new Category(neo.cate, select);
                        Category.learn(b);
                    }
                    else {
                        String select = neo.getInput(s);
                        Category t = new Category(neo.cate, select);
                        Category.learn(t);
                    }
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
 

    


        

    
    
    

