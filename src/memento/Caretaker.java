// Assignment 3, Morse Code Client/Server
// Name: Cory Siebler
// StudentID: 1000832292
// Lecture Topic: 11 - Design Patterns
// Description: 
package memento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author csiebler
 */
public class Caretaker {

    public static void main(String[] args) {
        // Initialize a List to track the Memento
        List<Originator.Memento> savedStates = new ArrayList<>();

        // Initialize an Originator to hold the internal state
        Originator originator = new Originator();
        
        // Change the state of the originator and store the states
        originator.set("State1");
        savedStates.add(originator.saveToMemento());
        originator.set("State2");
        savedStates.add(originator.saveToMemento());
        originator.set("State3");
        savedStates.add(originator.saveToMemento());

        originator.restoreFromMemento(savedStates.get(0));
        originator.restoreFromMemento(savedStates.get(1));
        originator.restoreFromMemento(savedStates.get(2));
    }
    
}
