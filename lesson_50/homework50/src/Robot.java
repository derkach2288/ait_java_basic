public enum Robot {
    С{
        public void printCommand(){
            System.out.println("север");
        }
    },
    Ю{
        public void printCommand(){
            System.out.println("юг");
        }
    },
    З{
        public void printCommand(){
            System.out.println("запад");
        }
    },
    В{
        public void printCommand(){
            System.out.println("восток");
        }
    };

    private int count;

    public abstract void printCommand();
    public void printForAllCommands(){
//        System.out.print(++count + ". шаг на ");
        System.out.print(count + ". шаг на ");
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
