import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

// InputCortex is a modification of the cortex class with one main additional feature when there is a match.
// InputCortex allows for specific user inputs to be parsed so the chatbot can either immediately reply with the parsed info or save it to memory
// this is done with the getInput() function

public class InputCortex extends Cortex {


     
public InputCortex(String[] hear, String[] speak, String cate){
   super(hear,speak);
   this.cate = cate;

}



//method for matching user input with correct bot output
@Override
public String wernicke(String s){
    String strng = s.toLowerCase();
    for(int i = 0; i<super.hear.length; i++){
        String temp = super.hear[i];
            if(strng.contains(temp)){
                return temp;
            }      
    }
    return null;
}

@Override
public String chooseWordsWisely (){
    String response;
    int index = (int) (Math.random()*super.speak.length);
        response = super.speak[index];
    return response;
}

// getInput() takes the users input as a string, compares it with several other strings to locate the wanted substring contained in the 
// users input, and then returns the substring to the ear method where it can be used immediately in a reply or saved to the chatbots memory(learn())
@Override
public String getInput(String s){
    if(s.contains("is")){
        return s.substring(s.lastIndexOf("is") + 2);
        //Category cat = new Category("name", s.substring(s.lastIndexOf("is") + 2));
        //memory.add(cat);
    }
    if(s.contains("me")){
        return s.substring(s.lastIndexOf("me") + 2);
        //Category cat = new Category("name", s.substring(s.lastIndexOf("am") + 2));
        //memory.add(cat);
    }
    if(s.contains("ed")){
        return s.substring(s.lastIndexOf("ed") + 2);
        //Category cat = new Category("name", s.substring(s.lastIndexOf("am") + 2));
        //memory.add(cat);
    }
    if(s.contains("ad")){
        return s.substring(s.lastIndexOf("ad") + 2);
        //Category cat = new Category("name", s.substring(s.lastIndexOf("am") + 2));
        //memory.add(cat);
    }
    if(s.contains("like")){
        return s.substring(s.lastIndexOf("ke") + 2);
    }
    else{return "";}
}





}