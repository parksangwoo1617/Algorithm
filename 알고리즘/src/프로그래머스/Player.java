package 프로그래머스;

import java.util.Arrays;

class Player {
    public String player(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i = 0; i < completion.length; i++) {
            if(!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        return participant[participant.length - 1];
    }
}