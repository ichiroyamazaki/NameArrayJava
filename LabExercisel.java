package LabExercisel;

public class LabExercisel {
    public static void main(String[] args) {
        int favenum = 1; // Favorite number
        String faveCartChar = "Yasuo"; // Favorite cartoon character
        char mi = 'P'; // Middle initial
        char[] nickNameArray = {'i', 'c', 'h', 'i'}; // Nickname array

        // Print the favorite number
        System.out.println(favenum + " is my favorite number.");
        
        // Print the favorite cartoon character
        System.out.println("I love " + faveCartChar + ".");
        
        // Print the full name with middle initial
        System.out.println("My name is Ichiro " + mi + " Yamazaki.");
        
        // Print the nickname
        System.out.print("You can call me ");
        System.out.print(nickNameArray[0]);
        System.out.print(nickNameArray[1]);
        System.out.print(nickNameArray[2]);
        System.out.print(nickNameArray[3]);
        System.out.println("."); // Add a period to complete the nickname sentence
    }
}
