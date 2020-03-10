import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;


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
    if(s.contains("like")){
        return s.substring(s.lastIndexOf("ke") + 2);
    }
    else{return "";}
}





}