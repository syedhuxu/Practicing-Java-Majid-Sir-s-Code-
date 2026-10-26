package pk17;

public class Mainn {

    // 'throws' (plural) is the warning label in the signature
    public static void checkVotingAge(int age) throws InvalidAgeException {
        if (age < 18) {
            // 'throw' (singular) is the action of triggering the error
            throw new InvalidAgeException("Age is under 18. Cannot vote.");
        }
        System.out.println("You are eligible to vote!");
    }

    public static void main(String[] args) {
        try {
            checkVotingAge(16); // This breaks our rule
        } catch (InvalidAgeException e) {
            // e.getMessage() prints the string we passed into throw new...
            System.out.println("Error: " + e.getMessage());
        }
    }
}
