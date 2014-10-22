// Assignment 3, Morse Code Client/Server
// Name: Cory Siebler
// StudentID: 1000832292
// Lecture Topic: 11 - Design Patterns
// Description: 
package memento;

/**
 *
 * @author csiebler
 */
public class Originator {

    private String state;
    
    /**
     * Set the state for the value of the Originator.
     * 
     * @param state underlying value for the Originator
     */
    public void set(String state) {
        System.out.println("Originator: Setting state to " + state);
        this.state = state;
    }

    /**
     * Saves the current state to a Memento.
     * 
     * @return Saved state
     */
    public Memento saveToMemento() {
        System.out.println("Originator: Saving to Memento.");
        return new Memento(state);
    }

    /**
     * Loads the state from a previous Memento.
     * 
     * @param memento Memento from a previous state
     */
    public void restoreFromMemento(Memento memento) {
        state = memento.getSavedState();
        System.out.println("Originator: State after restoring from Memento: " + state);
    }

    /**
     * Static class to store a state
     */
    public static class Memento {

        private final String state;

        /**
         * Constructor
         * 
         * @param state Stores the state as a final class field
         */
        public Memento(String state) {
            this.state = state;
        }

        /**
         * Retrieves a saved state from a Memento.
         * 
         * @return saved state
         */
        public String getSavedState() {
            return state;
        }
    }
}


