import java.util.regex.Matcher;
import java.util.regex.Pattern;

// The cortex object is a container for pre-defined inputs and their appropriate responses
// it contains two methods, one for comparing user inputs with the pre-defined inputs, and the other for 
// selecting the correct response if a match is found.
// the class Cortex is extended by InputCortex and Hippocampus

public class Cortex {

    public String[] hear;
    public String[] speak;
    public String cate = null;

   
public Cortex(String[] hear, String[] speak){
    this.hear = hear;
    this.speak = speak;
}



//method for matching user input with pre-defined inputs
public String wernicke(String s){
    String strng = s.toLowerCase();

    for(int i = 0; i<hear.length; i++){
        String temp = hear[i];
        //System.out.println("shit " + temp);

            if(strng.contains(temp))
                return temp;      
    }
    // if no match is found, we then process the hear data and the user input data
    // using the Porter Stemmer algorithm and by removing any and all punctuation
    SpellCheck spell = new SpellCheck();
    String cleanUserInput = spell.check(strng); 


    for(int i = 0; i<hear.length; i++){
        String temp = spell.check(hear[i]);
        //System.out.println("fuck " + temp);
            if(cleanUserInput.contains(temp))
                return temp;      
    }


    return null;
}

// method to select to correct response if a match is found, from the coresponding cortex object
public String chooseWordsWisely (){
    String response;
    int index = (int) (Math.random()*speak.length);
        response = speak[index];
    return response;
}

public String getInput(String s){
    return "";
}



}







