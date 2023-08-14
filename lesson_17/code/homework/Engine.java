package homework;

public class Engine {
    double power;
    String enginesType;

public Engine(double power, String enginesType){
    this.power=power;
    this.enginesType=enginesType;
    }

public String toString(){
    return " Engine power: " + power + " Engine's type: " + enginesType;
}
public String start(){
    return "Engine is started";
}

public String stop(){
    return "Engine is stopped";
}
}
