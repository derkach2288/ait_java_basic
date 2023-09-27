import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Robot {
   List<Command> commands;

    public Robot(String commandString) {
        this.commands = createComandsList(commandString);
    }

    private List<Command> createComandsList(String commandString) {
        Deque<Command> queue = new LinkedList<>();

        for (String commandName : commandString.split("")){
            try {
                Command command = Command.valueOf(commandName); // "Ю" -> Command.Ю
                if (!queue.isEmpty() && command.isOpposite(command)){
                    queue.removeLast();
                } else {
                    queue.add(command);

                }

            } catch (IllegalArgumentException e){} // заглушили exception

        }

        return (List)queue;
    }

    public void printCommands(){
        int counter = 0;
        for (Command command : commands){
            System.out.println(++counter + " " + command.getPathDysplayString());
        }
    }
}
