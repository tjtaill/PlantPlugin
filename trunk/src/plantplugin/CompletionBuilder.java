package plantplugin;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CompletionBuilder {
    private Set<String> particpants = new HashSet<>();
    private Set<String> messages = new HashSet<>();

    public void addParticipant(String participant) {
        particpants.add(participant);
    }

    public void addMessage(String message) {
        messages.add(message);
    }


    public List<String> completeParticipant() {
        return new ArrayList<>( particpants );
    }

    public List<String> completeMessages() {
        return new ArrayList<>(messages);
    }
}
