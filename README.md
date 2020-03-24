# Chaty
 chatbot project (cosc310)

All code was developed and tested for the java 13.0.1 runtime environment.
Java files should first be compiled on the users personal machine, once all the files have been compiled run the Chatroom.java file (this is the main class)

For this project, we decided on building a chat bot (conversation agent) capable of talking to a user about books. Our goal is to produce a bot capable of sustaining a casual and informal conversation about books, while also upholding general conversation etiquette; in other words, a robot friend who might be able to recommend a good book! 

The project is broken down as follows:

Chatroom: this is the main class, it creates the chatbot object and interfaces with user using chatbot methods.

Chatbot: this is the fundemental object class, it represents and facilitates our chatbot object by utilizing the cortex class and its two extensions.
Essentially the program works by running the users input against predefined inputs, each array of predefined inputs is associated with an array of responses. The input/output (hear/speak) pairs are cortex objects (cortex, inputcortex, hippocampus), depending on which instance of the cortex class the pair is described as directs how the chatbot computes outputs. For example if the users input contains "i really enjoyed harry potter", the appropriate match is an inputcortex object; therefore two things will happen "harry potter" will be saved to the chatbots memory under the correct category, and two "harry potter" will be utilized in the chatbot's output: "I loved harry potter also".

Cortex: Cortex objects contian the pre-defined inputs as well as their corresponding responses. The Cortex class also contains the methods 
wernicke() and chooseyourwordswisely() for comparing the users input with the predefined inputs and then returning the appropriate response.

InputCortex: this class is a modification of Cortex allowing for CONDITION_STRINGs, ie the users input is immediately used directly in the chatbot's next response. 

Hippocampus: this is another extension of Cortex, and also facilitats CONDTION_STRINGs, however the users input is used to retrieve chatbot memories to be used in the chatbots response. 

Category: this is a static class it simulates memory for the chatbot. It contains an array of book information as well as an arraylist for adding new memories (category objects). The chatbot object can call the static learn() function to add newly created categories to the chatbots repertoire.








(test)