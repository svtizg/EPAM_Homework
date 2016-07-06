/**
 * Created by SV-PC on 06.07.2016.
 */
public class MyArray {

    private int  size       = 0;
    private Node firstNode  = null;
    private Node lastNode   = null;


   // получение количества хранимых элементов
    public int getSize(){
        return  size;
    }

    //  вставка в конец
    public void add(int data){
        Node node = new Node(data);
        if(!isEmpty()) {
            lastNode.next = node;
        } else {
            firstNode = node;
        }
        lastNode = node;
        size++;
    }
    //  вставка по индексу
    public void add(int data, int index){
        if (index==0){
            Node currentNode = new Node(data, firstNode);
            firstNode = currentNode;
        }
        else if(index<size){
            Node prevNode = getNode(index-1);
            Node currentNode = new Node(data, prevNode.next);
            prevNode.next = currentNode;
        }
        else {
            System.out.println("Invalid index");
        }
        size++;
    }

    // вставка в конец уникального значения
    public void addUnique(int data){
        if (isUnique(data)){
            add(data);
        }
    }
    //доступ к элементу по индексу
    public int getValue(int index){
        if (getNode(index)!=null){
            return getNode(index).data;
        }
        else {
            System.out.println("Invalid index");
            return -1;
        }
    }
    // удаление элемента по индексу
    public void delete(int index){
        if (index == 0) {
            firstNode = getNode(1);
        } else if(index ==size){
            lastNode = getNode(size-2);
        } else {
            Node current = getNode(index-1);
            current.next = current.next.next;
        }
        size--;
    }

    // проверка на пустоту
    private boolean isEmpty(){
        return size ==0;
    }
    // получение вершины по индексу
    private Node getNode(int index){
        Node current = firstNode;
        if (index<size){
            int i = 0;
            while(i!=index){
                current = current.next;
                i++;
            }
        }else{
            current = null;
        }return current;
    }

    // проверка на уникальность
    private boolean isUnique(int data){
        int i = 0;
        boolean unique = true;
        Node current = firstNode;
        while(i<size){
            if(current.data!=data){
                current = current.next;
                i++;
            }
            else{
                unique=false;
                break;
            }

        }
        return unique;
    }

    // вложенный класс Node
    private class Node{
        private int data;
        private Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }

    }
}


