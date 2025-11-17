package taller2_arnaldelafuentegallego;

public class Node {

    private Curso c1;
    private Node seg;

    public Node(Curso c1, Node seg) {
        
        this.c1 = c1;
        this.seg = seg;
    }

 

    public Curso getC1() {
        return c1;
    }

    
    public Node getSeg() {
        return seg;
    }

    public void setC1(Curso c1) {
        this.c1 = c1;
    }

    public void setSeg(Node seg) {
        this.seg = seg;
    }
    


   
}
