package Lesson_4;

import java.util.ArrayList;
import java.util.List;

class MainTopObject{
    static List<TopObject> topObjects = new ArrayList<>();

    public static void main(String[] args) {

        topObjects.add(new TopObject(1, null));
        topObjects.add(new TopObject(2, "1"));
        topObjects.add(new TopObject(3, "2"));
        topObjects.add(new TopObject(4, "1"));
        topObjects.add(new TopObject(5, null));
        topObjects.add(new TopObject(6, "5"));
        topObjects.add(new TopObject(7, null));

        for (TopObject obj : topObjects) {
            if (obj.hasParent()){
                setChild(obj);
            }
        }

        for (TopObject obj : topObjects) {
            System.out.println("Parent: " + obj.getId() + " Children: ");
            obj.showChildren();
        }
    }

    private static void setChild(TopObject topObject) {
        int parentId;
        try{
            parentId = Integer.parseInt(topObject.getParentId());
        } catch (NumberFormatException e){
            System.out.println("Unknown parentId");
            return;
        }

        for (TopObject object : topObjects) {
            if(object.getId() == parentId){
                object.setChild(topObject);
            }
        }

    }

}

class TopObject {
    private int id;
    private String parentId;

    public ArrayList<TopObject> getChildren() {
        return children;
    }

    private ArrayList<TopObject> children = new ArrayList<>();

    TopObject(int id, String parentId){
        this.id = id;
        this.parentId = parentId;
    }

    public int getId() {return id;}

    public String getParentId() {return parentId;}

    public boolean hasParent(){
        if(this.parentId != null){
            return true;
        }
        return false;
    }

    public void showChildren() {
        if(children.isEmpty()){
            System.out.println("No child objects");
            return;
        }
        for (TopObject child : children) {
            System.out.println(child.getId());
        }
    }

    public void setChild(TopObject child) {

        this.children.add(child);
    }
}
