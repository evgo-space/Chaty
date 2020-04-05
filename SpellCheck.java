// this class is used by the cortex when the user input yeilds no results
// the input is placed in this class, punctuation is removed, and the 
// porter stemming algorithm is used to clean the data. 


public class SpellCheck{ 

    String cleanInput; 

    public SpellCheck(){
        
    }

    public String check(String s) {
        cleanInput = ""; 

        //removing all punctuation from the string
        s = s.replaceAll("\\p{Punct}", "");
        System.out.println(s);

        // creating our new stemming object 
        Stemmer stemmer = new Stemmer();
        // splitting our string into specific words 
        String[] words = s.split(" ");

        //itterating through all the words in the string array and stemming them
        for(int k = 0 ; k<words.length ; k++){

            for (int i = 0; i< words[k].length(); i++ ){ 
                stemmer.add(words[k].charAt(i));
            }
            stemmer.stem();
            cleanInput += stemmer.toString() + " ";
        }

        if (cleanInput != "" )
            return cleanInput.trim();

        return null; 
    }

    //testing the class
    public static void main(String[] arg){ 


        String words = "what can' i @calling you"; 
        SpellCheck spell = new SpellCheck();
        Stemmer s = new Stemmer();


        System.out.println("It worked: " + spell.check(words));
        
        



    }


}