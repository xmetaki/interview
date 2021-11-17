package q04;

import java.util.LinkedList;
import java.util.Queue;

public class DCQueue {
    private Queue<DCQueueNode> catQueue;
    private Queue<DCQueueNode> dogQueue;
    private Long count;

    public DCQueue() {
        this.catQueue = new LinkedList<DCQueueNode>();
        this.dogQueue = new LinkedList<DCQueueNode>();
        this.count = 0L;
    }

    public void add(Pet pet) {
        if (pet.getPetType().equals("dog")) {
            this.dogQueue.add(new DCQueueNode(pet,this.count++));
        } else if (pet.getPetType().equals("cat")) {
            this.catQueue.add(new DCQueueNode(pet, this.count++));
        } else {
            throw new RuntimeException("Not a dog or cat");
        }
    }

    public Pet pollAll() {
        if (!dogQueue.isEmpty() && !catQueue.isEmpty()) {
            if (dogQueue.peek().getCount() > catQueue.peek().getCount()) return dogQueue.poll().getPet();
            else return catQueue.poll().getPet();
        } else if (!dogQueue.isEmpty()) {
            return dogQueue.poll().getPet();
        } else if (!catQueue.isEmpty()) {
            return catQueue.poll().getPet();
        }
        throw  new RuntimeException("队列为空");
    }

    public Dog pollDog() {
        if (!dogQueue.isEmpty()) return (Dog) dogQueue.poll().getPet();
        else throw new RuntimeException("Sorry we don't have any dog");
    }

    public Cat pollCat() {
        if (!catQueue.isEmpty()) return (Cat) catQueue.poll().getPet();
        else throw new RuntimeException("Sorry we don't have any cat");
    }

    public boolean isEmpty() {
        return dogQueue.isEmpty() && catQueue.isEmpty();
    }

    public boolean isDogEmpty() {
        return dogQueue.isEmpty();
    }

    public boolean isCatEmpty() {
        return catQueue.isEmpty();
    }

}
