import java.util.Random;
public class Tree {
    private Object info;
    private Tree LTree;
    private Tree RTree;
    int height = 0;
    
    Tree(){
        info = null;
        LTree = null;
        RTree = null;
    }

    Tree(Object info){
        this.info = info;
        LTree = null;
        RTree = null;
    }

    void insert(Object info){
        if(this.info == null){
            this.info = info;
            this.height = 1;
        }
        else{
            int numInfo = (int) info;
            Tree trav = this;
            Tree trav2 = this;
            boolean choose = true;
            int height1 = 0;
            while(trav != null){
                height1++;
                trav2 = trav;
                if((int) trav2.info > numInfo){
                    trav = trav.LTree;
                    choose = true;
                }
                else {
                    trav = trav.RTree;
                    choose = false;
                }
            }
            Tree newTree = new Tree(info);
            if(choose){
                trav2.LTree = newTree;
            }
            else {
                trav2.RTree = newTree;
            }
            if(height1 > height) height = height1;
        }
    }

    void preorder(Tree tree){
        if(tree == null){
            System.out.print("- ");
            return;
        }
        System.out.print(tree.info+" ");
        if(!(tree.LTree == null && tree.RTree == null)){
            System.out.print("[ ");
            preorder(tree.LTree);
            preorder(tree.RTree);
            System.out.print("] ");
        }
    }

    int getHeight(){
        return height;
    }

    String search(Object info){
        String result = "";
        Tree trav = this;
        Tree trav2 = this;
        while(trav2.info != info && trav != null){
            trav2 = trav;
            if((int) trav.info > (int) info){
                result += "L";
                trav = trav.LTree;
            }
            else {
                result += "R";
                trav = trav.RTree;
            }
        }
        String f = (int) trav2.info == (int) info ? "Found!" : "Not Found!";
        result = result.length() == 0? "" : result.substring(0, result.length()-1);
        System.out.print(info + ": (" + result + ") ");
        return f;
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        Random rand = new Random();
        int y = 10+rand.nextInt(11);
        System.out.println("--- Random number [" + y + "] ---");
        for(int i=0; i<y; i++){
            int x = rand.nextInt(50)+1;
            tree.insert(x);
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.println("-- Tree (Height=" + tree.getHeight() + ") ---");
        tree.preorder(tree);

        System.out.println("\n--- Search ---");
        String find = "Not Found!";
        while(!find.equals("Found!")){
            find = tree.search(rand.nextInt(50)+1);
            System.out.println(find);
        }
    }
}
