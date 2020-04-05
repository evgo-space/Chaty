import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

// Hippocampus class is a modification to the cortex object.
// when an input matches with Hippocampus instance, previously saved user input information is prepared to be used in a response

public class Hippocampus extends Cortex {

public String cate;
     
public Hippocampus(String[] hear, String[] speak){
   super(hear,speak);

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

// the getInput() method in this class takes the users input and compares it against other pre-defined strings to later call the
// correct category type, in doing so the appropriate information can be returned to form a "smart" response
//eg if the users input contains "name", getInput() will call the getCat() method passing the category "name" so that "bob" will be returned.

@Override
public String getInput(String s){
    if(s.contains("name")){
        return Category.getCat("name");
    }
    if(s.contains("who i am")){
        return Category.getCat("name");
    }
    if(s.contains("recommend")){
        return Category.getCat("books");
    }
    if(s.contains("recommendation")){
        return Category.getCat("books");
    }
    if(s.contains("it")){ 
        return Category.getCat("books");
    }
    if(s.contains("sure")){ 
        return Category.getCat("books");
    }
    if(s.contains("okay")){
        return Category.getCat("memb");
    }

    if(s.contains("yes")){
        return Category.getCat("memb");
    }
    if(s.contains("anyway")){
        return Category.getCat("memb");
    }
    if(s.contains("crazy")){
        return Category.getCat("spmemb");
    }
    if(s.contains("way")){
        return Category.getCat("spmemb");
    }
    if(s.contains("wow")){
        return Category.getCat("spmemb");
    }
    if(s.contains("sk")){
        return Category.getCat("pref");
    }
    if(s.contains("questions")){
        return Category.getCat("pref");
    }
    if(s.contains("bored")){
        return Category.getCat("pref");
    }
    if(s.contains("rumor")){
        return Category.getCat("sport");
    }
   
    else{return "Because I am not a sentient being I will never truly die";}
}





}