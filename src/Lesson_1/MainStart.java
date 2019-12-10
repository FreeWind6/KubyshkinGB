package Lesson_1;

class MainStart{
    public static void main(String[] args) {
        Box box1 = new Box("box1", 10);
        Box box2 = new Box("box2", 20);
        Box box3 = new Box("box3", 30);
        Tools tools = new Tools("hummer");
        box1.startTest(tools);
        box2.startTest(tools);
        box3.startTest(tools);

//        box1.name = "asd";
    }
}

class Box {
    protected String name;
    int weight;

    public Box(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    void startTest(Tools tools) {
        tools.infoToolsAndBox(this);
    }

}

class Tools {
    public Tools(String tools) {
        this.tools = tools;
    }

    String tools;
    void infoToolsAndBox(Box box) {
        System.out.println(tools + " "
                + box.name + " "
                + box.weight);
    }
}